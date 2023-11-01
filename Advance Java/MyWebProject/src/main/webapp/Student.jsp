<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 11/1/2023
  Time: 2:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.sql.*" %>
<%@ page import="java.io.PrintWriter" %>

<%
    Connection connection;
    String rn=request.getParameter("t1");
    String nm=request.getParameter("t2");
    String ad=request.getParameter("t3");
    String ct=request.getParameter("t4");
  Class.forName("com.mysql.cj.jdbc.Driver");
  System.out.println("Driver Loaded");
  connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/MYSQL_database" ,"root","#aqi5r1");
   System.out.println("connection Establish");


       PreparedStatement preparedStatement= connection.prepareStatement("insert into HVPM_student value(?,?,?,?)");


        preparedStatement.setString(1,rn);
        preparedStatement.setString(2,nm);
        preparedStatement.setString(3,ad);
        preparedStatement.setString(4,ct);
        int rv=preparedStatement.executeUpdate();
        PrintWriter printWriter=response.getWriter();
        if(rv!=0)
            printWriter.println("Inserted");
        else
            printWriter.println("Not Inserted");

%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>

           <%="Inserted"%>

<%=" Not Inserted"%>
