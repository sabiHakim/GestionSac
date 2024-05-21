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
public class ProduitFini {
    int idTypes;
    String nom;
    String taille_nom;
    Double prix;

    public int getIdTypes() {
        return idTypes;
    }

    public void setIdTypes(int idTypes) {
        this.idTypes = idTypes;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTaille_nom() {
        return taille_nom;
    }

    public void setTaille_nom(String taille_nom) {
        this.taille_nom = taille_nom;
    }

    public Double getPrix() {
        return prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }

    public ProduitFini(int idTypes, String nom, String taille_nom, Double prix) {
        setIdTypes(idTypes);
        setNom(nom);
        setPrix(prix);
        setTaille_nom(taille_nom);
        setPrix(prix);
    }
    public static Vector<ProduitFini>getProduitFiniByPrix(double pmin,double pmax)throws Exception{
    Vector<ProduitFini> v = new Vector<>();
     Connection c = ConnectPostgres.connect();
                ArrayList<GetPoketraWithDetails> result = new ArrayList<GetPoketraWithDetails>();
                  try {
                        String sql = "select * from getprixT   where  prixtotal BETWEEN "+pmin+ " AND "+ pmax+" ";
                        Statement s = c.createStatement();
                        ResultSet r = s.executeQuery(sql);
                        while(r.next()){
                        v.add(new ProduitFini(r.getInt("idtypes"),r.getString("type_nom"),r.getString("taille_nom"),r.getDouble("prixtotal")));
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
