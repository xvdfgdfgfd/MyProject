<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/29
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>"/>
    <title></title>
</head>
<body>
${"欢迎登录：管理员"}
<form action="getAllDepat" method="post">
    <input type="submit"value="管理招聘"/>
</form>
<form action="getDandR" method="post">
    <input type="submit" value="查看应聘">
</form>

<form action="getAllStaff" method="post">
    <input type="submit" value="查看所有员工">
</form>

</body>
</html>
