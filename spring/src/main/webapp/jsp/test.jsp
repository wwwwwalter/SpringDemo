<%--
  Created by IntelliJ IDEA.
  User: gzyit
  Date: 2019/5/15
  Time: 0:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<h1>restful</h1>
<hr>
<form action="/selectall">
    <input type="submit" value="selectall">
</form>
<form action="/insert">
    用户：<input type="text" name="username"/><br>
    生日：<input type="date" name="birthday"/><br>
    <input type="submit" value="insert">
</form>
</body>
</html>
