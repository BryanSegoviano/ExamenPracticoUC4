<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
                    <c:forEach var="productos" items="${listaProductosAux}">
                    <tr>
                        <td>${productos.getNumSerie()}</td>
                        <td>${productos.getNombre()}</td>
                        <td>${productos.getPrecio()}</td>
                        <td>${productos.getMarca()}</td>
                    </tr>
                    </c:forEach>
                </tr>
            </tbody>
            <tfoot>
                <tr>
                    <td colspan='2'>TOTAL</td>
                    <td colspan='2'>${precioTotal}</td>
                </tr>
            </tfoot>
        </table>
        <br><br>
        <a href="ppal.jsp">Registrar producto ---------></a>
    </body>
</html>
