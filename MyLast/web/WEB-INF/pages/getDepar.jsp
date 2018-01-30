<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/29
  Time: 14:43
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
            <th>招聘信息</th>
            <c:forEach items="${sessionScope.depar}" var="depar">
                <tr>
                    <td>${depar.d_name}</td>
                    <td>
                        <form action="addDeparAndRes" method="post">
                            <input type="hidden" value="${depar.d_id}" name="ddid"/>
                            <input type="submit"value="投递简历">
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>
