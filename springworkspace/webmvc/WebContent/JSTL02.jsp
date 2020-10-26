<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<c:forEach var="i" begin="1" end="10" step="1">
   <font color="red" size="${i}">야호~~</font><br>
</c:forEach>
<c:set var="sum" value="0"/>
<c:forEach var="i" begin="1" end="10" step="1">
   <c:if test="${i%2==0}">
       <c:set var="sum" value="${i+sum}"/>  
   </c:if>
</c:forEach>
 짝수의 총합=${sum}
</body>
</html>