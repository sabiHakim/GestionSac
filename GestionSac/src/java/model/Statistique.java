/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.*;
import connect.*;
/**
 *
 * @author Tafita
 */
public class Statistique {
    public static int getNombre(int id_type, int id_genre){
        int result = 0;
        try {
            Connection c = ConnectPostgres.connect();
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery("select * from v_statvente where idtypes="+id_type+" and genre="+id_genre);
            while(r.next()){
                result++;
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
    