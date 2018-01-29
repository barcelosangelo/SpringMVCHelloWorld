<%--
  Created by IntelliJ IDEA.
  User: codecadet
  Date: 29/01/2018
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
    <form:form method="post" modelAttribute="user">
        <p>Name: <form:input path="username"/> </p>
        <p>Password: <form:password path="password"/></p>
        <input type="submit" value="Login"/>
    </form:form>
    <div style="color:red">${error}</div>
</body>

</html>