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
3116_������<br/>
1~100���� ���� ¦���� ����=<%= sum %>
</body>
</html>