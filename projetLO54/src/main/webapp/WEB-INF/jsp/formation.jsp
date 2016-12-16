<%-- 
    Document   : formation
    Created on : 3 déc. 2016, 19:02:18
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
        <ul>
        <c:forEach var="formation" items="${requestScope.listeFormations}">
            <li>
                <c:out value="${formation.title}"/>&nbsp;
                <a href='/projetLO54/courseSessions?courseCode=${formation.code}'>Liste des sessions</a>
            </li>
            
        </c:forEach>
        </ul>
    </body>
</html>
