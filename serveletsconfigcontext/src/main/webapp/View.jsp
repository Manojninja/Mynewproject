<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
  <%@ page import="com.servlet.cookies.Dbconnection,java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <title>Employee View </title>
</head>
<body>
<%
Connection con=Dbconnection.getConnection();
Statement stmt=con.createStatement();
ResultSet rs=stmt.executeQuery("Select * from registrationform");
%>
<table>
<tr>
<th>firstname</th>
<th>lastname</th>
<th>email</th>
<th>address</th>
</tr>
<% while(rs.next()){%>
<tr>
<td> <%=rs.getString(1) %></td>
<td> <%=rs.getString(2) %></td>
<td> <%=rs.getString(3) %></td>
<td> <%=rs.getString(5) %></td>
<td><a href="Edit.jsp?firstname=<%=rs.getString(1)%>" >Edit</a></td>
<td><a href="delete.jsp">Delete</a></td>
</tr>



<%} %>







</table>
</body>
</html>
