<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>Registration Page</title>

</head>

<body>

<form:form action="/SpringApplication/user/add" method="post" modelAttribute="user">

                Enter Name :      <input type = "text" name ="userName"/>

                Enter Password : <input type = "password" name ="password"/>

                Enter Email : <input type = "text" name ="email"/>

                Enter Address : <input type = "text" name ="userAddr"/>

                <input type ="submit" value ="Submit"/>

</form:form>

</body>

</html>