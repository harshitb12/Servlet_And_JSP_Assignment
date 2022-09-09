<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Long n1 = Long.parseLong(request.getParameter("n1"));
Long n2 = Long.parseLong(request.getParameter("n2"));
Long n3 = Long.parseLong(request.getParameter("n3"));
%>

Addition of <%= n1%>, <%= n2%> and <%= n3%> is <%=n1+n2+n3 %><br><br>
Subtraction of <%= n1%>, <%= n2%> and <%= n3%> is <%=n1-n2-n3 %><br><br>
Multiplication of <%= n1%>, <%= n2%> and <%= n3%> is <%=n1*n2*n3 %><br><br>

</body>
</html>