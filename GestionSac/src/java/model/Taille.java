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
public class Taille {
    int id;
    String nom;
    
    public void insertQuantite(int idMp, int quantite)throws Exception{
        
    }
    
    public void insertTaille(String nom)throws Exception{
        String sql = "insert into taille(nom) values('"+nom+"')";
        ConnectPostgres.executeUpdate(sql);
    }
    
    public ArrayList<Taille> getAllTaille()throws Exception{
        Connection c = ConnectPostgres.connect();
        ArrayList<Taille> result = new ArrayList<Taille>();
        try {
            String sql = "select * from taille";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                result.add(new Taille(r.getInt("id"), r.getString("nom")));
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

    public Taille() {
    }

    public Taille(int id, String nom) {
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
