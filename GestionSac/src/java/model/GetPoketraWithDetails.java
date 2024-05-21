/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connect.ConnectPostgres;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author Hakim
 */
public class GetPoketraWithDetails {
    int id;
    String nomP;
    String nomL;
    String Taille;
    int idm;
    String nmp;
    int qte;
    float prix;

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }
    
    public static ArrayList<GetPoketraWithDetails> Recherche(String mp)throws Exception{
                Connection c = ConnectPostgres.connect();
                ArrayList<GetPoketraWithDetails> result = new ArrayList<GetPoketraWithDetails>();
                  try {
                        String sql = "select * from getPoketraWithDetails where matiere_premiere_nom ='"+ mp +"'";
                        Statement s = c.createStatement();
                        ResultSet r = s.executeQuery(sql);
                        while(r.next()){
                            result.add(new GetPoketraWithDetails(r.getInt("poketra_id"),r.getString("type_nom"),r.getString("look_nom"),r.getString("taille_nom"),r.getInt("idm"),r.getString("matiere_premiere_nom"),r.getInt("qte"),r.getFloat("pu_mp")));
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
        public static ArrayList<GetPoketraWithDetails> getAllPoketraD()throws Exception{
                Connection c = ConnectPostgres.connect();
                ArrayList<GetPoketraWithDetails> result = new ArrayList<GetPoketraWithDetails>();
                  try {
                        String sql = "select * from getPoketraWithDetails";
                        Statement s = c.createStatement();
                        ResultSet r = s.executeQuery(sql);
                        while(r.next()){
                            result.add(new GetPoketraWithDetails(r.getInt("poketra_id"),r.getString("type_nom"),r.getString("look_nom"),r.getString("taille_nom"),r.getInt("idm"),r.getString("matiere_premiere_nom"),r.getInt("qte"),r.getFloat("pu_mp")));
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
//      public static ArrayList<GetPoketraWithDetails> RechercheP(String pf,float min, float max)throws Exception{
//                Connection c = ConnectPostgres.connect();
//                ArrayList<GetPoketraWithDetails> result = new ArrayList<GetPoketraWithDetails>();
//                  try {
//                        String sql = "select * from getPoketraWithDetails where type_nom ='"+ pf +"' and  pu_mp BETWEEN "+min+ " AND "+ max+" ";
//                        Statement s = c.createStatement();
//                        ResultSet r = s.executeQuery(sql);
//                        while(r.next()){
//                        result.add(new GetPoketraWithDetails(r.getInt("poketra_id"),r.getString("type_nom"),r.getString("look_nom"),r.getString("taille_nom"),r.getInt("idm"),r.getString("matiere_premiere_nom"),r.getInt("qte"),r.getFloat("pu_mp")));
//                        }
//                        r.close();
//                        s.close();
//                        c.close();
//        } 
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//              return result;
//   }
//      getdetailByidTypes 
            public static ArrayList<GetPoketraWithDetails> getdetailByidTypes (int id)throws Exception{
                Connection c = ConnectPostgres.connect();
                ArrayList<GetPoketraWithDetails> result = new ArrayList<GetPoketraWithDetails>();
                  try {
                        String sql = "select * from getPoketraWithDetails where idtypes ="+ id +" ";
                        Statement s = c.createStatement();
                        ResultSet r = s.executeQuery(sql);
                        while(r.next()){
                        result.add(new GetPoketraWithDetails(r.getInt("poketra_id"),r.getString("type_nom"),r.getString("look_nom"),r.getString("taille_nom"),r.getInt("idm"),r.getString("matiere_premiere_nom"),r.getInt("qte"),r.getFloat("pu_mp")));
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
    public GetPoketraWithDetails(){}
    public GetPoketraWithDetails(int id, String nomP, String nomL, String Taille,int idm, String nmp, int qte,float pu) {
        this.id = id;
        this.nomP = nomP;
        this.nomL = nomL;
        this.Taille = Taille;
        this.idm = idm;
        this.nmp = nmp;
        this.qte = qte;
        setPrix(pu);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public String getNomL() {
        return nomL;
    }

    public void setNomL(String nomL) {
        this.nomL = nomL;
    }

    public String getTaille() {
        return Taille;
    }

    public void setTaille(String Taille) {
        this.Taille = Taille;
    }

    public String getNmp() {
        return nmp;
    }

    public void setNmp(String nmp) {
        this.nmp = nmp;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
   public int getIdm() {
        return idm;
    }

    public void setIdm(int idm) {
        this.idm = idm;
    }
}
