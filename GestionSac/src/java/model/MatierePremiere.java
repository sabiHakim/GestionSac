/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import connect.ConnectPostgres;
import java.util.ArrayList;

/**
 *
 * @author Tafita
 */
public class MatierePremiere {
    int id;
    String nom;
    float prix ;

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    
     public  static int CompteM()throws Exception{
      Connection c = ConnectPostgres.connect();
    try{
      String sql = "select count(id)   from mp";
      Statement s = c.createStatement();
      ResultSet r = s.executeQuery(sql);
       while(r.next()){
           return r.getInt("count");
            }
      
            r.close();
            s.close();
            c.close();
    }catch(Exception ex){ex.getMessage();}
 
    return 1;
    }
    public void insertMatierePremiere(String nom,float prix)throws Exception{
        String sql = "insert into mp(nom,pu) values ('"+nom+"',"+prix+")";
        ConnectPostgres.executeUpdate(sql);
    }
    
    public ArrayList<MatierePremiere> getAllMatierePremiere()throws Exception{
        Connection c = ConnectPostgres.connect();
        ArrayList<MatierePremiere> result = new ArrayList<MatierePremiere>();
        try {
            String sql = "select * from mp";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                result.add(new MatierePremiere(r.getInt("id"),r.getString("nom"),r.getFloat("pu")));
            }
            r.close();
            s.close();
            c.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public  static MatierePremiere getMatierePremiere(int id) throws Exception{
        MatierePremiere m = new MatierePremiere();
        String sql = "select nom from mp where id = "+ id;
        try {
            Connection c = ConnectPostgres.connect();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
             while(r.next()){
              m.setNom(r.getString("nom"));

            }
            r.close();
            s.close();
            c.close();
            return m;
        }
        catch (Exception e) {
           throw e;
        }
//        return null;
    }
    
    

    public MatierePremiere() {
    }

    public MatierePremiere(int id, String nom,float prix) {
        setId(id);
        setNom(nom);
        setPrix(prix);
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
    
    
}
