/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.*;
import java.sql.*;
import uml.Login;

public class DAOlogin {
    Database db = new Database();
   
    public boolean validar(String nombre, String contra){
       Connection conn;
       PreparedStatement pst;
       
       ResultSet rs;
       try{
        String sql= "select * from login where user=? and password=?";
           Class.forName(db.getDriver());
           conn = DriverManager.getConnection(
               db.getUrl(),
               db.getUsuario(),
               db.getContraseña()
           );
           pst=conn.prepareStatement(sql);
           pst.setString(1,nombre);
           pst.setString(2,contra);
           rs=pst.executeQuery();
           
           if(rs.absolute(1)){
               return true;
           }
           
           conn.close();
       }catch(Exception e){
           System.err.println("Error"+e);
       }
        return false;
    }
}
