<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/30
  Time: 8:35
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
    <table border="2">
        <th>应聘部门</th>
        <th>应聘人</th>
        <c:forEach items="${sessionScope.dAndr}" var="dAndr">
            <tr>
                <td>${dAndr.d_id}</td>
                <td>${dAndr.u_id}</td>
                <td>
                    <form action="adminGetResume" method="post">
                        <input type="hidden" value="${dAndr.u_id}" name="uid"/>
                        <input type="submit" value="查看简历"/>
                    </form>
                </td>
                <td>
                    <form action="invite" method="post">
                        <input type="hidden" value="${dAndr.u_id}" name="uid"/>
                        <input type="text"name="u_interview"/>
                        <input type="submit" value="邀请面试"/>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
