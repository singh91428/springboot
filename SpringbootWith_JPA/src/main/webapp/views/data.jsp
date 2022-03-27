<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
    *{
        color: blue;
        font-family: Verdana, Geneva, Tahoma, sans-serif;
        text-align: center;
    }
    table{
        margin-left: auto;
        margin-right: auto;
    }
    td{
        font-size: large;
        padding: 10px 15px;
    }
    a{
        text-decoration: none;
        padding: 5px 10px;
        background-color: cadetblue;
        color: brown;
    }
    h2{
    text-align: center;
    color: brown;
    }
</style>
</head>
<body>
<table>
<tr>
<td>id</td>
<td>${emp.id }</td>
</tr>
<tr>
<td>name</td>
<td>${emp.name }</td>
</tr>
<tr>
<td>age</td>
<td>${emp.age }</td>
</tr>
<tr>
<td colspan="2"><a href="/">MainPage</a></td>
</tr>
</table>
</body>
</html>