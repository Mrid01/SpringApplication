<%@ page language="java" contentType="text/html; charset=ISO-8859-1"

    pageEncoding="ISO-8859-1" isELIgnored="false"%>

    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>

<html>

<head>

<meta charset="ISO-8859-1">

<title>List of Users</title>

</head>

<body>

<br>

<h3>User List</h3>

<%-- <c:if test="${!empty listUsers}"> --%>

                <table class="tg">

                <tr>

                                <th width="80">User Email</th>

                                <th width="120">User Name</th>

                                <th width="120">User Address</th>

                                <th width="60">Edit</th>

                                <th width="60">Delete</th>

                </tr>

                <c:forEach items="${listUsers}" var="user">

                                <tr>

                                                <td>${user.email}</td>

                                                <td>${user.userName}</td>

                                                <td>${user.userAddr}</td>

                                                <td><a href="<c:url value='/edit/${user.userId}' />" >Edit</a></td>

                                                <td><a href="<c:url value='/remove/${user.userId}' />" >Delete</a></td>

                                </tr>

                </c:forEach>

                </table>

<%-- </c:if> --%>

</body>

</html>