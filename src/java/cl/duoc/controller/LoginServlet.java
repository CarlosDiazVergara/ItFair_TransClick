/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.duoc.controller;

import cl.duoc.utils.Login;
import cl.duoc.utils.Usuario;
import com.sun.nio.sctp.MessageInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.PageContext;

/**
 *
 * @author CETECOM
 */
public class LoginServlet extends HttpServlet {

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
            
            ArrayList<Usuario> listaUsuarios = new ArrayList(); 
           
           Usuario miUsuario1 = new Usuario("usuario1","las margarias 2145, renca","usuario1_x@hotmail.com","carga celular","123456");
           Usuario miUsuario2 = new Usuario("usuario2","las amapolas 1570, conchali","usuario2_x@hotmail.com","carga celular","123456");
           Usuario miUsuario3 = new Usuario("usuario3","las margarias 2145, renca","usuario3_x@hotmail.com","carga celular","123456");
           Usuario miUsuario4 = new Usuario("x","x", "x", "x", "x");
           
           listaUsuarios.add(miUsuario1);
           listaUsuarios.add(miUsuario2);
           listaUsuarios.add(miUsuario3);
           listaUsuarios.add(miUsuario4);
           request.getSession().setAttribute("listaUsuario", listaUsuarios);
           
           
           Login logeo= new Login();
           
           logeo.setUsuario(request.getParameter("txtNombre"));
           logeo.setPassword(request.getParameter("txtContrasena"));
          
           
           if(request.getParameter("cbxRecordarme")!=null){
             logeo.setRecordarme(true);
           }
           else{
             logeo.setRecordarme(false);
            }
       
           Usuario encontrado=new Usuario();
           String noLogeado="";
           for (Usuario us : listaUsuarios ){
               if(us.getNombre().compareToIgnoreCase(logeo.getUsuario())== 0 && us.getPass().compareToIgnoreCase(logeo.getPassword())==0){
                   
                 HttpSession session=request.getSession();
                 session.setAttribute("Usuario", us);
 
                  encontrado.setNombre(us.getNombre());
                  encontrado.setDireccion(us.getDireccion());
                  encontrado.setCorreoElectronico(us.getCorreoElectronico());
                  encontrado.setMedioDePago(us.getMedioDePago());
                  encontrado.setPass(us.getPass());                
           } 
               else{
               noLogeado="USUARIO O PASSWORD INCRRECTO";
               }
         }
           
           if(encontrado.getNombre()!=null){
               response.sendRedirect("OpcionesUsuario.jsp"); 
               
               
           }
           else{
               request.getRequestDispatcher("ErrorInicioSession").forward(request, response);
           }
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
