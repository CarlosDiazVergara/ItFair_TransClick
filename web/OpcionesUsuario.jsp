<%-- 
    Document   : OpcionesUsuario
    Created on : 09-sep-2016, 16:31:14
    Author     : alejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%    
            cl.duoc.utils.Usuario usr; 
            usr = (cl.duoc.utils.Usuario) request.getSession().getAttribute("Usuario");   
            %>
        
            <h1>Bienvenido <%= usr.getNombre() %>
        
            
           
            
        </h1>
        <form action="Perfil.jsp">
           <input type="submit" value="Modificar Perfil">
        </form>
        <form action="DetalleConsumo.jsp">
            <br>
            <br>
            <input type="submit" value="Detalle Consumo">
            <br>
            <br>
        </form>
        <form action="Historico.jsp">
            <input type="submit" value="Ver Historico">
            <br>
            <br>
        </form>
        <form action="Multas.jsp">
            <input type="submit" value="Multas">
        </form>
        
        <form action="LoginInicio.jsp">
            <br>
            <br>
            <input type="submit" value="Cerrar Session">
        </form>
            
           
            
            
            
        </form>
        
    </body>
</html>
