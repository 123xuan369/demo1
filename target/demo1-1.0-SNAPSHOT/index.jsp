<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World </title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="HomeworkServlet">Hello Servlet</a>
<form method="">
    Name:<input type="text" name="name"><br/>
    ID:<input type="text" name="ID"><br/>
    <input type="submit" value="Send data to server"/>
    </form>
</body>