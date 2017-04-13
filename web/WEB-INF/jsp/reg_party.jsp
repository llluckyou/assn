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
    <link type="text/css" rel="stylesheet" href="/css/bootstrap.min.css">
    <link type="text/css" rel="stylesheet" href="/css/fileinput.min.css">
    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/fileinput.min.js"></script>
    <%--<script type="text/javascript" src="/js/fileinput-locale-zh.js"></script>--%>
</head>
<body>

<div class="container">
    <div class="row">
        <div class="span12">
            <form class="form-horizontal" enctype="multipart/form-data" action="/party/reg_party" method="post">
                <fieldset>
                    <div id="legend" class="">
                        <legend class="">注册社团</legend>
                    </div>

                    <div class="control-group">
                        <label class="control-label">选择社团照片</label>
                        <input id="partyImg" type="file" name="partyImg" class="file-loading">
                        <script>
                            $(document).on('ready',function(){
                                $("#partyImg").fileinput({showCaption:false});
                            });
                        </script>
                    </div>

                    <div class="control-group">
                        <!-- Text input-->
                        <label class="control-label" for="partyName">社团名称</label>
                        <div class="controls">
                            <input type="text" id="partyName" class="form-control" placeholder="社团名称" name="partyName" value="好丽友">
                            <p class="help-block"></p>
                        </div>
                    </div>


                    <div class="control-group">
                        <!-- Textarea -->
                        <label class="control-label">社团简介</label>
                        <div class="controls">
                            <div class="textarea">
                                <textarea name="partyResume" type="" class="form-control">This is resume</textarea>
                            </div>
                        </div>
                    </div>

                    <div class="control-group">

                        <!-- Search input-->
                        <label class="control-label">联系方式</label>
                        <div class="controls">
                            <input type="text" placeholder="电话" name="partyContact" class="form-control"
                                   value="15829744954">
                            <p class="help-block"></p>
                        </div>

                    </div>

                    <div class="control-group">

                        <!-- Select Basic -->
                        <label class="control-label">学校</label>
                        <div class="controls">
                            <select class="form-control" name="partySchoolId">
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
                            <input type="text" id="partyNumber" name="partyNumber" placeholder="人数" class="form-control" value="12">
                            <p class="help-block"></p>
                        </div>
                    </div>

                    <div class="control-group">
                        <label class="control-label">社团性质</label>
                        <div class="">
                            <!-- Multiple Radios -->
                            <label class="radio form-control-static">
                                <input type="radio" value="0" name="partyProperty" checked="checked">
                                校级
                            </label>
                            <label class="radio form-control-static">
                                <input type="radio" value="1" name="partyProperty">
                                院级
                            </label>
                        </div>
                    </div>

                    <div class="control-group">

                        <!-- Select Basic -->
                        <label class="control-label">社团类别</label>
                        <div class="controls">
                            <select class="form-control" name="partyCategoryId">
                                <c:forEach items="${categoryList}" var="category">
                                    <option value="${category["categoryId"]}" selected>${category["categoryName"]}</option>
                                </c:forEach>
                            </select>
                        </div>

                    </div>
                    <div class="btn-group">
                            <input class="btn" type="submit" value="提交">
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>
</body>
</html>
