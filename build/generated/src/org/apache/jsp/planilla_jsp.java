package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.DAOModificar;
import java.util.*;
import uml.Persona;

public final class planilla_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"EstiloPlanilla.css\">\n");
      out.write("        <title>Vista Persona</title>       \n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write("body {\n");
      out.write("    width:100%;\n");
      out.write("    height: 100%;\n");
      out.write("background-attachment: fixed;\n");
      out.write("background-image: url(hola.jpg);\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("-webkit-background-size: cover;\n");
      out.write("\t-moz-background-size: cover;\n");
      out.write("\t-o-background-size: cover;\n");
      out.write("\tbackground-size: cover; \n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("    \n");
      out.write("    ");

      DAOModificar dao=new DAOModificar();
      List<Persona> datos = new ArrayList();
      String[] columnas =  dao.CargarCampos();
    
      out.write("\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    \n");
      out.write("  <form name=\"formPersona\" method=\"POST\" action=\"SERVModificar\">\n");
      out.write("      <table style=\"width:400px\">\n");
      out.write("            <thead>\n");
      out.write("                <tr><th colspan=\"3\"> PLANILLA DE SEGUIDORES</th></tr>\n");
      out.write("            </thead>  \n");
      out.write("            <tbody>\n");
      out.write("                <tr><td>Codigo </td> <td><input type=\"text\" name=\"txtId\" \n");
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
      out.write("                <tr><td>Apellidos </td> <td><input type=\"text\" name=\"txtApellidos\" \n");
      out.write("                  ");
 if(request.getAttribute("apellidos")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("apellidos") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write("></td> </tr> \n");
      out.write("                <tr><td>Correo </td><td><input type=\"text\" name=\"txtCorreo\"\n");
      out.write("                  ");
 if(request.getAttribute("correo")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("correo") );
      out.write("'\n");
      out.write("                  ");
 }                     
                   
      out.write(" ></td> </tr> \n");
      out.write("                \n");
      out.write("                <tr><td>Celular </td> <td><input type=\"text\" name=\"txtCelular\" \n");
      out.write("                   ");
 if(request.getAttribute("celular")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("celular") );
      out.write("'\n");
      out.write("                  ");
 } 
      out.write("  </td> </tr>   \n");
      out.write("                \n");
      out.write("                <tr><td>Direccion </td> <td><input type=\"text\" name=\"txtDireccion\" \n");
      out.write("                   ");
 if(request.getAttribute("direccion")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("direccion") );
      out.write("'\n");
      out.write("                  ");
 } 
      out.write("  </td> </tr>   \n");
      out.write("                \n");
      out.write("                <tr><td>Ciudad </td> <td><input type=\"text\" name=\"txtCiudad\" \n");
      out.write("                   ");
 if(request.getAttribute("ciudad")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("ciudad") );
      out.write("'\n");
      out.write("                  ");
 } 
      out.write("  </td> </tr>   \n");
      out.write("                \n");
      out.write("                <tr><td>Descripcion </td> <td><input type=\"text\" name=\"txtDescripcion\" \n");
      out.write("                   ");
 if(request.getAttribute("descripcion")!=null){ 
      out.write("   \n");
      out.write("                     value ='");
      out.print(request.getAttribute("descripcion") );
      out.write("'\n");
      out.write("                  ");
 } 
      out.write("  </td> </tr>   \n");
      out.write("\n");
      out.write("            </tbody>\n");
      out.write("            <tfoot>\n");
      out.write("                <tr> <td colspan=\"3\">      \n");
      out.write("               <input type=\"submit\" name=\"btnModificar\" value=\"Modificar\">\n");
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
      out.write("      <input type=\"submit\" name=\"btnFiltrar\" value=\"Filtrar\"> \n");
      out.write("      <input type=\"submit\" name=\"btnReiniciar\" value=\"Reinicio\"> \n");
      out.write(" </form>      \n");
      out.write("        <hr>\n");
      out.write("    <center>\n");
      out.write("        <table style=\"width:550px\"> \n");
      out.write("            <thead><tr> <th>CODIGO</th> <th>NOMBRES</th><th>APELLIDOS</th> <th>CORREO</th><th>CELULAR</th><th>DIRECCION</th><th>CIUDAD</th><th>DESCRIPCION</th><th>ACCIONES</th></tr> </thead>\n");
      out.write("      ");

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
       
      out.write("\n");
      out.write("      <tbody>\n");
      out.write("      <tr>\n");
      out.write("          <td> <center>");
      out.print( p.getId() );
      out.write("</center>  </td>\n");
      out.write("          <td> ");
      out.print( p.getNombres() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( p.getApellidos() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( p.getCorreo() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( p.getCelular() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( p.getDireccion() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( p.getCiudad() );
      out.write("  </td>\n");
      out.write("          <td> ");
      out.print( p.getDescripcion() );
      out.write("  </td>\n");
      out.write("          <td> <center><a href='SERVModificar?id=");
      out.print(p.getId());
      out.write("'> <img src=\"veeeer1.png\" border=\"0\" width=\"25\" height=\"25\"></a>\n");
      out.write("              <a href='SERVModificar?idel=");
      out.print(p.getId());
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
      out.write("    <a href=\"index.html\"><img src=\"imagenes/fle.jpg\" height=\"100\"/></a>\n");
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
