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

/**
 *
 * @author Hakim
 */
public class Fabrication {
    int id ;
    Type types; 
    Taille taille;
    Employer emp;
    int nb;
    int heurre;

    public Fabrication(int id, Type types, Taille taille, Employer emp, int nb, int heurre) {
        this.id = id;
        this.types = types;
        this.taille = taille;
        this.emp = emp;
        this.nb = nb;
        this.heurre = heurre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Type getTypes() {
        return types;
    }

    public void setTypes(Type types) {
        this.types = types;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public Employer getEmp() {
        return emp;
    }

    public void setEmp(Employer emp) {
        this.emp = emp;
    }

    public int getNb() {
        return nb;
    }

    public void setNb(int nb) {
        this.nb = nb;
    }

    public int getHeurre() {
        return heurre;
    }

    public void setHeurre(int heurre) {
        this.heurre = heurre;
    }

    public Fabrication() {
    }
    
        public void insertFab(int idTypes,int idTaille,int idEmp,int nb,int nbHeures) throws Exception{
        String sql = "insert into fabrication(idTypes,idTaille,idEmp,nb,nbHeures) values("+idTypes+","+idTaille+","+idEmp+","+nb+","+nbHeures+")";
        ConnectPostgres.executeUpdate(sql);
    }
//        public void insertStockFab( int id_type,int result) throws Exception{
//        String sql = "insert into stockFabrication(idTypes,quantite) values("+id_type+","+result+")";
//        ConnectPostgres.executeUpdate(sql);
//        }
//       public void compteFab( int id_type){
//        int result = 0;
//        try {
//            Connection c = ConnectPostgres.connect();
//            Statement s = c.createStatement();
//            ResultSet r = s.executeQuery("select * from fabrication where idtypes="+id_type+" ");
//            while(r.next()){
//                result++;
//            }
//            insertStockFab(id_type,result);
//            r.close();
//            s.close();
//            c.close();
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//       }
}
