<%--
  Created by IntelliJ IDEA.
  User: faneva
  Date: 23/11/2023
  Time: 15:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<jsp:include page="../../header.jsp"></jsp:include>
<body>
<%@include file="menu.jsp"%>
<div class="container">
    <h1>
        Ajout d'un livre
    </h1>
    <form method="post" action="ajouter-livre">
        <div class="mb-3">
            <label class="form-label">Titre:</label>
            <input class="form-control" type="text" name="titre" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Auteur:</label>
            <input class="form-control" type="text" name="auteur" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Annee:</label>
            <input class="form-control" type="text" name="annee" required>
        </div>
        <div class="mb-3">
            <label class="form-label">Genre:</label>
            <input class="form-control" type="text" name="genre" required>
        </div>

        <input class="btn btn-primary" type="submit" value="Ajouter">
    </form>
</div>
</body>
</html>
