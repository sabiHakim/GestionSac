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
public class Client {
    int id;
    String nom;
    int genre;
    
    public ArrayList<Client> getAll(){
        ArrayList<Client> list = new ArrayList<>();
        try {
            Connection c = ConnectPostgres.connect();
            String sql = "select * from client";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                list.add(new Client(r.getInt("id"), r.getString("nom"), r.getInt("genre")));
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

    public Client() {
    }

    public Client(int id, String nom, int genre) {
        this.id = id;
        this.nom = nom;
        this.genre = genre;
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

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }
    
    
    
    public static void insert(String nom, int id_genre)throws Exception{
        String sql = "insert into client(nom,genre) values('"+nom+"',"+id_genre+")";
        ConnectPostgres.executeUpdate(sql);
    }
}
