/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connect;

import java.sql.*;

/**
 *
 * @author Tafita
 */
public class ConnectPostgres {
    public static Connection connect() throws SQLException, Exception{
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/poketra","postgres","etu001991");
    }
    
    public static int getLastId()throws Exception{
        Connection c = ConnectPostgres.connect();
        String sql = "select id from poketra order by id desc limit 1";
        int id = -1;
        try {
            Statement s = c.createStatement();
            ResultSet r = s.executeQuery(sql);
            r.next();
            id = r.getInt(1);
            s.close();
            c.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
    
    public static void executeUpdate(String sql)throws Exception{
        Connection c = ConnectPostgres.connect();
        try {
            Statement s = c.createStatement();
            s.executeUpdate(sql);
            
            s.close();
            c.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
