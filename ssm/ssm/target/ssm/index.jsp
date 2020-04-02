<%--
  Created by IntelliJ IDEA.
  User: 全兴文
  Date: 2020/4/2
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>根据id查询用户信息</title>
</head>
<body>
    <form action="AccountController/QueryUser" method="post">
        输入查询的id<input name="id"><br>
        <input type="submit" value="查询">
    </form>
</body>
</html>
