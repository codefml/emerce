<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/19
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post" action="/sysUser/loginTest" >
    <input type="text" name="name" value="" placeholder="name"/>
    <input type="password" name="password" value="" placeholder="password"/>
    <input type="submit" name="submit"/>
</form>
    <%=pageContext.getRequest().getServletContext().getContextPath()%>--------
<%=pageContext.getServletContext().getContextPath()%>
</body>
</html>
