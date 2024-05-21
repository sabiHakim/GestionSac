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

/**
 *
 * @author Hakim
 */
public class Employer {
    int id ;
    String types;
    double sal;

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public Employer(int id, String types, double sal) {
        this.id = id;
        this.types = types;
        this.sal = sal;
    }
public Employer(){}
        public void insertEmployer(String types,double sal) throws Exception{
        String sql = "insert into employer(types,salaire) values('"+types+"',"+sal+")";
        ConnectPostgres.executeUpdate(sql);
    }
        
    public ArrayList<Employer> getAllEmp()throws Exception{
        Connection c = ConnectPostgres.connect();
        ArrayList<Employer> result = new ArrayList<Employer>();
        try {
            String sql = "select * from employer";
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                result.add(new Employer(r.getInt("id"), r.getString("types"),r.getDouble("salaire")));
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
}
