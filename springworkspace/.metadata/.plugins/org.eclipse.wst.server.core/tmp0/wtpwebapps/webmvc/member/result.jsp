<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 
	int sum = (int)request.getAttribute("data"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
-------------<br/>
3116_정상현<br/>
1~100까지 수중 짝수의 총합=<%= sum %>
</body>
</html>