<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/26
  Time: 10:27
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
    <table>
        <th>
        ${"欢迎"}
        ${sessionScope.user.u_name}
        </th>
    </table>

    <table border="2">

        <th>帐号</th>
        <th>录用情况</th>
        <th>面试</th>
        <tr>
            <td>${sessionScope.user.u_name}</td>
            <c:choose>
              <c:when test="${sessionScope.user.u_hire==0}" >
                  <td>${"未被录用"}</td>
              </c:when>
                <c:when test="${sessionScope.user.u_hire==1}">
                    <td>${"已被录用"}</td>
                </c:when>
            </c:choose>
            <c:choose>
                <c:when test="${sessionScope.user.u_intn==0}">
                    <td>${"暂无面试消息"}</td>
                </c:when>
                <c:when test="${sessionScope.user.u_intn==1}">
                    <td>${"可以面试了！"}</td>
                </c:when>
            </c:choose>
        </tr>
    </table>
    <form action="forAddResume"method="post">
        <input type="submit" value="添加简历"/>
    </form>
    <form action="getResume" method="post">
        <input type="submit"value="查看简历">
    </form>
    <form action="getDepar" method="post">
        <input type="submit" value="查看招聘信息"/>
    </form>
</body>
</html>
