/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connect.ConnectPostgres;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Hakim
 */
public class Benefice {
    Type t;
    Taille taille;
     double benefice ;

    public Benefice(Type t, Taille taille, double benefice) {
        this.t = t;
        this.taille = taille;
        this.benefice = benefice;
    }

    public Type getT() {
        return t;
    }

    public void setT(Type t) {
        this.t = t;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public double getBenefice() {
        return benefice;
    }

    public void setBenefice(double benefice) {
        this.benefice = benefice;
    }
         public static Vector<Benefice>getBenefice(double pmin,double pmax)throws Exception{
    Vector<Benefice> v = new Vector<>();
     Connection c = ConnectPostgres.connect();
                ArrayList<GetPoketraWithDetails> result = new ArrayList<GetPoketraWithDetails>();
                  try {
                        String sql = "select * from v_benefice   where  benefice BETWEEN "+pmin+ " AND "+ pmax+" ";
                        Statement s = c.createStatement();
                        ResultSet r = s.executeQuery(sql);
                        while(r.next()){
                        Type t = new Type(r.getInt("idtypes"),r.getString("nom"));
                        Taille ta = new Taille(r.getInt("idtaille"),r.getString("nom_taille"));
                        v.add(new Benefice(t,ta,r.getDouble("benefice")));
                        }
                        r.close();
                        s.close();
                        c.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
     return v;
    
    }
}
