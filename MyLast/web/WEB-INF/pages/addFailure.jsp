<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/26
  Time: 10:10
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
    ${"失败了"}
    <a href="addFailure">点击返回注册</a>
</body>
</html>
