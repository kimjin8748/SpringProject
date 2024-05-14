<%--
  Created by IntelliJ IDEA.
  User: kimji
  Date: 2024-05-13
  Time: 오후 5:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h1>로그인 페이지</h1>
    <form action="/member/login" method="post">
        <input type="text" name="email" placeholder="이메일">
        <input type="text" name="password" placeholder="비밀번호">
        <input type="submit" value="로그인">
    </form>
</body>
</html>
