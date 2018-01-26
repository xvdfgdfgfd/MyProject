<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/26
  Time: 9:32
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
        <form action="addUser" method="post">
            <input name="u_name"/><br/>
            <input type="password" name="u_pass"/><br/>
            <input type="submit" value="注册"/>
            <input type="reset" value="重置"/>
        </form>
</body>
</html>
