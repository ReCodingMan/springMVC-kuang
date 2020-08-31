<%--
  Created by IntelliJ IDEA.
  User: chengcheng
  Date: 2020/8/31
  Time: 10:06 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增书籍</title>
</head>
<body>

    <form action="${pageContext.request.contextPath}/book/addBook" method="">
        <input type="text" name="bookName">
        <input type="text" name="bookCounts">
        <input type="text" name="detail">
        <input type="submit">
    </form>

</body>
</html>
