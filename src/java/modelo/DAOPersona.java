/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import uml.Persona;

public class DAOPersona implements Operaciones{

    Database db=new Database();
    
    @Override
    public String insertar(Object obj) {
        Persona p = (Persona)obj;
       Connection conn;
       PreparedStatement pst;
       String sql= "Insert into usuarios values(?,?,?,?,?,?,?,?)";
       String respuesta="";
       try{
           Class.forName(db.getDriver());
           conn = DriverManager.getConnection(
               db.getUrl(),
               db.getUsuario(),
               db.getContraseña()
           );
           pst=conn.prepareStatement(sql);
           pst.setString(1,p.getId());
           pst.setString(2,p.getNombres());
           pst.setString(3,p.getApellidos());
           pst.setString(4,p.getCorreo());
           pst.setFloat(5, p.getCelular());
           pst.setString(6,p.getDireccion());
           pst.setString(7,p.getCiudad());
           pst.setString(8,p.getDescripcion());
           
           int filas= pst.executeUpdate();
           respuesta="Se registraron "+filas+" nuevo elemento";
          conn.close();
       }catch(ClassNotFoundException | SQLException e){
          JOptionPane.showMessageDialog(null,"Error "+e );
       }
       return respuesta;
    }

    @Override
    public List<?> logear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String modificar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<?> filtrar(String campo, String criterio) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<?> consultar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
