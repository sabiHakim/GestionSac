/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connect.ConnectPostgres;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Tafita
 */
public class Genre {
    int id;
    String nom;
    
    public ArrayList<Genre> getAll(){
        ArrayList<Genre> list = new ArrayList<>();
        try {
            Connection c = ConnectPostgres.connect();
            String sql = "select * from genre";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                list.add(new Genre(r.getInt("id"), r.getString("type")));
            }
            r.close();
            s.close();
            c.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Genre() {
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

    public Genre(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    
    
    
    public static void insert(String nom)throws Exception{
        String sql = "insert into genre(type) values('"+nom+"')";
        ConnectPostgres.executeUpdate(sql);
    }
}
