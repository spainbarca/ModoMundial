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

public class DAOModificar implements Operaciones{
    Database db=new Database();

    @Override
    public String insertar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String eliminar(Object obj) {
        Persona p = (Persona)obj;
       Connection conn;
       PreparedStatement pst;
       String sql= "delete from usuarios where id=?";
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
           int filas= pst.executeUpdate();
           respuesta="Se eliminaron "+filas+" elemento(s)";
          conn.close();
       }catch(ClassNotFoundException | SQLException e){
          
       }
       return respuesta;
    }

    @Override
    public String modificar(Object obj) {
        Persona p = (Persona)obj;
       Connection conn;
       PreparedStatement pst;
       String sql= "update usuarios set nombres=?,apellidos=?,correo=?,celular=?,direccion=?,ciudad=?,descripcion=? where id=?";
       String respuesta="";
       try{
           Class.forName(db.getDriver());
           conn = DriverManager.getConnection(
               db.getUrl(),
               db.getUsuario(),
               db.getContraseña()
           );
           pst=conn.prepareStatement(sql);           
           pst.setString(1,p.getNombres());
           pst.setString(2,p.getApellidos());
           pst.setString(3,p.getCorreo());
           pst.setFloat(4,p.getCelular());
           pst.setString(5,p.getDireccion());
           pst.setString(6,p.getCiudad());
           pst.setString(7,p.getDescripcion());
           pst.setString(8,p.getId());
           int filas= pst.executeUpdate();
           respuesta="Se modificaron "+filas+" elemento";
          conn.close();
       }catch(ClassNotFoundException | SQLException e){
          JOptionPane.showMessageDialog(null,"Error "+e );
       }
       return respuesta;
    }


    public List<Persona> consultar() {
        List<Persona> datos = new ArrayList<>();
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from usuarios";
        try{
            Class.forName(db.getDriver());
           conn = DriverManager.getConnection(
               db.getUrl(),
               db.getUsuario(),
               db.getContraseña()
           );
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery(sql);
           while(rs.next()){
               datos.add(new Persona(rs.getString("id"),
                       rs.getString("nombres"),
                       rs.getString("apellidos"),
                       rs.getString("correo"),
                       rs.getFloat("celular"),
                       rs.getString("direccion"),
                       rs.getString("ciudad"),
               rs.getString("descripcion")));
           }
        }catch(ClassNotFoundException | SQLException e){
            
        }
                return datos;
    }

   
    public List<Persona> filtrar(String campo, String criterio) {
        List<Persona> datos = new ArrayList<>();
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from usuarios where "+campo+" like '%"+criterio+"%'";
        try{
            Class.forName(db.getDriver());
           conn = DriverManager.getConnection(
               db.getUrl(),
               db.getUsuario(),
               db.getContraseña()
           );
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery(sql);
           while(rs.next()){
               datos.add(new Persona(rs.getString("id"),
                       rs.getString("nombres"),
                       rs.getString("apellidos"),
                       rs.getString("correo"),
                       rs.getFloat("celular"),
                       rs.getString("direccion"),
                       rs.getString("ciudad"),
               rs.getString("descripcion")));
           }
        }catch(ClassNotFoundException | SQLException e){
            
        }
                return datos;
    }
    public String[] CargarCampos() {
        Connection conn;
        String[] columnas=null;
        PreparedStatement pst;        
        ResultSet rs;
        ResultSetMetaData rsm;
        String sql = "select * from usuarios";
        try{
            Class.forName(db.getDriver());
           conn = DriverManager.getConnection(
               db.getUrl(),
               db.getUsuario(),
               db.getContraseña()
           );
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery(sql);
           rsm = rs.getMetaData();
           int numcol= rsm.getColumnCount();
           columnas= new String[numcol];
           for(int i=1;i<=numcol;i++){
               columnas[i-1]=rsm.getColumnName(i);
           }
        }catch(ClassNotFoundException | SQLException e){     }
       return columnas;
    }
    
     public List<Persona> TraerRegistro(String id) {
          List<Persona> datos = new ArrayList<>();
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from usuarios where id  like '%"+id+"%'";
        try{
            Class.forName(db.getDriver());
           conn = DriverManager.getConnection(
               db.getUrl(),
               db.getUsuario(),
               db.getContraseña()
           );
           pst=conn.prepareStatement(sql);
           rs=pst.executeQuery(sql);
           while(rs.next()){
               datos.add(new Persona(rs.getString("id"),
                       rs.getString("nombres"),
                       rs.getString("apellidos"),
                       rs.getString("correo"),
                       rs.getFloat("celular"),
                       rs.getString("direccion"),
                       rs.getString("ciudad"),
               rs.getString("descripcion")));
           }
        }catch(ClassNotFoundException | SQLException e){
            
        }
      return datos;
         
    }

    @Override
    public List<?> logear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
