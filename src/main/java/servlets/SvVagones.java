/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import Modelo.*;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author bernardomartinez
 */
@WebServlet(name = "SvVagones", urlPatterns = {"/SvVagones"})
public class SvVagones extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet java</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet java at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
// En un servlet
        HttpSession session = request.getSession();
        List<Vagon> vagones = (List<Vagon>) session.getAttribute("vagones");
         if (vagones == null) {
            vagones = new ArrayList<>();
        }
        

            int codigo = Integer.valueOf(request.getParameter("codigoVagon"));
            String marca = request.getParameter("marcaVagon");
            String modelo = request.getParameter("modeloVagon");
            String tipoVagon = request.getParameter("tipoVagon");
            if (tipoVagon.equals("pasajeros")) {
                int numeroAsientos = Integer.valueOf(request.getParameter("numeroAsientosVagon"));
                VagonPasajeros vagonPasajeros = new VagonPasajeros(codigo, marca, modelo, numeroAsientos);
                vagones.add(vagonPasajeros);
                System.out.println(vagonPasajeros);
                session.setAttribute("vagones",vagones);

            } else {
                double capacidadCarga = Double.valueOf(request.getParameter("capacidadCargaVagon"));
                String tipoMercancia = request.getParameter("tipoMercanciaVagon");
                VagonMercancias mercancias = new VagonMercancias(codigo, marca, modelo, capacidadCarga, tipoMercancia);
                vagones.add(mercancias);
                session.setAttribute("vagones",vagones);

                System.out.println(mercancias);

            }
            System.out.println(vagones);

            response.sendRedirect("vagones.jsp");

        
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
