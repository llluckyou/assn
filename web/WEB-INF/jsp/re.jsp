<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/5
  Time: 23:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/wow/dispatcherRegister" method="post">
        <h2>用户注册表单</h2>
        <hr/>
        UserID:<input type="text" name="userId" /><br>
        <br /> ActivityID:<input type="text" name="activityId" /><br>

        <br /> <input type="submit" value="注册" />
    </form>
</body>
</html>
