<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Contact</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
<link rel="stylesheet" href="css/form.css" type="text/css">
</head>
<body>

<jsp:include page="header.jsp"></jsp:include>

<div class="container">

<h2 class="titleContainer"> Contactez-nous :</h2>

<div class="formulaire">
<form action="contactSave.jsp">

		<input type="text" name="nom" placeholder="Nom"/><br />  
		<input type="text" name="email" placeholder="Email"/><br />
		<input type="text" name="message" placeholder="Message"/><br /> 
		
		<input type="submit" value="Submit" />

	</form>
	</div>
</div>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>