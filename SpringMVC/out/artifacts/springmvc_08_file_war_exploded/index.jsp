<%--
  Created by IntelliJ IDEA.
  User: chengcheng
  Date: 2020/8/31
  Time: 5:34 下午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

  <form action="/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file">
    <input type="submit" value="upload">
  </form>

  </body>
</html>
