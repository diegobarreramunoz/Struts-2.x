<%-- 
    Document   : AgregarCliente
    Created on : 29-10-2015, 0:54:08
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
        <h1>Registrar Cliente</h1>
        <hr>
        <s:form action="agregarCliente" method="post">
            <s:textfield label="Nombre" name="cliente.nombre"/>
            <s:textfield label="Rut" name="cliente.rutC"/>
            <s:textfield label="Telefono" name="cliente.telefono"/>
            <s:textfield label="Direccion" name="cliente.direccion"/>
            <s:textfield label="Email" name="cliente.email"/>
            <s:submit value="Enviar"/>
        </s:form>
        <s:label value="%{msg}"/>
    </body>
</html>
