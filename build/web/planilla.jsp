<%@ page import="modelo.DAOModificar" %>
<%@ page import="java.util.*" %>
<%@ page import="uml.Persona" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="EstiloPlanilla.css">
        <title>Vista Persona</title>       
    </head>
    
    <style type="text/css">
<!--
body {
    width:100%;
    height: 100%;
background-attachment: fixed;
background-image: url(hola.jpg);
background-repeat: no-repeat;
-webkit-background-size: cover;
	-moz-background-size: cover;
	-o-background-size: cover;
	background-size: cover; 
}
-->
</style>
    
    <%
      DAOModificar dao=new DAOModificar();
      List<Persona> datos = new ArrayList();
      String[] columnas =  dao.CargarCampos();
    %>
    
    <body>
        
        
    
  <form name="formPersona" method="POST" action="SERVModificar">
      <table style="width:400px">
            <thead>
                <tr><th colspan="3"> PLANILLA DE SEGUIDORES</th></tr>
            </thead>  
            <tbody>
                <tr><td>Codigo </td> <td><input type="text" name="txtId" 
                   <% if(request.getAttribute("id")!=null){ %>   
                     value ='<%=request.getAttribute("id") %>'
                  <% } %>  </td> </tr>        
                <tr><td>Nombres </td> <td><input type="text" name="txtNombres"
                <% if(request.getAttribute("nombres")!=null){ %>   
                     value ='<%=request.getAttribute("nombres") %>'
                  <% }                     
                   %> ></td> </tr>                                                 
                
                <tr><td>Apellidos </td> <td><input type="text" name="txtApellidos" 
                  <% if(request.getAttribute("apellidos")!=null){ %>   
                     value ='<%=request.getAttribute("apellidos") %>'
                  <% }                     
                   %>></td> </tr> 
                <tr><td>Correo </td><td><input type="text" name="txtCorreo"
                  <% if(request.getAttribute("correo")!=null){ %>   
                     value ='<%=request.getAttribute("correo") %>'
                  <% }                     
                   %> ></td> </tr> 
                
                <tr><td>Celular </td> <td><input type="text" name="txtCelular" 
                   <% if(request.getAttribute("celular")!=null){ %>   
                     value ='<%=request.getAttribute("celular") %>'
                  <% } %>  </td> </tr>   
                
                <tr><td>Direccion </td> <td><input type="text" name="txtDireccion" 
                   <% if(request.getAttribute("direccion")!=null){ %>   
                     value ='<%=request.getAttribute("direccion") %>'
                  <% } %>  </td> </tr>   
                
                <tr><td>Ciudad </td> <td><input type="text" name="txtCiudad" 
                   <% if(request.getAttribute("ciudad")!=null){ %>   
                     value ='<%=request.getAttribute("ciudad") %>'
                  <% } %>  </td> </tr>   
                
                <tr><td>Descripcion </td> <td><input type="text" name="txtDescripcion" 
                   <% if(request.getAttribute("descripcion")!=null){ %>   
                     value ='<%=request.getAttribute("descripcion") %>'
                  <% } %>  </td> </tr>   

            </tbody>
            <tfoot>
                <tr> <td colspan="3">      
               <input type="submit" name="btnModificar" value="Modificar">
                <input type="submit" name="btnEliminar" value="Eliminar">
                <input type="reset" name="btnLimpiar" value="Limpiar"> 
                </td>              
                </tr> 
            </tfoot>
      </table> 
        <% if(request.getAttribute("respuesta")!=null){ %>   
        <center><font COLOR="red"><%= request.getAttribute("respuesta") %></font> </center>          
                  <% } %>                   
      <hr> Buscar : <input type="text" name="txtCriterio" width="150">
           En base a:      
           <select name="sltColumnas">
           <% 
           for(int i=0 ; i<columnas.length ; i++){
           %>
           <option value="<%= columnas[i] %>"><%= columnas[i] %></option> 
           <%     
           }
           %> 
           </select>      
      
      
      
      <input type="submit" name="btnFiltrar" value="Filtrar"> 
      <input type="submit" name="btnReiniciar" value="Reinicio"> 
 </form>      
        <hr>
    <center>
        <table style="width:550px"> 
            <thead><tr> <th>CODIGO</th> <th>NOMBRES</th><th>APELLIDOS</th> <th>CORREO</th><th>CELULAR</th><th>DIRECCION</th><th>CIUDAD</th><th>DESCRIPCION</th><th>ACCIONES</th></tr> </thead>
      <%
           String nom,ape;
      int cod,ed;    
           
      if(request.getAttribute("filtro")!=null){
          datos=(List<Persona>) request.getAttribute("filtro");
      }else if(request.getAttribute("reinicio")!=null){
        datos=dao.consultar();       
      }else{
        datos=dao.consultar();       
      }
        
      for(Persona p:datos){
       %>
      <tbody>
      <tr>
          <td> <center><%= p.getId() %></center>  </td>
          <td> <%= p.getNombres() %>  </td>
          <td> <%= p.getApellidos() %>  </td>
          <td> <%= p.getCorreo() %>  </td>
          <td> <%= p.getCelular() %>  </td>
          <td> <%= p.getDireccion() %>  </td>
          <td> <%= p.getCiudad() %>  </td>
          <td> <%= p.getDescripcion() %>  </td>
          <td> <center><a href='SERVModificar?id=<%=p.getId()%>'> <img src="veeeer1.png" border="0" width="25" height="25"></a>
              <a href='SERVModificar?idel=<%=p.getId()%>'><img src="eliminar.png" border="0" width="25" height="25"> </a></center> </td> 
      </tr>
      </tbody>
       <%
         }
       %>    
        </table>
            
    </center>  
    
    <a href="index.html"><img src="imagenes/fle.jpg" height="100"/></a>
    </body>
</html>
