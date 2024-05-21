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
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Hakim
 */
public class StockMp {
    int id;
    MatierePremiere mp;
    int stock;
    float prix;
    LocalDate date;
    public void insertStock(int mp,  int stock, double prix, LocalDate date) throws Exception{
        String sql = "insert into stock_mp(idm,isa,prix,date) values("+mp+","+stock+","+prix+",'"+date+"')";
        ConnectPostgres.executeUpdate(sql);
         String sql1 = "insert into histo(idm,isa,date,type) values("+mp+","+stock+",'"+date+"')";
         String sql2 = "insert into mouvement_stock(idm,quantite,date,type) values("+mp+","+stock+",'"+date+"','entree')";
          ConnectPostgres.executeUpdate(sql1);
          ConnectPostgres.executeUpdate(sql2);
    }
    public void commandePoketra(int idT, int quantite) throws Exception{
        //stock matieres premieres          
        String sql = "select * from getPoketraWithDetailsStock where idtypes = "+idT;
        Connection c = ConnectPostgres.connect();
        Statement s = c.createStatement();
        ResultSet r = s.executeQuery(sql);
        
        while(r.next()){
            int stock = r.getInt("isa");
            int ilaina = quantite * r.getInt("qte");
            System.out.println(stock);
            if(stock < ilaina){
                throw new Exception("tsy ampy "+r.getString("matiere_premiere_nom")+" "+(ilaina - stock));
            }
            else{
            //
            sql = "update stock_mp set isa = isa - "+ilaina+" where idm = "+r.getInt("idm");
            ConnectPostgres.executeUpdate(sql);
            sql = "insert into histo(idm,isa,date)values("+r.getInt("idm")+","+(r.getInt("isa") - ilaina)+",'"+LocalDate.now()+"')";
            String sql2 = "insert into mouvement_stock(idm,quantite,date,type) values("+r.getInt("idm")+","+ilaina+",'"+LocalDate.now()+"','sortie')";
            ConnectPostgres.executeUpdate(sql);
            ConnectPostgres.executeUpdate(sql2);
            String sql3 = "insert into stockproduitfini(idTypes,quantite,dates) values("+idT+","+quantite+",'"+LocalDate.now()+"')";
            ConnectPostgres.executeUpdate(sql3);
            
            }
        }
        r.close();
        s.close();
        c.close();
        
    }
        //
    String nom;
    int qte;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public StockMp(int id, String nom, int qte) {
        this.id = id;
        this.nom = nom;
        this.qte = qte;
    }

    public StockMp() { }
    
    public  static Vector<StockMp> getAllStockPf() throws Exception{
        Vector<StockMp> v = new Vector<StockMp>(); 
        Connection c = ConnectPostgres.connect();
        try {
            String sql = "select * from  v_produitfiniStock";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                v.add(new StockMp(r.getInt("idTypes"), r.getString("nom"),r.getInt("qte")));
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
//    public  static int  verifierStcokPf(int idTypes) throws Exception{
//             Connection c = ConnectPostgres.connect();
//             int qte  =0;
//             try {
//            String sql = "select qte as qteType from  v_produitfiniStock where idtypes="+ idTypes+ "" ;
//            Statement s = c.createStatement();
//            ResultSet r = s.executeQuery(sql);
//            while(r.next()){
//                qte = r.getInt("qteType");
//                return qte;
//            }
//            r.close();
//            s.close();
//            c.close();
//        }
//        catch (Exception e) {
//            e.printStackTrace();
//        }
//    return 0;
//    }
//    public static  void updateStockPf( int qte,int idTypes) throws Exception{
//        Connection c = ConnectPostgres.connect();
//        try{
//            String sql = "update v_produitfiniStock set qte = qte - "+ qte +" where idtypes = " +idTypes;
//           ConnectPostgres.executeUpdate(sql);
//            c.close();
//        }
//        catch(Exception e){e.getMessage();}
//    }
    public static  void commandePf(int idT, int quantite,int id_client,LocalDate date) throws Exception{         
        String sql = "select qte as qteType from  v_produitfiniStock where idtypes="+ idT+ "";
        Connection c = ConnectPostgres.connect();
        Statement s = c.createStatement();
        ResultSet r = s.executeQuery(sql);
        
        while(r.next()){
            int stock = r.getInt("qteType");
            if(stock < quantite){
                throw new Exception(" Quantite Stock  Produit Fini est insufisant");
            }
            else{
            Vente.insert(idT,id_client,quantite,date); 
            sql = "update v_produitfiniStock set qte = sum(qte) -"+quantite+" where idtypes = "+idT;
            ConnectPostgres.executeUpdate(sql);
//            sql = "insert into histopf(idTypes,isa,date)values("+idT+","+(quantite)+",'"+LocalDate.now()+"')";
//            String sql2 = "insert into mouvement_stockpf(idTypes,quantite,date,type) values("+idT+","+quantite+",'"+LocalDate.now()+"','sortie')";
//            ConnectPostgres.executeUpdate(sql);
//            ConnectPostgres.executeUpdate(sql2);
           
            }
        }
        r.close();
        s.close();
        c.close();
        
    }

}
