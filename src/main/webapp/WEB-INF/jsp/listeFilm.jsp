<%--
  Created by IntelliJ IDEA.
  User: faneva
  Date: 01/12/2023
  Time: 18:34
  To change this template use File | Settings | File Templates.
--%>
<%--
Changer dans pom.xml la vesion de jst en 3.0.0
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../../header.jsp"></jsp:include>
<body>
<%@include file="menu.jsp"%>
<div class="container">
    <h1>Liste des Films</h1>
    <ul>
        <%--@elvariable id="listeLivres" type="java.util.List"--%>
        <c:forEach var="film" items="${listeFilm}" varStatus="loop">
            <li>${film.getTitre()} - ${film.getAuteur()} - ${film.getAnnee()} - ${film.getGenre()}

            </li>
        </c:forEach>
    </ul>
</div>
</body>
</html>
