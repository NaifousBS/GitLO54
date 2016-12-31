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
            
            <!-- **********************************************************************************************************************************************************
            MAIN CONTENT
            *********************************************************************************************************************************************************** -->
            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">
                    
                    <div class="row">
                        
                        <div class="col-lg-9 main-chart">
                            <h1 style="text-align: center">ACCUEIL DES COURS</h1>
                            <div class="row mt">
                                <div class="col-lg-9 main-chart">
                                    <div>
                                        <h2><a href="/projetLO54/formations">Liste des formations disponibles</a></h2><br/>
                                        <h2><a href="/projetLO54/listCourseSessions">Liste des sessions disponibles</a></h2>
                                    </div>
                                    
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
                                <div class="col-md-4 mb">
                                    <!-- WHITE PANEL - TOP USER -->
                                    <div class="white-panel pn">
                                        <div class="white-header">
                                            <h5>TOP USER</h5>
                                        </div>
                                        <p><img src="resources/assets/img/ui-zac.jpg" class="img-circle" width="80"></p>
                                        <p><b>Zac Snider</b></p>
                                        <div class="row">
                                            <div class="col-md-6">
                                                <p class="small mt">MEMBER SINCE</p>
                                                <p>2012</p>
                                            </div>
                                            <div class="col-md-6">
                                                <p class="small mt">TOTAL SPEND</p>
                                                <p>$ 47,60</p>
                                            </div>
                                        </div>
                                    </div>
                                </div><!-- /col-md-4 -->             
                            </div><!-- /row -->     
                            
                            <div class="row mt">
                                <!--CUSTOM CHART START -->
                                <div class="border-head">
                                    <h3>VISITS</h3>
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
                                        <div class="title">JAN</div>
                                        <div class="value tooltips" data-original-title="8.500" data-toggle="tooltip" data-placement="top">85%</div>
                                    </div>
                                    <div class="bar ">
                                        <div class="title">FEB</div>
                                        <div class="value tooltips" data-original-title="5.000" data-toggle="tooltip" data-placement="top">50%</div>
                                    </div>
                                    <div class="bar ">
                                        <div class="title">MAR</div>
                                        <div class="value tooltips" data-original-title="6.000" data-toggle="tooltip" data-placement="top">60%</div>
                                    </div>
                                    <div class="bar ">
                                        <div class="title">APR</div>
                                        <div class="value tooltips" data-original-title="4.500" data-toggle="tooltip" data-placement="top">45%</div>
                                    </div>
                                    <div class="bar">
                                        <div class="title">MAY</div>
                                        <div class="value tooltips" data-original-title="3.200" data-toggle="tooltip" data-placement="top">32%</div>
                                    </div>
                                    <div class="bar ">
                                        <div class="title">JUN</div>
                                        <div class="value tooltips" data-original-title="6.200" data-toggle="tooltip" data-placement="top">62%</div>
                                    </div>
                                    <div class="bar">
                                        <div class="title">JUL</div>
                                        <div class="value tooltips" data-original-title="7.500" data-toggle="tooltip" data-placement="top">75%</div>
                                    </div>
                                </div>
                                <!--custom chart end-->
                            </div><!-- /row -->	
                            
                        </div><!-- /col-lg-9 END SECTION MIDDLE -->
                        
                        
                        <!-- **********************************************************************************************************************************************************
                        RIGHT SIDEBAR CONTENT
                        *********************************************************************************************************************************************************** -->                  
                        
                        <div class="col-lg-3 ds">
                            <!--COMPLETED ACTIONS DONUTS CHART-->
                            <h3>NOTIFICATIONS</h3>
                            
                            <!-- First Action -->
                            <div class="desc">
                                <div class="thumb">
                                    <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                                </div>
                                <div class="details">
                                    <p><muted>il y a 2 Minutes</muted><br/>
                                    <a href="#">James Brown</a> s'est inscrit au cours LO51.<br/>
                                    </p>
                                </div>
                            </div>
                            <!-- Second Action -->
                            <div class="desc">
                                <div class="thumb">
                                    <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                                </div>
                                <div class="details">
                                    <p><muted>il y a 3 Heures</muted><br/>
                                    <a href="#">Diana Kennedy</a> a commenté une publication.<br/>
                                    </p>
                                </div>
                            </div>
                            <!-- Third Action -->
                            <div class="desc">
                                <div class="thumb">
                                    <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                                </div>
                                <div class="details">
                                    <p><muted>il y a 7 Heures</muted><br/>
                                    <a href="#">Brandon Page</a> a recommandé le cours LO54.<br/>
                                    </p>
                                </div>
                            </div>
                            <!-- Fourth Action -->
                            <div class="desc">
                                <div class="thumb">
                                    <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                                </div>
                                <div class="details">
                                    <p><muted>il y a 11 Heures</muted><br/>
                                    <a href="#">Mark Twain</a> a commencé un nouveau cours.<br/>
                                    </p>
                                </div>
                            </div>
                            <!-- Fifth Action -->
                            <div class="desc">
                                <div class="thumb">
                                    <span class="badge bg-theme"><i class="fa fa-clock-o"></i></span>
                                </div>
                                <div class="details">
                                    <p><muted>il y a 18 Heures</muted><br/>
                                    <a href="#">Daniel Pratt</a> a noté le cours MG76.<br/>
                                    </p>
                                </div>
                            </div>
                            
                            <!-- USERS ONLINE SECTION -->
                            <h3>ETUDIANTS CONNECTES</h3>
                            <!-- First Member -->
                            <div class="desc">
                                <div class="thumb">
                                    <img class="img-circle" src="resources/assets/img/ui-divya.jpg" width="35px" height="35px" align="">
                                </div>
                                <div class="details">
                                    <p><a href="#">DIVYA MANIAN</a><br/>
                                    <muted>En ligne</muted>
                                    </p>
                                </div>
                            </div>
                            <!-- Second Member -->
                            <div class="desc">
                                <div class="thumb">
                                    <img class="img-circle" src="resources/assets/img/ui-sherman.jpg" width="35px" height="35px" align="">
                                </div>
                                <div class="details">
                                    <p><a href="#">DJ SHERMAN</a><br/>
                                    <muted>Occupé</muted>
                                    </p>
                                </div>
                            </div>
                            <!-- Third Member -->
                            <div class="desc">
                                <div class="thumb">
                                    <img class="img-circle" src="resources/assets/img/ui-danro.jpg" width="35px" height="35px" align="">
                                </div>
                                <div class="details">
                                    <p><a href="#">DAN ROGERS</a><br/>
                                    <muted>En ligne</muted>
                                    </p>
                                </div>
                            </div>
                            <!-- Fourth Member -->
                            <div class="desc">
                                <div class="thumb">
                                    <img class="img-circle" src="resources/assets/img/ui-zac.jpg" width="35px" height="35px" align="">
                                </div>
                                <div class="details">
                                    <p><a href="#">Zac Sniders</a><br/>
                                    <muted>En ligne</muted>
                                    </p>
                                </div>
                            </div>
                            <!-- Fifth Member -->
                            <div class="desc">
                                <div class="thumb">
                                    <img class="img-circle" src="resources/assets/img/ui-sam.jpg" width="35px" height="35px" align="">
                                </div>
                                <div class="details">
                                    <p><a href="#">Marcel Newman</a><br/>
                                    <muted>En ligne</muted>
                                    </p>
                                </div>
                            </div>
                            
                            <!-- CALENDAR-->
                            <div id="calendar" class="mb">
                                <div class="panel green-panel no-margin">
                                    <div class="panel-body">
                                        <div id="date-popover" class="popover top" style="cursor: pointer; disadding: block; margin-left: 33%; margin-top: -50px; width: 175px;">
                                            <div class="arrow"></div>
                                            <h3 class="popover-title" style="disadding: none;"></h3>
                                            <div id="date-popover-content" class="popover-content"></div>
                                        </div>
                                        <div id="my-calendar"></div>
                                    </div>
                                </div>
                            </div><!-- / calendar -->
                            
                        </div><!-- /col-lg-3 -->
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
