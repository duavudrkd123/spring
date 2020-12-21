<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert.jsp</title>
</head>
<body>
사원등록/수정
<form:form action="empInsert" method="post" modelAttribute="emp">
<form:input path="firstName" placeholder="firstName" /><br>
<form:input path="lastName" placeholder="lastname" /><br> 
<form:input path="email" placeholder="email"/><br>
<form:select path="jobId" items="${jobs}" itemLabel="jobTitle" itemValue="jobId" /><br>
<!-- <select><option></select><br> 자동으로 만들어지게 -->
<!-- <input name="jobId" placeholder="jobId"><br> -->
<form:select path="departmentId" items="${departments}" itemLabel="departmentName" itemValue="departmentId"/><br>
<%-- <form:input path="departmentId" placeholder="departmentId"/><br> --%>
<form:input path="salary" placeholder="salary"/><br>
<form:input path="hireDate" placeholder="hireDate"/> <br>
<form:button>등록</form:button>
</form:form>
<!-- controller에서 empInsert라고 했다 -->
</body>	
</html>