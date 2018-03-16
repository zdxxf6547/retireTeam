<%@ page import="com.bean.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h3>欢迎 ${user.name}!</h3>
<h3>你的密码是:${user.password}!</h3>
<button><a href="index.jsp">返回</a></button>
</body>
</html>
