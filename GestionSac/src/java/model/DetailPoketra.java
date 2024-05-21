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
public class DetailPoketra {
    int idP;
    MatierePremiere mp;
    int quantite;
    
    public ArrayList<DetailPoketra> getDetail(int idP)throws Exception{
        Connection c = ConnectPostgres.connect();
        ArrayList<DetailPoketra> result = new ArrayList<DetailPoketra>();
        try {
            String sql = "select * from detailP where idP = "+idP;
//                        String sql = "select * from detailpoketra where idP = "+idP;

            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                result.add(new DetailPoketra(r.getInt("id"), 
                        new MatierePremiere(r.getInt("id_type"), null,0),
                        r.getInt("quantite")));
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
    
    public void insertDetail(int idP, int idMp, int quantite)throws Exception{
        String sql = "insert into detailP(idpoketra,idm,qte) values("+idP+","+idMp+","+quantite+")";
        ConnectPostgres.executeUpdate(sql);
    }
    
    public ArrayList<DetailPoketra> getAllDetailPoketra()throws Exception{
        Connection c = ConnectPostgres.connect();
        ArrayList<DetailPoketra> result = new ArrayList<DetailPoketra>();
        try {
//            String sql = "select * from DetailPoketra";
                        String sql = "select * from detailP";

            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                result.add(new DetailPoketra(r.getInt("idP"),
                        new MatierePremiere(r.getInt("idM"), null,0),
                        r.getInt("quantite")));
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

    public DetailPoketra(int idP, MatierePremiere mp, int quantite) {
        this.idP = idP;
        this.mp = mp;
        this.quantite = quantite;
    }

    public DetailPoketra() {
    }

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public MatierePremiere getMp() {
        return mp;
    }

    public void setMp(MatierePremiere mp) {
        this.mp = mp;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    
    
    
}