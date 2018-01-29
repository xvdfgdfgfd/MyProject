<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/29
  Time: 13:15
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
        <c:forEach items="${sessionScope.resumes}" var="resumes">
            <tr>
                <td>${"姓名:"}${resumes.r_name}</td>
                <td>${"性别:"}${resumes.r_sex}</td>
                <td>${"名族:"}${resumes.r_nation}</td>
                <td>${"电话:"}${resumes.r_phone}</td>
            </tr>
            <tr>
                <td>${"邮箱:"}${resumes.r_emall}</td>
                <td>${"地址:"}${resumes.r_address}</td>
                <td>${"生日:"}${resumes.r_birth}</td>
                <td>${"政治面貌:"}${resumes.r_politics_status}</td>
            </tr>
            <tr>
                <td>${"学历："}${resumes.r_education}</td>
                <td>${"毕业院校："}${resumes.r_graduate}</td>
                <td>${"技能证书："}${resumes.r_skill}</td>

            </tr>
            <tr>
                <td rowspan="2">${"求职意向："}${resumes.r_job_intension}</td>
                <td rowspan="2">${"自我评价："}${resumes.r_self}</td>
                <td rowspan="2">${"工作经历："}${resumes.r_internship}</td
            </tr>

        </c:forEach>
</table>
</body>
</html>
