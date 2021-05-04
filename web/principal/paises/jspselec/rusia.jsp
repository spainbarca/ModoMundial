<%@ page import="countries.RusiaDAO" %>
<%@ page import="java.util.*" %>
<%@ page import="uml.Jugadores" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="Estilos.css">
        <title>JSP Page</title>
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
      RusiaDAO dao=new RusiaDAO();
      List<Jugadores> datos = new ArrayList();
      String[] columnas =  dao.CargarCampos();
    %>
    
    <body>
        <form name="formRusia" method="POST" action="SERVJugadores">
      <table style="width:400px">
            <thead>
                <tr><th colspan="3"> PLANILLA DE Jugadores Rusos</th></tr>
            </thead>  
            <tbody>
                <tr><td>Id </td> <td><input type="text" name="txtId" 
                   <% if(request.getAttribute("id")!=null){ %>   
                     value ='<%=request.getAttribute("id") %>'
                  <% } %>  </td> </tr>        
                <tr><td>Nombres </td> <td><input type="text" name="txtNombres"
                <% if(request.getAttribute("nomb_jug")!=null){ %>   
                     value ='<%=request.getAttribute("nomb_jug") %>'
                  <% }                     
                   %> ></td> </tr>                                                 
                
                <tr><td>Apellidos </td> <td><input type="text" name="txtApellidos" 
                  <% if(request.getAttribute("apell_jug")!=null){ %>   
                     value ='<%=request.getAttribute("apell_jug") %>'
                  <% }                     
                   %>></td> </tr> 
                <tr><td>Apodo </td><td><input type="text" name="txtApodo"
                  <% if(request.getAttribute("apodo")!=null){ %>   
                     value ='<%=request.getAttribute("apodo") %>'
                  <% }                     
                   %> ></td> </tr> 
                
                <tr><td>Posicion </td> <td><input type="text" name="txtPosicion" 
                   <% if(request.getAttribute("posicion")!=null){ %>   
                     value ='<%=request.getAttribute("posicion") %>'
                  <% } %>  </td> </tr>   
                
                <tr><td>Edad </td> <td><input type="text" name="txtEdad" 
                   <% if(request.getAttribute("edad")!=null){ %>   
                     value ='<%=request.getAttribute("edad") %>'
                  <% } %>  </td> </tr>   
                
                <tr><td>Talla </td> <td><input type="text" name="txtTalla" 
                   <% if(request.getAttribute("talla")!=null){ %>   
                     value ='<%=request.getAttribute("talla") %>'
                  <% } %>  </td> </tr>   
                
                <tr><td>Descripcion </td> <td><input type="text" name="txtPeso" 
                   <% if(request.getAttribute("peso")!=null){ %>   
                     value ='<%=request.getAttribute("peso") %>'
                  <% } %>  </td> </tr>  
                
                <tr><td>Confederacion </td> <td><input type="text" name="txtConfederacion" 
                   <% if(request.getAttribute("confederacion")!=null){ %>   
                     value ='<%=request.getAttribute("confederacion") %>'
                  <% } %>  </td> </tr>   
                
                <tr><td>Pais </td> <td><input type="text" name="txtPais" 
                   <% if(request.getAttribute("pais")!=null){ %>   
                     value ='<%=request.getAttribute("pais") %>'
                  <% } %>  </td> </tr> 
                
                <tr><td>Liga </td> <td><input type="text" name="txtLiga" 
                   <% if(request.getAttribute("liga")!=null){ %>   
                     value ='<%=request.getAttribute("liga") %>'
                  <% } %>  </td> </tr>   
                
                <tr><td>Club </td> <td><input type="text" name="txtClub" 
                   <% if(request.getAttribute("club")!=null){ %>   
                     value ='<%=request.getAttribute("club") %>'
                  <% } %>  </td> </tr> 

                <tr><td>Partidos </td> <td><input type="text" name="txtPart_sel" 
                   <% if(request.getAttribute("part_sel")!=null){ %>   
                     value ='<%=request.getAttribute("part_sel") %>'
                  <% } %>  </td> </tr>   
                
                <tr><td>Goles </td> <td><input type="text" name="txtGoles_sel" 
                   <% if(request.getAttribute("goles_sel")!=null){ %>   
                     value ='<%=request.getAttribute("goles_sel") %>'
                  <% } %>  </td> </tr> 
                
                <tr><td>Mundiales jugados </td> <td><input type="text" name="txtMund_jug" 
                   <% if(request.getAttribute("mund_jug")!=null){ %>   
                     value ='<%=request.getAttribute("mund_jug") %>'
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
            <thead><tr> <th>CODIGO</th> <th>NOMBRES</th><th>APELLIDOS</th> <th>APODO</th><th>POSICION</th><th>EDAD</th><th>TALLA</th><th>PESO</th><th>CONFEDERACION</th><th>PAIS</th><th>LIGA</th><th>CLUB</th><th>PARTIDOS</th><th>GOLES</th><th>MUNDIALES</th><th>ACCIONES</th></tr> </thead>
      <%
           String nom,ape;
      int cod,ed;    
           
      if(request.getAttribute("filtro")!=null){
          datos=(List<Jugadores>) request.getAttribute("filtro");
      }else if(request.getAttribute("reinicio")!=null){
        datos=dao.consultar();       
      }else{
        datos=dao.consultar();       
      }
        
      for(Jugadores p:datos){
       %>
      <tbody>
      <tr>
          <td> <center><%= p.getId() %></center>  </td>
          <td> <%= p.getNomb_jug()%>  </td>
          <td> <%= p.getApell_jug()%>  </td>
          <td> <%= p.getApodo()%>  </td>
          <td> <%= p.getPosicion()%>  </td>
          <td> <%= p.getEdad()%>  </td>
          <td> <%= p.getTalla()%>  </td>
          <td> <%= p.getPeso() %>  </td>
          <td> <%= p.getConfederacion()%>  </td>
          <td> <%= p.getPais()%>  </td>
          <td> <%= p.getLiga()%>  </td>
          <td> <%= p.getClub()%>  </td>
          <td> <%= p.getPart_sel()%>  </td>
          <td> <%= p.getGoles_sel()%>  </td>
          <td> <%= p.getMund_jug()%>  </td>
          <td> <center><a href='SERVJugadores?id=<%=p.getId()%>'> <img src="veeeer1.png" border="0" width="25" height="25"></a>
              <a href='SERVJugadores?idel=<%=p.getId()%>'><img src="eliminar.png" border="0" width="25" height="25"> </a></center> </td> 
      </tr>
      </tbody>
       <%
         }
       %>    
        </table>
            
    </center>  
    
    <a href="../paises.html"><img src="fle.jpg" height="100"/></a>
    </body>
</html>
