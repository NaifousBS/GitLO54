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
        <form action="/projetLO54/listCourseSessions" method="POST">
            <table>
                <tr>
                    <td><input id="filtreFormation" name="filtreFormation" type="text" placeholder="Formation" value="${filtreFormation}"/></td>
                    <td><input id="filtreDate" name="filtreDate" type="text" placeholder="JJ/MM/AAAA" value="${filtreDate}"/></td>
                    <td>
                        <select id="filtreLieu" name="filtreLieu">
                            <option value="---">---</option>
                           
                            <c:forEach var="location" items="${requestScope.listeLocations}">
                                <option value="${location.city}" ${location.city == lieuSelectionne ? 'selected="selected"' : ''}>${location.city}</option>
                            </c:forEach>
                        </select>
                    </td>
                    <td><input type="submit" value="Filtrer"/> </td>
                </tr>

            </table>
        </form>
        <ul>
        <c:forEach var="courseSession" items="${requestScope.listeCourseSessions}">
            <li><c:out value="${courseSession.id}"/>&nbsp;
                <c:out value="${courseSession.course.title}"/>&nbsp;
                <c:out value="${courseSession.location.city}"/>&nbsp;
                <c:out value="${courseSession.startDate}"/>&nbsp;
                <c:out value="${courseSession.endDate}"/>&nbsp;
                <a href="/projetLO54/listCourseSessions?mode=inscription&courseSessionId=${courseSession.id}">Se préinscrire</a>
            </li>
            
        </c:forEach>
        </ul>
    </body>
</html>
