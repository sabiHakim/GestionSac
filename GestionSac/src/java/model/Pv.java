/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connect.ConnectPostgres;
/**
 *
 * @author Hakim
 */
public class Pv {
    int id ;
    Type t;
    Taille taille;
    double prix;

    public Pv() {
    }

    public Pv(int id, Type t, Taille taille, double prix) {
        this.id = id;
        this.t = t;
        this.taille = taille;
        this.prix = prix;
    }


    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public Type getT() {
        return t;
    }

    public void setT(Type t) {
        this.t = t;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    public void insertPv(int idTypes,int idTaille ,double pv) throws Exception{
         String sql = "insert into pv(idtypes,idTaille,pv) values("+idTypes+","+idTaille+","+pv+")";
        ConnectPostgres.executeUpdate(sql);
    }
}
