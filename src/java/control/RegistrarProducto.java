/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dominio.Marca;
import dominio.Producto;
import datos.Fachada;
import datos.IFachada;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Bryan
 */
public class RegistrarProducto extends HttpServlet {

    public final IFachada fachada = new Fachada();

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
            out.println("<title>Servlet RegistrarProducto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrarProducto at " + request.getContextPath() + "</h1>");
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
        String numSerie = request.getParameter("txtNumSerie");
        String nombre = request.getParameter("txtNombre");
        String precio = request.getParameter("txtPrecio");
        String marca = request.getParameter("selMarca");
        String descripcion = request.getParameter("txaDesc");
        
        HttpSession session = request.getSession();
        
        double precioConvertido = Double.parseDouble(precio);
        if (precioConvertido > 100) {
            session.setAttribute("errorPrecio", "ERROR: Debe de ingresar un precio menor o igual a $100");
            response.sendRedirect("ppal.jsp");
            return;
        }
                
        Marca marcaConvertida = fachada.buscarNombreMarca(marca);

        Producto productoNuevo = new Producto(numSerie, nombre, descripcion, precioConvertido, marcaConvertida);

        fachada.guardarProducto(productoNuevo);

        List<Producto> listaProductos = this.fachada.buscarTodasProducto();
        session.setAttribute("listaProductosAux", listaProductos);

        request.getRequestDispatcher("listaProductos.jsp").forward(request, response);
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
