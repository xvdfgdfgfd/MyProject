<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/29
  Time: 15:43
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
        <c:forEach items="${sessionScope.allDepar}" var="allDepar">
            <tr>
                <td>${allDepar.d_name}</td>
                <c:choose>
                    <c:when test="${allDepar.d_statu==0}">
                        <td>
                            <form>
                                <input type="hidden" value="${allDepar.d_id}" name="did"/>
                                <input type="submit" value="发布招聘">
                            </form>
                        </td>
                    </c:when>
                    <c:when test="${allDepar.d_statu==1}">
                        <td>
                            <form>
                                <input type="hidden" value="${allDepar.d_id}" name="did"/>
                                <input type="submit" value="取消招聘">
                            </form>
                        </td>
                    </c:when>
                </c:choose>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
