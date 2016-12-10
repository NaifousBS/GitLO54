<%-- 
    Document   : formation
    Created on : 3 déc. 2016, 19:02:18
    Author     : Souf
--%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Liste des sessions</title>
    </head>
    <body>
        <h1>Liste des sessions</h1>
        <ul>
        <c:forEach var="courseSession" items="${requestScope.listeCourseSessions}">
            <li><c:out value="${courseSession.id}"/>&nbsp;
                <c:out value="${courseSession.startDate}"/>&nbsp;
                <c:out value="${courseSession.endDate}"/>&nbsp;
                <c:out value="${courseSession.location.city}"/>&nbsp;
                <c:out value="${courseSession.course.title}"/>&nbsp;
            </li>
        </c:forEach>
        </ul>
    </body>
</html>
