<%--
  Created by IntelliJ IDEA.
  User: 全兴文
  Date: 2020/4/2
  Time: 10:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>用户信息页面</title>
</head>
<body>
    <table border="1px">
        <tr>
            <td>用户id</td>
            <td>用户姓名</td>
            <td>余额</td>
        </tr>
        <tr>
            <td>${requestScope.Account.id}</td>
            <td>${requestScope.Account.name}</td>
            <td>${requestScope.Account.money}</td>
        </tr>
    </table>
</body>
</html>
