<%--
  Created by IntelliJ IDEA.
  User: Heal
  Date: 2017/4/11
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
${status}

<c:forEach items="${errors}" var="error">
    <li>${error}</li>
</c:forEach>
</body>
</html>
