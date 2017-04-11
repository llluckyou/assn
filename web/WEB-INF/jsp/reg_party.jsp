<%--
  Created by IntelliJ IDEA.
  User: Heal
  Date: 2017/4/9
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/bootstrap.min.css">
</head>
<body>

<div class="container-fluid">
    <div class="row-fluid">
        <div class="span12">
            <form class="form-horizontal" action="/party/reg_party" method="post">
                <fieldset>
                    <div id="legend" class="">
                        <legend class="">注册社团</legend>
                    </div>

                    <div class="control-group">
                        <!-- Text input-->
                        <label class="control-label" for="partyName">社团名称</label>
                        <div class="controls">
                            <input type="text" id="partyName" placeholder="社团名称" name="partyName" class="input-xlarge" value="好丽友">
                            <p class="help-block"></p>
                        </div>
                    </div>


                    <div class="control-group">
                        <!-- Textarea -->
                        <label class="control-label">社团简介</label>
                        <div class="controls">
                            <div class="textarea">
                                <textarea name="partyResume" type="" class="">This is resume</textarea>
                            </div>
                        </div>
                    </div>

                    <div class="control-group">

                        <!-- Search input-->
                        <label class="control-label">联系方式</label>
                        <div class="controls">
                            <input type="text" placeholder="电话" name="partyContact" class="input-xlarge search-query"
                                   value="15829744954">
                            <p class="help-block"></p>
                        </div>

                    </div>

                    <div class="control-group">

                        <!-- Select Basic -->
                        <label class="control-label">学校</label>
                        <div class="controls">
                            <select class="input-xlarge" name="partySchoolId">
                                <c:forEach items="${schoolList}" var="school" >
                                    <option value="${school["id"]}" selected>${school["schoolName"]}</option>
                                </c:forEach>
                            </select>
                        </div>

                    </div>

                    <div class="control-group">

                        <!-- Text input-->
                        <label class="control-label" for="partyNumber">社团人数</label>
                        <div class="controls">
                            <input type="text" id="partyNumber" name="partyNumber" placeholder="人数" class="input-xlarge" value="12">
                            <p class="help-block"></p>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label">社团性质</label>
                        <div class="">
                            <!-- Multiple Radios -->
                            <label class="radio">
                                <input type="radio" value="0" name="partyProperty" checked="checked">
                                校级
                            </label>
                            <label class="radio">
                                <input type="radio" value="1" name="partyProperty">
                                院级
                            </label>
                        </div>
                    </div>

                    <div class="control-group">

                        <!-- Select Basic -->
                        <label class="control-label">社团类别</label>
                        <div class="controls">
                            <select class="input-sm" name="partyCategoryId">
                                <c:forEach items="${categoryList}" var="category">
                                    <option value="${category["categoryId"]}" selected>${category["categoryName"]}</option>
                                </c:forEach>
                            </select>
                        </div>

                    </div>
                    <input class="btn" type="submit" value="提交">
                </fieldset>
            </form>
        </div>
    </div>
</div>

</body>
</html>
