<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:sitemesh="http://java.sun.com/jsf/composite">
<head>
    <title>
        <sitemesh:write property='title'/>
    </title>
    <sitemesh:write property='head'/>
</head>
<body>

title的内容 <sitemesh:write property='title'/><br/>

body的内容 <sitemesh:write property='body'/><br/>

myTag的内容 <sitemesh:write property='myTag'/><br/>

</body>
</html>