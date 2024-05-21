 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connect.ConnectPostgres;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 *
 * @author Tafita
 */
public class Look {
    int id;
    String nom;
    
    public  static int CompteL()throws Exception{
      Connection c = ConnectPostgres.connect();
    try{
      String sql = "select count(id)   from look";
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
    public void insertLook(String nom)throws Exception{
        String sql = "insert into look(nom) values('"+nom+"')";
        ConnectPostgres.executeUpdate(sql);
    }
    
    public ArrayList<MatierePremiere> getMatierePremiereByIdLook(int idLook)throws Exception{
        Connection c = ConnectPostgres.connect();
        ArrayList<MatierePremiere> result = new ArrayList<MatierePremiere>();
        try {
            String sql = "select * from  getmplook  where look_id="+idLook;
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                result.add(new MatierePremiere(r.getInt("mp_id"), r.getString("nom_mp"),r.getFloat("pu_mp")));
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
    
    public ArrayList<Look> getAllLook()throws Exception{
        Connection c = ConnectPostgres.connect();
        ArrayList<Look> result = new ArrayList<Look>();
        try {
            String sql = "select * from look";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                result.add(new Look(r.getInt("id"), r.getString("nom")));
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

    public Look() {
    }

    public Look(int id, String nom) {
        setId(id);
        setNom(nom);
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
