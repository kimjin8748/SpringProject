<%--
  Created by IntelliJ IDEA.
  User: kimji
  Date: 2024-04-30
  Time: 오후 5:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
</head>
<body>
    <h1>회원가입</h1>
    <form action="/member/save" method="post">
        <input type="text" name="email" id="memberEmail" placeholder="이메일"><p>
        <input type="text" name="password" id="password" placeholder="패스워드"><p>
        <input type="text" name="name" id="name" placeholder="이름"><p>
        <input type="text" name="age" id="age" placeholder="나이"><p>
        <input type="text" name="phone" id="phone" placeholder="전화번호"><p>
        <input type="submit" value="회원 가입"><p>
    </form>
</body>
</html>
