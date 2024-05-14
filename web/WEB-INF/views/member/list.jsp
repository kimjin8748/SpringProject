<%--
  Created by IntelliJ IDEA.
  User: kimji
  Date: 2024-05-14
  Time: 오후 5:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Member List</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
    <style>
        table {
            text-align: center;
            font-family: "Montserrat", sans-serif;
            font-size: 1rem; /*반응형 px가 아닌 rem 사용*/
        }
    </style>
</head>
<body>
    <h1>회원 리스트 페이지</h1>
    <table class="table table-hover" style="width: 80%; margin: 20px auto 0 auto">
        <thead class="table-dark">
            <tr>
                <th>id</th>
                <th>email</th>
                <th>password</th>
                <th>name</th>
                <th>age</th>
                <th>phone</th>
                <th>조회</th>
                <th>삭제</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach items="${memberList}" var="member">
            <tr>
                <td>${member.id}</td>
                <td>${member.email}</td>
                <td>${member.password}</td>
                <td>${member.name}</td>
                <td>${member.age}</td>
                <td>${member.phone}</td>
                <td><button type="button" class="btn btn-primary">조회</button></td>
                <td><button type="button" class="btn btn-danger">삭제</button></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>
