<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>input Hello</title>
</head>
<body>
	<form action="<%= request.getContextPath() %>/hello" method="post">

	    <p>メッセージ<input type="text" name="message"></p>

	    <p><input type="submit" name="submit" value="送信" ></p>

 	</form>

</body>
</html>