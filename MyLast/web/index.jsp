<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/26
  Time: 9:08
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
    <form action="login" method="post">
        <input name="u_name"/><br/>
        <input type="password" name="u_pass"/><br/>
        <input type="submit" value="登录"/>
        <input type="reset" value="重置"/>
    </form>
    <form action="forAdd" method="post">
        <input type="submit" value="注册"/>
    </form>
</body>
</html>
