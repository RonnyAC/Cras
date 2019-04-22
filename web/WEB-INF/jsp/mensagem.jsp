<%-- 
    Document   : mensagem
    Created on : 14/04/2019, 16:22:28
    Author     : Ronnie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/css/bootstrap.css"/>
        <script src="resources/js/jQuery.js"></script>
        <script src="resources/js/popper.js" ></script>
        <script src="resources/js/bootstrap.js"></script>
        <title>JSP Page</title>
    </head>
    <body>
         <jsp:include page="index.jsp"/>
        <h1>Olá,${retorno}, obrigado por cadastrar</h1>
    </body>
</html>
