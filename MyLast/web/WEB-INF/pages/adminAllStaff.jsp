<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/2/1
  Time: 15:24
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
    <th>姓名</th>
    <th>职位</th>
    <th>工资</th>
    <th>奖惩</th>
    <th>考勤</th>
    <th>部门</th>
    <tr>
        <td>${sessionScope.staff2.s_name}</td>
        <td>${sessionScope.staff2.s_position}</td>
        <td>${sessionScope.staff2.s_salary}</td>
        <td>${sessionScope.staff2.s_aandp}</td>
        <td>${sessionScope.staff2.s_cowa}</td>
        <td>${sessionScope.staff2.department.d_name}</td>
    </tr>
</table>


<select>
    <c:forEach items="${sessionScope.allDepar}"  var="allDepar">
        <option value="${allDepar.d_id}">${allDepar.d_name}</option>
    </c:forEach>

</select>
</body>
</html>
