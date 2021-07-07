<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@page import="dominio.Marca"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
        <title>Registro de producto</title>
    </head>
    <body>
        <h1>Registro de producto</h1>
        <form action="RegistrarProducto" method="POST">
            <fieldset>

                <legend>Producto</legend>

                <label for="txtNumSerie">Num. de serie:</label>
                <input id="txtNumSerie" type="text" name="txtNumSerie" required><br />

                <label for='txtNombre'>Nombre:</label>
                <input id="txtNombre" type="text" name="txtNombre" required><br />

                <label for='txtPrecio'>Precio:</label>
                <b>$</b><input id="txtPrecio" type="number" name="txtPrecio" min='0' max='100000' size='6' step=".01" required><b>M.N.</b><br />

                <label for="selMarca">Marca:</label>                            
                <select id="selMarca" name="selMarca" required> 
                    <optgroup label="= Seleccione una =">
                        <c:forEach var="marcas" items="${listaMarcasAux}">
                            <option value="${marcas.getNombre()}">${marcas.getNombre()}</option>
                        </c:forEach>
                </select><br /> 
                <label for='txaDesc'>Descripción:</label>
                <textarea id='txaDesc' name='txaDesc' required></textarea><br /> 
                <label>&nbsp;</label>
                <input type="submit" name="submit" value="Guardar"><br />
            </fieldset>
        </form>
        <h3 style="color:red">${errorPrecio}</h3>
        <a href="listaProductos.jsp"><--------- Lista de productos (Tabla)</a>
    </body>
</html>
