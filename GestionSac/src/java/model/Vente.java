/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import connect.ConnectPostgres;
import java.time.LocalDate;

/**
 *
 * @author Tafita
 */
public class Vente {
    int id;
    int id_type;
    int id_client;
    int quantite;
    LocalDate dateVente;
    
    public static void insert(int id_type,int id_client, int quantite, LocalDate dateVente)throws Exception{
        String sql = "insert into vente(idTypes,idClient,quantite,dateAchat) values("+id_type+","+id_client+","+quantite+",'"+dateVente+"')";
        ConnectPostgres.executeUpdate(sql);
    }
}
