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
 * @author Tafita
 */
public class Poketra {
    int id;
    Type type;
    Look look;
    Taille taille;
    
    public ArrayList<Poketra> getListePoketra(int idMp)throws Exception{
        Connection c = ConnectPostgres.connect();
        ArrayList<Poketra> result = new ArrayList<Poketra>();
        try {
            DetailPoketra dt = new DetailPoketra();
            String sql = "select * from poketra where idM="+idMp;
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                ArrayList<DetailPoketra> list = dt.getDetail(r.getInt("id"));
                for(DetailPoketra detail : list){
                    if(r.getInt("id") == detail.getMp().getId()){
                        result.add(new Poketra(r.getInt("id"), 
                            new Type(r.getInt("id_type"), null),
                            new Look(r.getInt("id_look"), null),
                            new Taille(r.getInt("id_taille"), null)));
                    }
                }
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
    
    public Poketra getPoketra(int idType, int idLook)throws Exception{
        Connection c = ConnectPostgres.connect();
        Poketra result = null;
        try {
            String sql = "select * from poketra where idType="+idType+" and idLook="+idLook;
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                result = new Poketra(r.getInt("id"), 
                        new Type(r.getInt("id_type"), null),
                        new Look(r.getInt("id_look"), null),
                        new Taille(r.getInt("id_taille"), null));
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
    
    public void insertPoketra(int idType, int idLook, int idTaille)throws Exception{
        String sql = "insert into poketra(idtypes,idlook,idtaille) values("+idType+","+idLook+","+idTaille+")";
        ConnectPostgres.executeUpdate(sql);
    }
    public ArrayList<Poketra> getAllPoketra()throws Exception{
        Connection c = ConnectPostgres.connect();
        ArrayList<Poketra> result = new ArrayList<Poketra>();
        try {
                String sql = "select * from poketra";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                result.add(new Poketra(r.getInt("id"), 
                        new Type(r.getInt("idtypes"), null),
                        new Look(r.getInt("idlook"), null),
                        new Taille(r.getInt("idtaille"), null)));
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

    public Poketra() {
    }

    public Poketra(int id, Type type, Look look, Taille taille) {
        setId(id);
        setType(type);
        setLook(look);
        setTaille(taille);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Look getLook() {
        return look;
    }

    public void setLook(Look look) {
        this.look = look;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }
    
    
}