package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.DAOJugadores;
import java.util.*;
import uml.Jugadores;

public final class convocados_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"EstiloJugadores.css\">\n");
      out.write("        <title>Vista Persona</title>       \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("body {\n");
      out.write("    width:100%;\n");
      out.write("    height: 100%;\n");
      out.write("background-attachment: fixed;\n");
      out.write("background-image: url(hello.jpg);\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("-webkit-background-size: cover;\n");
      out.write("\t-moz-background-size: cover;\n");
      out.write("\t-o-background-size: cover;\n");
      out.write("\tbackground-size: cover; \n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("    ");

      DAOJugadores dao=new DAOJugadores();
      List<Jugadores> datos = new ArrayList();
      String[] columnas =  dao.CargarCampos();
    
      out.write("\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("  <form name=\"formPersona\" method=\"POST\" action=\"SERVJugadores\">\n");
      out.write("      <table style=\"width:400px\">\n");
      out.write("            <thead>\n");
      out.write("                <tr><th colspan=\"3\"> LISTA DE CONVOCADOS</th></tr>\n");
      out.write("            </thead>  \n");
      out.write("            <tbody>\n");
      out.write("                <tr><td>Id Jugador </td> <td><input type=\"text\" name=\"txtId\" \n");
      out.write("                   ");
 if(request.getAttribute("id")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("id") );
      out.write("'\n");
      out.write("                  ");
 } 
      out.write("  </td> </tr>        \n");
      out.write("                <tr><td>Nombres </td> <td><input type=\"text\" name=\"txtNombres\"\n");
      out.write("                ");
 if(request.getAttribute("nombres")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("nombres") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write(" ></td> </tr>                                                 \n");
      out.write("                \n");
      out.write("                <tr><td>Apellido Paterno </td> <td><input type=\"text\" name=\"txtApellidopat\" \n");
      out.write("                  ");
 if(request.getAttribute("apellidopat")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("apellidopat") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("                \n");
      out.write("                <tr><td>Apellido Materno </td> <td><input type=\"text\" name=\"txtApellidomat\" \n");
      out.write("                  ");
 if(request.getAttribute("apellidomat")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("apellidomat") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("                \n");
      out.write("                <tr><td>Apodo </td> <td><input type=\"text\" name=\"txtApodo\" \n");
      out.write("                  ");
 if(request.getAttribute("apodo")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("apodo") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("                \n");
      out.write("                <tr><td>Pais </td> <td><input type=\"text\" name=\"txtPais\" \n");
      out.write("                  ");
 if(request.getAttribute("pais")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("pais") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("                \n");
      out.write("                <tr><td>Confederacion </td> <td><input type=\"text\" name=\"txtConfederacion\" \n");
      out.write("                  ");
 if(request.getAttribute("confederacion")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("confederacion") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("                \n");
      out.write("                <tr><td>Club </td> <td><input type=\"text\" name=\"txtClub\" \n");
      out.write("                  ");
 if(request.getAttribute("club")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("club") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("                \n");
      out.write("                <tr><td>Liga </td> <td><input type=\"text\" name=\"txtLiga\" \n");
      out.write("                  ");
 if(request.getAttribute("liga")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("liga") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("                \n");
      out.write("                <tr><td>Posicion </td> <td><input type=\"text\" name=\"txtPosicion\" \n");
      out.write("                  ");
 if(request.getAttribute("posicion")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("posicion") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("                \n");
      out.write("                <tr><td>Talla </td> <td><input type=\"text\" name=\"txtTalla\" \n");
      out.write("                  ");
 if(request.getAttribute("talla")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("talla") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("                \n");
      out.write("                <tr><td>Edad </td> <td><input type=\"text\" name=\"txtEdad\"\n");
      out.write("                  ");
 if(request.getAttribute("edad")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("edad") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write(" ></td> </tr>  \n");
      out.write("                \n");
      out.write("                <tr><td>Goles </td> <td><input type=\"text\" name=\"txtGoles\" \n");
      out.write("                  ");
 if(request.getAttribute("goles")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("goles") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("                \n");
      out.write("                <tr><td>Partidos </td> <td><input type=\"text\" name=\"txtPartidos\" \n");
      out.write("                  ");
 if(request.getAttribute("partidos")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("partidos") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("                \n");
      out.write("                <tr><td>Mundiales Jugados </td> <td><input type=\"text\" name=\"txtMundiales_jug\" \n");
      out.write("                  ");
 if(request.getAttribute("mundiales")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("mundiales_jug") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("            <tfoot>\n");
      out.write("                <tr> <td colspan=\"3\"> <input type=\"submit\" name=\"btnInsertar\" value=\"Insertar\">     \n");
      out.write("               \n");
      out.write("                <input type=\"submit\" name=\"btnEliminar\" value=\"Eliminar\">\n");
      out.write("                <input type=\"reset\" name=\"btnLimpiar\" value=\"Limpiar\"> \n");
      out.write("                </td>              \n");
      out.write("                </tr> \n");
      out.write("            </tfoot>\n");
      out.write("      </table> \n");
      out.write("        ");
 if(request.getAttribute("respuesta")!=null){ 
      out.write("   \n");
      out.write("        <center><font COLOR=\"red\">");
      out.print( request.getAttribute("respuesta") );
      out.write("</font> </center>          \n");
      out.write("                  ");
 } 
      out.write("                   \n");
      out.write("      <hr> Buscar : <input type=\"text\" name=\"txtCriterio\" width=\"150\">\n");
      out.write("           En base a:      \n");
      out.write("           <select name=\"sltColumnas\">\n");
      out.write("           ");
 
           for(int i=0 ; i<columnas.length ; i++){
           
      out.write("\n");
      out.write("           <option value=\"");
      out.print( columnas[i] );
      out.write('"');
      out.write('>');
      out.print( columnas[i] );
      out.write("</option> \n");
      out.write("           ");
     
           }
           
      out.write(" \n");
      out.write("           </select>      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      \n");
      out.write("      <input type=\"submit\" name=\"btnFiltrar\" value=\"Filtrar\"> \n");
      out.write("      <input type=\"submit\" name=\"btnReiniciar\" value=\"Reinicio\"> \n");
      out.write(" </form>      \n");
      out.write("        <hr>\n");
      out.write("    <center>\n");
      out.write("        <table style=\"width:550px\"> \n");
      out.write("            <thead><tr> <th>ID</th> <th>NOMBRES</th><th>APELLIDO PATERNO</th> <th>APELLIDO MATERNO</th> <th>APODO</th> <th>PAIS</th> \n");
      out.write("                    <th>CONFEDERACION</th><th>CLUB</th><th>LIGA</th><th>POSICION</th><th>TALLA</th><th>EDAD</th><th>GOLES</th><th>PARTIDOS</th><th>MUNDIALES JUGADOS</th></tr> </thead>\n");
      out.write("      ");

           String nom,ape;
      int cod,ed;    
           
      if(request.getAttribute("filtro")!=null){
          datos=(List<Jugadores>) request.getAttribute("filtro");
      }else if(request.getAttribute("reinicio")!=null){
        datos=dao.consultar();       
      }else{
        datos=dao.consultar();       
      }
        
      for(Jugadores j:datos){
       
      out.write("\n");
      out.write("      <tbody>\n");
      out.write("      <tr>\n");
      out.write("          <td> <center>");
      out.print( j.getId() );
      out.write("</center>  </td>\n");
      out.write("          <td> ");
      out.print( j.getNombres() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( j.getApellidopat() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( j.getApellidomat() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( j.getApodo() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( j.getPais() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( j.getConf() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( j.getClub() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( j.getLiga() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( j.getPosicion() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( j.getTalla() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( j.getEdad() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( j.getGoles() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( j.getPartidos() );
      out.write("  </td>\n");
      out.write("          <td> <center>");
      out.print( j.getMund() );
      out.write(" </center></td>\n");
      out.write("          <td> <center><a href='SERVJugadores?id=");
      out.print(j.getId());
      out.write("'> <img src=\"veeer1.png\" border=\"0\" width=\"25\" height=\"25\"></a>\n");
      out.write("              <a href='SERVJugadores?idel=");
      out.print(j.getId());
      out.write("'><img src=\"eliminar.png\" border=\"0\" width=\"25\" height=\"25\"> </a></center> </td> \n");
      out.write("      </tr>\n");
      out.write("      </tbody>\n");
      out.write("       ");

         }
       
      out.write("    \n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("    </center>  \n");
      out.write("    \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
