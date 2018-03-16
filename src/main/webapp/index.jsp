<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<h2>登陆</h2>
<%--通过设置name属性，后台获取值,error是登陆失败从后台获得的值--%>
<p>模拟数据库正确数据   姓名：zhangsan 密码：123</p>
<form action="/login.do" method="get">
    姓名：<input type="text" placeholder="请输入姓名" name="name" ><br />
    密码：<input type="password" placeholder="请输入密码" name="password"><br />
    <span style="color: red;"> ${error}</span></br>
    <input type="submit" value="登录"/>
</form>
</body>
</html>
