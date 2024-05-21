/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connect.ConnectPostgres;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Hakim
 */
public class Embauche {  
        int id;
        String nom;
        String prenom;
        String date;
        double th;
        String embauche;
        int expe;
//
        String nomExpertise ;
        int annee;
        int coeff;

    public Embauche() {
    }

//    public Embauche(int id, String nomExpertise, int annee, int coeff) {
//        this.id = id;
//        this.nomExpertise = nomExpertise;
//        this.annee = annee;
//        this.coeff = coeff;
//    }

    public String getNomExpertise() {
        return nomExpertise;
    }

    public void setNomExpertise(String nomExpertise) {
        this.nomExpertise = nomExpertise;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getCoeff() {
        return coeff;
    }

    public void setCoeff(int coeff) {
        this.coeff = coeff;
    }
        
    public int getExpe() {
        return expe;
    }

    public void setExpe(int expe) {
        this.expe = expe;
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getTh() {
        return th;
    }

    public void setTh(double th) {
        this.th = th;
    }

    public String getEmbauche() {
        return embauche;
    }

    public void setEmbauche(String embauche) {
        this.embauche = embauche;
    }

//    public Embauche(int id, String nom, String prenom, String date, double th, String embauche) {
//        this.id = id;
//        this.nom = nom;
//        this.prenom = prenom;
//        this.date = date;
//        this.th = th;
//        this.embauche = embauche;
//    }

    public Embauche(int id, String nom, String prenom, String date, double th, String embauche, int expe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.date = date;
        this.th = th;
        this.embauche = embauche;
        this.expe = expe;
    }
    
    public  static void insertEmbauche(String nom,String prenom,String dtn,String dateEmbauche,double sal) throws Exception{
        String sql = "insert into embauche(nom,prenom,dtn,tauxh,dateembauche) values('"+nom+"','"+prenom+"','"+dtn+"',"+sal+",'"+dateEmbauche+"')";
        ConnectPostgres.executeUpdate(sql);
    }
    public void getExpertise() throws Exception{
     Connection c = ConnectPostgres.connect();
     double coeff = 0;
     try {
            String sql = "select * from  expertise where annee <="+getExpe()+" order by id desc limit 1 ";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                setNomExpertise(r.getString("nom"));
                setAnnee(r.getInt("annee"));
                coeff  = r.getInt("coeff");                
            }
            r.close();
            s.close();
            c.close();
            setTh(coeff*getTh());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
//     return getTh();
    }
    public  Vector<Embauche> getAllEmployerAndExpertise() throws Exception{
        Vector<Embauche> v  =new Vector<Embauche>();
        Connection c = ConnectPostgres.connect();
        
            try {
            String sql = "select * from  v_getExpertiseEmployer";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                Embauche e = new Embauche(r.getInt("id"), r.getString("nom"),r.getString("prenom"),r.getString("dtn"), r.getDouble("tauxh"),r.getString("dateembauche"),r.getInt("expe"));
                e.getExpertise();
                v.add(e);      
           }
            r.close();
            s.close();
            c.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return v;
    }
        
}
