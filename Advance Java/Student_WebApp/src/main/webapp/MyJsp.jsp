<%@ page import="com.example.student_webapp.StudentService" %>
<%@page import="java.sql.ResultSet"%><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 11/3/2023
  Time: 4:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:useBean id="s" class="com.example.student_webapp.Student" scope="application"/>
<jsp:setProperty name="s" property="rollno" param="t1"/>
<jsp:setProperty name="s" property="name" param="t2"/>
<jsp:setProperty name="s" property="address" param="t3"/>
<jsp:setProperty name="s" property="city" param="t4"/>
<%
    StudentService studentService = new StudentService();

    if (studentService.insertRecord(s)!=0){
        System.out.println("Inserted");
    }
    else {
        System.out.println("Not Insserted");
    }
%>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html>
