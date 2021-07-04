<%@page import="dominio.Producto"%>
<%@page import="java.util.List"%>
<%@page import="datos.Fachada"%>
<%@page import="datos.IFachada"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <title>Productos</title>
    </head>
    <body>
        <h1>Productos</h1>
        <table cellspacing='0'>
            <thead>
                <tr>
                    <th>Número de serie</th>
                    <th>Nombre del producto</th>
                    <th>Precio</th>
                    <th>Marca</th>
                </tr>                
            </thead>
            <tbody>
                <tr>
                    <%
                        List<Producto> productos = (List<Producto>) session.getAttribute("listaProductosAux");
                        for (int i = 0; i < productos.size(); i++) {
                            out.print("<tr>"
                                    + "<td scope=\"row\">" + productos.get(i).getNumSerie() + "</td>"
                                    + "<td>" + productos.get(i).getNombre() + "</td>"
                                    + "<td>" + productos.get(i).getPrecio() + "</td>"
                                    + "<td>" + productos.get(i).getMarca() + "</td>"
                                    + "</tr>"
                            );
                        }
                    %>
                </tr>
            </tbody>
            <tfoot>
                <tr>
                    <td colspan='2'>TOTAL</td>
                    <%  double total = 0;
                        for (int i = 0; i < productos.size(); i++) {
                            total += productos.get(i).getPrecio();
                        }
                        out.print("<td colspan='2'>" + total + "</td>");
                    %>

                </tr>
            </tfoot>
        </table>
        <%
            session.removeAttribute("errorPrecio");
        %>
        <br><br>
        <a href="ppal.jsp">Registrar producto ---------></a>
    </body>
</html>
