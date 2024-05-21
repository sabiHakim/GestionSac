/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connect.ConnectPostgres;

/**
 *
 * @author Tafita
 */
public class MatieresPremiereLook {
    int id;
    int id_look;
    int id_matierePremiere;
    
    public void insertMpByIDLook(int id, MatierePremiere m)throws Exception{
        String sql = "insert into matierepremiereslook(idl, idm) values ("+id+","+m.getId()+")";
        ConnectPostgres.executeUpdate(sql);
    }

    public MatieresPremiereLook() {
    }

    public MatieresPremiereLook(int id, int id_look, int id_matierePremiere) {
        setId(id);
        setId_look(id_look);
        setId_matierePremiere(id_matierePremiere);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_look() {
        return id_look;
    }

    public void setId_look(int id_look) {
        this.id_look = id_look;
    }

    public int getId_matierePremiere() {
        return id_matierePremiere;
    }

    public void setId_matierePremiere(int id_matierePremiere) {
        this.id_matierePremiere = id_matierePremiere;
    }
    
    
}
