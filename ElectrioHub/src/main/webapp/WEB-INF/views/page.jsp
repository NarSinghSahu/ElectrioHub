<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <meta name="viewport" content="width=device-width, initial-scale=1">
 
 <!-- Materialize Compiled and minified CSS -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/css/materialize.min.css">

  <!--Materialized Compiled and minified JavaScript -->
  <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.100.2/js/materialize.min.js"></script>
<title></title>
</head>
<body>

<%@ include file="./shared/navbar.jsp" %>

<c:if test="${isHome == true }">

	<%@ include file="./home.jsp" %>
</c:if>
<c:if test="${isLogin == true }">

	<%@ include file="./login.jsp" %>
</c:if>

<%@ include file="./shared/footer.jsp" %>

<!-- TODO : load bagit.jsp here  -->
</body>
</html>