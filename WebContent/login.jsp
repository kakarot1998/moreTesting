<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>hhhhhhhhhhhhhhhhh</title>
</head>
<body>
<form action="login" method="post">
nom:<input type="text" name="nom"/><br />
<input type="submit" value="envoyer"/>











</form><br />
<b><%

String res = (String)request.getAttribute("message");
	if(res!=null){out.println(res);}
	else{
		out.println("ma3ndi mangul");
	}




%></b>
</body>
</html>