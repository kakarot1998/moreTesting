<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>mr7ba</title>
</head>
<body>
<b><%
String res = (String)request.getAttribute("message");
out.println(res);

%></b>

</body>
</html>