<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/30
  Time: 16:28
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

    <form action="lookStaff" method="post">
        <input type="submit" value="查看详情"/>
    </form>
    <form action="addCowa" method="post">
        <input type="submit" value="上班打卡"/>
    </form>
    <form action="addDcowa" method="post">
        <input type="submit" value="下班打卡"/>
    </form>
</body>
</html>
