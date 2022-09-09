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
%>

Sum of <%= n1%> and <%=n2 %> is <%= n1+ n2 %>
</body>
</html>