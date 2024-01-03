<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.servlet.cookies.Dbconnection,java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
    <form action="EmployeeServlet" method="post">
        firstName: <input type="text" name="firstname" required><br>
        lastname: <input type="text" name="lastname" required><br>
        email: <input type="email" name="email" required><br>
                password: <input type="text" name="password" required><br>
                address: <input type="text" name="address" required><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
