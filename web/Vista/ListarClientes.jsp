<%-- 
    Document   : ListarClientes
    Created on : 29-10-2015, 0:54:40
    Author     : Diego
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    </head>
    <body>
        <h1>Listar Clientes</h1>
        <hr>
        <table>
            <tr>
                <td>Nombre</td>
                <td>Rut</td>
                <td>Direccion</td>
                <td>Email</td>
                <td>Telefono</td>
            </tr>
            <s:iterator value="%{listaClientes}">
                <tr>
                    <td><s:property value="nombre"/></td>
                    <td><s:property value="rutC"/></td>
                    <td><s:property value="direccion"/></td>
                    <td><s:property value="email"/></td>
                    <td><s:property value="telefono"/></td>
                </tr>
            </s:iterator>
        </table>
        
    </body>
</html>
