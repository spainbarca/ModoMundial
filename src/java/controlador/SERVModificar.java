/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.DAOModificar;
import uml.Persona;

/**
 *
 * @author Noah
 */
public class SERVModificar extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            DAOModificar dao=new DAOModificar();
            Persona p = new Persona();
            Persona p2=new Persona();
            String campo,criterio,id;
            List<Persona> datos = new ArrayList<>();
            String respuesta="";
            RequestDispatcher rd=null;
            
            try{
                if(request.getParameter("btnModificar")!=null){
                    p.setId(request.getParameter("txtId"));
                    p.setNombres(request.getParameter("txtNombres"));
                    p.setApellidos(request.getParameter("txtApellidos"));
                    p.setCorreo(request.getParameter("txtCorreo"));
                    p.setCelular(Float.parseFloat(request.getParameter("txtCelular")));
                    p.setDireccion(request.getParameter("txtDireccion"));
                    p.setCiudad(request.getParameter("txtCiudad"));
                    p.setDescripcion(request.getParameter("txtDescripcion"));
                    respuesta=dao.modificar(p);                    
                    request.setAttribute("respuesta",respuesta);                   
                }else if(request.getParameter("btnEliminar")!=null){
                    p.setId(request.getParameter("txtId"));                    
                    respuesta=dao.eliminar(p);                    
                    request.setAttribute("respuesta",respuesta);                   
                }
                else if(request.getParameter("btnFiltrar")!=null){
                    //campo=request.getParameter("txtCampo");
                    campo=request.getParameter("sltColumnas");               
                    criterio=request.getParameter("txtCriterio");
                    datos = dao.filtrar(campo, criterio);
                    request.setAttribute("filtro",datos);                   
                }
                else if(request.getParameter("btnReiniciar")!=null){
                    datos = dao.consultar();
                    request.setAttribute("filtro",datos);                   
                }else if(request.getParameter("id")!=null){                   
                    id=request.getParameter("id");              
                    datos = dao.TraerRegistro(id);
                    request.setAttribute("id",datos.get(0).getId());
                    request.setAttribute("nombres",datos.get(0).getNombres());
                    request.setAttribute("apellidos",datos.get(0).getApellidos());
                    request.setAttribute("correo",datos.get(0).getCorreo());
                    request.setAttribute("celular",datos.get(0).getCelular());
                    request.setAttribute("direccion",datos.get(0).getDireccion());
                    request.setAttribute("ciudad",datos.get(0).getCiudad());
                    request.setAttribute("descripcion",datos.get(0).getDescripcion());
                }else if(request.getParameter("idel")!=null){
                    p.setId(request.getParameter("idel"));                    
                    respuesta=dao.eliminar(p);                    
                    request.setAttribute("respuesta",respuesta);                   
                }
                
               rd = request.getRequestDispatcher("planilla.jsp");
            }catch(Exception e){
                
            }
            
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
