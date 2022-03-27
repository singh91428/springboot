<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h1>Enter Employee Details</h1>
<form action="save">
<table>
<tr>
<td>NAME</td>
<td><input type="text" name="name"></td>
</tr>
<tr>
<td>EMAIL</td>
<td><input type="email" name="email"></td>
</tr>
<tr>
<td>DOB</td>
<td><input type="date" name="dob"></td>
</tr>
<tr>
<td>AGE</td>
<td><input type="text" name="age"></td>
</tr>
<tr>
<td>SALARY</td>
<td><input type="text" name="salary"></td>
</tr>
<tr>
<td>STATUS</td>
<td><select name="status">
<option value="true">Active</option>
<option value="false">Inactive</option>
</select></td>
</tr>
<tr>
<td><input type="submit" value="save"></td>
<td><a href="/">MainPage</a></td>
</tr>
</table>
</form>
</body>
</html>