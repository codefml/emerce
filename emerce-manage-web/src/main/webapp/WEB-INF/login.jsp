<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html >
<head>
    <!--
    <meta  http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    -->
    <title>login</title>
</head>
<body>
<form method="post" action="/sysUser/login" >
    用户名：<input type="text" id="loginName" name="loginName" value="" placeholder="loginName"/>
    <br/>
    密码：<input type="password" id="password" name="password" value="" placeholder="password"/>
    <br/>
    <input type="submit" name="submit"/>
</form>
</body>
</html>
