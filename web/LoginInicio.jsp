<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%-- 
    Document   : LoginInicio
    Created on : 07-09-2016, 19:58:49
    Author     : CETECOM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>INICIAR SESSION</h1>
        
        <form action="LoginServlet" method="get">
            
           
            Usuario: 
            <input type="text" name="txtNombre">
            <br>
            <br>
            Contraseña:
            <input type="text" name="txtContrasena">
            <br>
            <br>
            <input type="checkbox" name="cbxRecorcdarme">
            Recordarme
            <br>
            <input type="submit" value="Iniciar Sesion">
        </form>
        
    </body>
</html>