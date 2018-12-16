<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>${samplePojo.name}</h1>
<p>${samplePojo.cities[0]}</p>
<c:forEach items="${samplePojo.cities}" var="cities" begin="0">
  <li><a href="/index" target="_blank"><c:out value="${cities}"/></a></li>
</c:forEach>
</body>
</html>