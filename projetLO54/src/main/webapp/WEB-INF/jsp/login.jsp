<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="fr">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <title>Connexion</title>
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/resources/assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="${pageContext.request.contextPath}/resources/assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
    <!-- Custom styles for this template -->
    <link href="${pageContext.request.contextPath}/resources/assets/css/style.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/assets/css/style-responsive.css" rel="stylesheet">
  </head>
  
  <body>
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
	  <div id="login-page">
	  	<div class="container">
		      <form class="form-login" action="/projetLO54/connexion" method="POST">
		        <h2 class="form-login-heading">Formulaire</h2>
		        <div class="login-wrap">
		            <input id="inputNom" name="inputNom" type="text" class="form-control" placeholder="Nom" autofocus required pattern="[a-zA-Z]{2,}">
		            <br>
		            <input id="inputPrenom" name="inputPrenom" type="text" class="form-control" placeholder="Prénom" required>
                            <br>
		            <input id="inputAdresse" name="inputAdresse" type="text" class="form-control" placeholder="Adresse" required>
                            <br>
		            <input id="inputNumTel" name="inputNumTel" type="text" class="form-control" placeholder="Numéro de téléphone" pattern="[0-9]{10}" required >
                            <br>
                            <input id="inputEmail" name="inputEmail" type="text" class="form-control" placeholder="Email" required>
                            <br>
		            <button class="btn btn-theme btn-block" type="submit"><i class="fa "></i> Accéder au site</button>
		            <hr>
		        </div>
		      </form>	  
	  	</div>
	  </div>
    <!-- js placed at the end of the document so the pages load faster -->
    <script src="${pageContext.request.contextPath}/resources/assets/js/jquery.js"></script>
    <script src="${pageContext.request.contextPath}/resources/assets/js/bootstrap.min.js"></script>
    <!--BACKSTRETCH-->
    <!-- You can use an image of whatever size. This script will stretch to fit in any screen size.-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/assets/js/jquery.backstretch.min.js"></script>
    <script>
        $.backstretch("${pageContext.request.contextPath}/resources/assets/img/login-bg.jpg", {speed: 500});
    </script>
  </body>
</html>

