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
public class Type {
    int id;
    String nom;
    
    public void insertType(String nom)throws Exception{
        String sql = "insert into Types(nom) values('"+nom+"')";
        ConnectPostgres.executeUpdate(sql);
    }
    
    public ArrayList<Type> getAllType()throws Exception{
        Connection c = ConnectPostgres.connect();
        ArrayList<Type> result = new ArrayList<Type>();
        try {
            String sql = "select * from Types";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                result.add(new Type(r.getInt("id"), r.getString("nom")));
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

    public Type() {
    }

    public Type(int id, String nom) {
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
