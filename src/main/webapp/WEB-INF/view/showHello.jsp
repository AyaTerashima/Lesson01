<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String name = request.getParameter("message");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>show Hello</title>
</head>
<body>
<p>
結果です<br>

<%= request.getAttribute("message") %>

</p>
</body>
</html>