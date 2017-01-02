<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="Dashboard">
        <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">
        
        <title>FORMACLUB - Formation en ligne</title>
        <jsp:include page="includes/links.jsp" />
        
    </head>
    
    <body>
        
        <section id="container" >
            
            <jsp:include page="includes/menu.jsp" />
            <jsp:include page="includes/sidebar.jsp" />
            
            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">
                    
                    <div class="row">
                        
                        <div class="col-lg-9 main-chart">
                            <h1 class="titre-accueil-cours">CATALOGUE DES COURS</h1>
                            <div class="row mt">
                                <div class="col-lg-9 main-chart">
                                    <!--
                                    <div>
                                        <h2><a href="/projetLO54/formations">Liste des formations disponibles</a></h2><br/>
                                        <h2><a href="/projetLO54/listCourseSessions">Liste des sessions disponibles</a></h2>
                                    </div>
                                    -->
                                    <form action="/projetLO54/home" method="POST">
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
                                                <a href="/projetLO54/inscription?mode=inscription&courseSessionId=${courseSession.id}">Se préinscrire</a>
                                            </li>
                                            
                                        </c:forEach>
                                    </ul>
                                </div>
                                
                                <c:forEach var="courseSession" items="${requestScope.listeCourseSessions}">
                                <div class="col-md-4 mb">
                                    <!-- WHITE PANEL - TOP USER -->
                                    <div class="white-panel pn">
                                        <div class="white-header">
                                            <h5>TOP USER</h5>
                                        </div>
                                        <p><img src="resources/assets/img/ui-zac.jpg" class="img-circle" width="80"></p>
                                        <p><b><c:out value="${courseSession.course.title}"/></b></p>
                                        <div class="row">
                                            <div class="col-md-6">
                                                <p class="small mt"><c:out value="${courseSession.location.city}"/></p>
                                                <p>2012</p>
                                            </div>
                                            <div class="col-md-6">
                                                <p class="small mt"><c:out value="${courseSession.startDate}"/></p>
                                                <p>$ 47,60</p>
                                            </div>
                                        </div>
                                    </div>
                                </div><!-- /col-md-4 -->
                                </c:forEach>         
                            </div><!-- /row -->     
                            
                            <div class="row mt">
                                <!--CUSTOM CHART START -->
                                <div class="border-head">
                                    <h3>NOMBRE D'ETUDIANTS INSCRITS</h3>
                                </div>
                                <div class="custom-bar-chart">
                                    <ul class="y-axis">
                                        <li><span>10.000</span></li>
                                        <li><span>8.000</span></li>
                                        <li><span>6.000</span></li>
                                        <li><span>4.000</span></li>
                                        <li><span>2.000</span></li>
                                        <li><span>0</span></li>
                                    </ul>
                                    <div class="bar">
                                        <div class="title">LO51</div>
                                        <div class="value tooltips" data-original-title="8.500" data-toggle="tooltip" data-placement="top">85%</div>
                                    </div>
                                    <div class="bar ">
                                        <div class="title">LO54</div>
                                        <div class="value tooltips" data-original-title="5.000" data-toggle="tooltip" data-placement="top">50%</div>
                                    </div>
                                    <div class="bar ">
                                        <div class="title">AD50</div>
                                        <div class="value tooltips" data-original-title="6.000" data-toggle="tooltip" data-placement="top">60%</div>
                                    </div>
                                    <div class="bar ">
                                        <div class="title">MG76</div>
                                        <div class="value tooltips" data-original-title="4.500" data-toggle="tooltip" data-placement="top">45%</div>
                                    </div>
                                    <div class="bar">
                                        <div class="title">MG70</div>
                                        <div class="value tooltips" data-original-title="3.200" data-toggle="tooltip" data-placement="top">32%</div>
                                    </div>
                                    <div class="bar ">
                                        <div class="title">TA72</div>
                                        <div class="value tooltips" data-original-title="6.200" data-toggle="tooltip" data-placement="top">62%</div>
                                    </div>
                                    <div class="bar">
                                        <div class="title">SR50</div>
                                        <div class="value tooltips" data-original-title="7.500" data-toggle="tooltip" data-placement="top">75%</div>
                                    </div>
                                </div>
                                <!--custom chart end-->
                            </div><!-- /row -->	
                            
                        </div><!-- /col-lg-9 END SECTION MIDDLE -->
                        
                        <jsp:include page="includes/rightbar.jsp" />
                        
                    </div><! --/row -->
                </section>
            </section>
            
            <!--main content end-->
            <!--footer start-->
            <jsp:include page="includes/footer.jsp" />
            <!--footer end-->
        </section>
        <jsp:include page="includes/scripts.jsp" />
    </body>
</html>
