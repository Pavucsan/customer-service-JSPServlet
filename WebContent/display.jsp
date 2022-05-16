<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="xyz" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<!-- <%
		String name = request.getAttribute("lable").toString();
		out.println(name);
	%> 
	 -->
	${lable}
	
	<xyz:out value="${lable}" />
	<xyz:out value="Hello JSTL" />
	
	<xyz:import url="http://www.google.com"></xyz:import>
</body>
</html>