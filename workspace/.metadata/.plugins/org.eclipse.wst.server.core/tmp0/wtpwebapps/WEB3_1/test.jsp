<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%! 
	public int hap(){
		int sum = 0;
		for(int i=1; i<=10; i++){
			sum += i;
		}
		return sum;
	}
%>
<%-- JSP�ǽ� --%>
<!-- JSP�ǽ� -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
  int v = hap();
%>
<table border="1">
	<tr>
		<td>���(3116 ������)</td>
		<td><%=v%></td>
	</tr>
</table>
</body>
</html>