<%-- 
    Document   : index
    Created on : 02-10-2022, 21:35:29
    Author     : lainpunk1
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Evaluacion 2 CIISA</title>
    </head>
    <body>
        <h1>Registro de Animes</h1>
        
        <form name="form" action="proceso" method="get">
            <label>Id</label> <br>
            <input type="text" name="id" value="" /> <br>
            <label>Nombre</label> <br>
            <input type="text" name="nombre" value="" /> <br>
            <label>Genero</label> <br>
            <input type="text" name="genero" value="" /> <br>
            <label>Autor</label> <br>
            <input type="text" name="autor" value="" /> <br>
            <label>Estudio</label> <br>
            <input type="text" name="estudio" value="" /> <br>
            <br>
            <input type="submit" value="Enviar" name="btn" />
        </form>
        
    </body>
</html>
