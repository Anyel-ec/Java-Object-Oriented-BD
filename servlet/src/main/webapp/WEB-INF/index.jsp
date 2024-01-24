<%--
  Created by IntelliJ IDEA.
  User: anyel
  Date: 15/1/2024
  Time: 8:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Administrar Autos</title>
</head>
<body>
 <h1>Lista de Autos</h1>
<table border="1">
    <tr>
        <th>Placa</th>
        <th>Marca</th>
        <th>Modelo</th>
        <th>Color</th>
        <th>Estado</th>
        <th>Acciones</th>
    </tr>
    <c:forEach items="${listaAutos}" var="auto">
        <tr>
            <td><></td>
            <td>${auto.marca}</td>
            <td>${auto.modelo}</td>
            <td>${auto.color}</td>
            <td>${auto.estado}</td>
            <td>
                <a href="editarAuto.jsp?placa=${auto.placa}">Editar</a>
                <a href="eliminarAuto.jsp?placa=${auto.placa}">Eliminar</a>
            </td>
        </tr>
</table>
</body>
</html>