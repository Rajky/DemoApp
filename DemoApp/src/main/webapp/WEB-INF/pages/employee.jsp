<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>welcome to spring mvc App</h3>
	<form:form action="/show" modelAttribute="employeee" method="post">
	 	
	EmployeeID:<form:input path="empId" />
	Employee Name:<form:input path="empName" /> 

	</form:form>
	${message}

</body>
</html>