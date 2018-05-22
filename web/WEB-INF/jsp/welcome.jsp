<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/21 0021
  Time: 15:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    Hello!

    <button id="ajax1">AJAX1</button>
    <button id="ajax2">AJAX2</button>
    <button id="ajax3">AJAX3</button>
    <button id="ajax4">AJAX4</button>

    <form id="form_get" action="/form1" method="get">
        <input type="text" name="name">
        <input type="number" name="age">
        <button id="submit_get">FORM_Button</button>
    </form>

    <form id="form_post" action="/form1" method="post">
        <input type="text" name="name">
        <input type="number" name="age">
        <button id="submit_post">FORM_Button</button>
    </form>

    <p>${message}</p>
    <p>${user.id}</p>
    <p>${user.username}</p>
    <p>${user.sex}</p>
</body>
<script src="/lib/jquery/dist/jquery.min.js"></script>
<script src="/javascript/zxt.js"></script>
</html>
