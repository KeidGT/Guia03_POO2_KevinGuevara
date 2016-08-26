/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.controlador.LugaAcceCtrl;
import com.sv.udb.controlador.TipoDocuCtrl;
import com.sv.udb.modelo.LugaAcce;
import com.sv.udb.modelo.TipoDocu;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author REGISTRO
 */
@WebServlet(name = "TipoDocuServ", urlPatterns = {"/TipoDocuServ"})
public class TipoDocuServ extends HttpServlet {

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
        boolean esValido = request.getMethod().equals("POST");
        String mens = "En Espera";
        if(esValido)
        {
            
            String CRUD = request.getParameter("cursBoton");
            if(CRUD.equals("Guardar"))
            {
                TipoDocu obj = new TipoDocu();
                obj.setNombTipoDocu(request.getParameter("txtNombre"));
                obj.setFechAlta(new Date());
                obj.setEsta(1);
                mens = new TipoDocuCtrl().guardar(obj) ? "Datos guardados" : "Datos NO guardados";
            }
            else if(CRUD.equals("Eliminar"))
            {
                TipoDocu obj = new TipoDocu();
                Long id = Long.parseLong(request.getParameter("txtID") == null ?"0" : request.getParameter("txtID"));
                
                TipoDocu objdb = new TipoDocu();
                objdb = new TipoDocuCtrl().cons(id);
                obj.setCodiTipoDocu(id);
                obj.setNombTipoDocu(objdb.getNombTipoDocu());
                obj.setFechAlta(objdb.getFechAlta());
                obj.setFechBaja(new Date());
                obj.setEsta(0);
                mens = new TipoDocuCtrl().modificar(obj) ? "Datos modificados" : "Datos no modificados";
            }
            else if(CRUD.equals("Consultar"))
            {
                    Long id = Long.parseLong(request.getParameter("radioButton") == null ?"1" : request.getParameter("radioButton"));
                    LugaAcce obj = new LugaAcceCtrl().cons(id);
                    if(obj != null)
                    {
                        request.setAttribute("txtID", obj.getCodiLugaAcce());
                        request.setAttribute("txtNombre", obj.getNombLugaAcce());
                        mens = "Datos consultados";
                     }
            }
            else if(CRUD.equals("Modificar"))
            {
                TipoDocu obj = new TipoDocu();
                Long id = Long.parseLong(request.getParameter("txtID") == null ?"1" : request.getParameter("txtID"));
                obj.setNombTipoDocu(request.getParameter("txtNombre"));
                
                LugaAcce objdb = new LugaAcceCtrl().cons(id);
                obj.setFechAlta(objdb.getFechAlta());
                obj.setEsta(1);
                obj.setCodiTipoDocu(id);
                mens = new TipoDocuCtrl().modificar(obj) ? "Datos modificados" : "Datos no modificados";
            }
        }
        else
        {
            response.sendRedirect(request.getContextPath()+"/tipo_docu.jsp");
        }
        request.setAttribute("mensAler", mens);    
        request.getRequestDispatcher("/tipo_docu.jsp").forward(request, response);
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
