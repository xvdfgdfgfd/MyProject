<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/30
  Time: 16:24
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
        <form action="loginStaff" method="post">
            <input name="s_name"/><br/>
            <input type="password" name="s_pass"/><br/>
            <input type="submit" value="登录">
        </form>
</body>
</html>
