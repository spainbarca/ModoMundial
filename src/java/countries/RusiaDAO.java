/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countries;

import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import uml.Jugadores;
import modelo.Database;
import java.lang.*;

public class RusiaDAO implements Operaciones{
Database db=new Database();

    @Override
    public String insertar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<?> logear() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Jugadores> consultar() {
        List<Jugadores> datos = new ArrayList<>();
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from convocados where pais=RUS";
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
               datos.add(new Jugadores(rs.getString("id"),
                       rs.getString("nomb_jug"),
                       rs.getString("apell_jug"),
                       rs.getString("apodo"),
                       rs.getString("posicion"),
                       rs.getInt("edad"),
                       rs.getFloat("talla"),
                       rs.getFloat("peso"),
                       rs.getString("confederacion"),
                       rs.getString("pais"),
                       rs.getString("liga"),
                       rs.getString("club"),
                       rs.getInt("part_sel"),
                       rs.getInt("goles_sel"),
                       rs.getInt("mund_jug")));
           }
        }catch(ClassNotFoundException | SQLException e){
        }
                return datos;
    }
/*
    @Override
    public String eliminar(Object obj) {
        Jugadores j = (Jugadores)obj;
       Connection conn;
       PreparedStatement pst;
       String sql= "delete from convocados where id=?";
       String respuesta="";
       try{
           Class.forName(db.getDriver());
           conn = DriverManager.getConnection(
               db.getUrl(),
               db.getUsuario(),
               db.getContraseña()
           );
           pst=conn.prepareStatement(sql);           
           pst.setString(1,j.getId());
           int filas= pst.executeUpdate();
           respuesta="Se eliminaron "+filas+" elemento(s)";
          conn.close();
       }catch(ClassNotFoundException | SQLException e){
          
       }
       return respuesta;
    }
    */
/*
    @Override
    public String modificar(Object obj) {
        Jugadores j = (Jugadores)obj;
       Connection conn;
       PreparedStatement pst;
       String sql= "update convocados set nomb_jug=?,apell_jug=?,apodo=?,posicion=?,edad=?,"
               + "talla=?,peso=?,confederacion=?,pais=?,liga=?,club=?,part_sel=?,goles_sel=?,mund_jug=? where id=?";
       String respuesta="";
       try{
           Class.forName(db.getDriver());
           conn = DriverManager.getConnection(
               db.getUrl(),
               db.getUsuario(),
               db.getContraseña()
           );
           pst=conn.prepareStatement(sql);           
           pst.setString(1,j.getNomb_jug());
           pst.setString(2,j.getApell_jug());
           pst.setString(3,j.getApodo());
           pst.setString(4,j.getPosicion());
           pst.setInt(5,j.getEdad());
           pst.setFloat(6,j.getTalla());
           pst.setFloat(7,j.getPeso());
           pst.setString(8,j.getConfederacion());
           pst.setString(9,j.getPais());
           pst.setString(10,j.getLiga());
           pst.setString(11,j.getClub());
           pst.setInt(12,j.getPart_sel());
           pst.setInt(13,j.getGoles_sel());
           pst.setInt(14,j.getMund_jug());
           pst.setString(15,j.getId());
           int filas= pst.executeUpdate();
           respuesta="Se modificaron "+filas+" elemento";
          conn.close();
       }catch(ClassNotFoundException | SQLException e){
          JOptionPane.showMessageDialog(null,"Error "+e );
       }
       return respuesta;
    }
*/
     public List<Jugadores> filtrar(String campo, String criterio) {
        List<Jugadores> datos = new ArrayList<>();
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from convocados where "+campo+" like '%"+criterio+"%'";
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
               datos.add(new Jugadores(rs.getString("id"),
                       rs.getString("nomb_jug"),
                       rs.getString("apell_jug"),
                       rs.getString("apodo"),
                       rs.getString("posicion"),
                       rs.getInt("edad"),
                       rs.getFloat("talla"),
                       rs.getFloat("peso"),
                       rs.getString("confederacion"),
                       rs.getString("pais"),
                       rs.getString("liga"),
                       rs.getString("club"),
                       rs.getInt("part_sel"),
                       rs.getInt("goles_sel"),
                       rs.getInt("mund_jug")));
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
        String sql = "select * from convocados where pais=RUS";
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
    
    public List<Jugadores> TraerRegistro(String id) {
          List<Jugadores> datos = new ArrayList<>();
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        String sql = "select * from convocados where id  like '%"+id+"%'";
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
               datos.add(new Jugadores(rs.getString("id"),
                       rs.getString("nomb_jug"),
                       rs.getString("apell_jug"),
                       rs.getString("apodo"),
                       rs.getString("posicion"),
                       rs.getInt("edad"),
                       rs.getFloat("talla"),
                       rs.getFloat("peso"),
                       rs.getString("confederacion"),
                       rs.getString("pais"),
                       rs.getString("liga"),
                       rs.getString("club"),
                       rs.getInt("part_sel"),
                       rs.getInt("goles_sel"),
                       rs.getInt("mund_jug")));
           }
        }catch(ClassNotFoundException | SQLException e){
            
        }
      return datos;
         
    }
     
}
