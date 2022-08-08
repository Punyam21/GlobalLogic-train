<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>WELCOME TO HOME</h1>
<form action="HomeController" method="post">
        <p>Enter the id:</p>
        <input type=number name="eid">
        <p>Enter the name:</p>
        <input type="text" name="name">
        <p>Enter the address:</p>
        <input type="text" name="add">
        <p>Enter the age:</p>
        <input type=number name="age">
        <p>Enter the salary:</p>
        <input type=number name="sal">
         <p><input type="submit" value="Submit">
              </form>
</body>
</html>