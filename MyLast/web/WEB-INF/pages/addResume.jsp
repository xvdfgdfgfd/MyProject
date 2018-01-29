<%--
  Created by IntelliJ IDEA.
  User: Sope
  Date: 2018/1/29
  Time: 12:04
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
    <form action="addResume" method="post">
        姓名：<input name="r_name"/><br/>
        性别：<input name="r_sex"/><br/>
        名族：<input name="r_nation"/><br/>
        电话：<input name="r_phone"/><br/>
        邮箱：<input name="r_emall"/><br/>
        地址：<input name="r_address"/><br/>
        生日：<input name="birth"/><br/>
        政治面貌：<input name="r_politics_status"/><br/>
        毕业院校：<input name="r_graduate"/><br/>
        学历：<input name="r_education"/><br/>
        求职意向：<input name="r_job_intension"/><br/>
        教育背景：<input name="r_educational"/><br/>
        实习经历：<input name="r_internship"/><br/>
        技能证书：<input name="r_skill"/><br/>
        自我评价：<input name="r_self"/><br/>
        <input type="submit" value="添加"/>
    </form>
</body>
</html>
