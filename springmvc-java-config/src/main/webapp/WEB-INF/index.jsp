<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>HomePage</title>
    <!-- CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/index.css" rel="stylesheet" type="text/css"/>
    <!-- JS -->
    <script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/menu.sliding.line.js" type="text/javascript"></script>
</head>
<body>
	<div class="login">
        <h3>Sign In</h3>
		    <form class="log" action="/client" class="Sign" method="GET">
     			<input type="text" name="eMail" placeholder="eMail" required="required"/><br>
				<input type="password" name="password" placeholder="password" required="required"/><br>
				<button class="SignIn" type="submit">Sign In</button>                   
     		</form>	
	</div>
</body>
</html>