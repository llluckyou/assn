<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/4/11
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>发布新活动</title>
</head>
<body>
<h1>发布一个新的活动</h1>
<div id="content">
    <form:form commandName="activity" action="/activity/release" method="post">
        <ul>
            <li>
                <label for="activityName">活动名称</label>
                <form:input id="activityName" path="activityName" />
            </li>
            <li>
                <label>活动地点</label>
                <form:input id="activitySpace" path="activitySpace" />
            </li>
            <li>
                <label for="startDate">活动开始日期</label>
                <input type="date" id="startDate" name="activityStartDate" />
            </li>
            <li>
                <label for="endDate">活动截止日期</label>
                <input type="date" id="endDate" name="activityEndDate" />
            </li>
            <li>
                <label>申办社团</label>
                <form:input id="partyName" path="partyName" />
            </li>
            <li>
                <label>活动描述</label>
                <form:textarea id="activityContent" path="activityContent" />
            </li>
            <li>
                <input type="submit" value="提交">
            </li>
        </ul>
    </form:form>
</div>
</body>
</html>
