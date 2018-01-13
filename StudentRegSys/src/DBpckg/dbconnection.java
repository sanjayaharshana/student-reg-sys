/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBpckg;

import java.sql.*;

/**
 *
 * @author Anupam Dikkumbura
 */
public class dbconnection {
    
    /**
     *
     * @param a
     * @param b
     * @param c
     * @param d
     * @param e
     */
    public void dd(String a ,String b, int c, String d, String e){
        
        
        Connection con  = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student,root ");
            
            Statement stat =  con.createStatement();
            
            String query = "INSERT INTO student VALUES("+ a +","+ b +"," + c+ "," + d +"," + e +")";
            
            stat.executeQuery(query);
            
            con.close();
            
            
            
        }
        catch(Exception el){
            
            System.out.println("---------------- DATABASE CONNECTION ERROR !!!!");
            
             
        }
        
        
    }
    
}
