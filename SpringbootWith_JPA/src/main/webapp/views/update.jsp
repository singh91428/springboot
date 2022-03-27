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
        background-color: aqua;
        padding: 14px;
        border-radius: 7px;
    }
    td{
        font-size: medium;
        padding: 5px 15px;
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
    input[type="submit"],input[type="reset"]{
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
<body>
<form action="save">
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
     <tr>
        <td><input type="text" value="${emp.id }" name="id" readonly/></td>
        <td><input type="text" value="${emp.name }" name="name"></td>
        <td><input type="text" value="${emp.email }" name="email"></td>
        <td><input type="text" value="${emp.dob }" name="dob"></td>
        <td><input type="text" value="${emp.age }" name="age"></td>
        <td><input type="text" value="${emp.salary }" name="salary"></td>
        <td><input type="text" value="${emp.status }" name="status"></td>
     </tr>
<tr>
         <td colspan="3"><input type="submit" value="Update"></td>
         <td colspan="3"><input type="reset" value="Reset"></td>
         <td colspan="3"><a href="/">Main Page</a></td>
     </tr>
</table>
</form>
</body>
</html>