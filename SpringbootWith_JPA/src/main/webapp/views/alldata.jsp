<%@page import="java.util.List"%>
<%@page import="com.sb.web.service.UserService"%>
<%@page import="com.sb.web.dao.UserRepository"%>
<%@page import="org.springframework.beans.factory.annotation.Autowired"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>users data</title>
<style>
    *{
        color: blue;
        font-family: Verdana, Geneva, Tahoma, sans-serif;
        text-align: center;
    }
    table{
        margin-left: auto;
        margin-right: auto;
        background-color: aqua;
        padding: 14px;
        border-radius: 7px;
    }
    td{
        font-size: medium;
        padding: 5px 15px;
        border-left: 1px solid white;
    }
    a{
        text-decoration: none;
        padding: 5px 10px;
        color: red;
        border-radius: 7px;
    }
    a:hover{
        background-color:red;
        color: aqua;
    }
    h2{
    text-align: center;
    color: brown;
    }
    input[type="submit"]{
        padding: 5px 10px;
        background-color:black;
        color:white;
        border-radius: 7px;
    }
    input[type="submit"]:hover{
        padding: 5px 10px;
        background-color:white;
        color:black;
        
        transition: 0.9ms;
    }
</style>
</head>
<body style="background-color: bisque;">
<h2>All User Data</h2>
<form action="add">
<table>
		<tr>
		<th>ID</th>
		<th>NAME</th>
		<th>EMAIL</th>
		<th>DOB</th>
		<th>AGE</th>
		<th>SALARY</th>
		<th>STATUS</th>
     	</tr>
<c:forEach var="user" items="${data }">
     <tr>
        <td><c:out value="${user.id}" /></td>
        <td><c:out value="${user.name}" /></td>
        <td><c:out value="${user.email}" /></td>
        <td><c:out value="${user.dob}" /></td>
        <td><c:out value="${user.age}" /></td>
        <td><c:out value="${user.salary}" /></td>
        <td><c:out value="${user.status}" /></td>
        <td><a href="delete?id=${user.id }">Delete</a></td>
        <td><a href="get?id=${user.id}">Update</a></td>
     </tr>
</c:forEach>
</table>
<input type="submit" value="ADD">
</form>
</body>
</html>