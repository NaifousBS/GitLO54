<%-- 
    Document   : formation
    Created on : 3 d�c. 2016, 19:02:18
    Author     : Souf
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des formations</title>
    </head>
    <body>
        <h1>Liste des formations</h1>
        <c:forEach var="formation" items="${requestScope.listeFormations}">
            <li><c:out value="${formation.title}"/></li>
        </c:forEach>
    </body>
</html>
