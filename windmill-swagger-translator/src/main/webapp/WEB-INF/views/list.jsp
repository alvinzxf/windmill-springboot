<%@page language="java" contentType="text/html; charset=UTF-8"
        pageEncoding="UTF-8" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table align='center' border='1' cellspacing='0'>
    <tr>
        <td>id</td>
        <td>name</td>
        <td>学生id</td>
        <td>性别</td>
        <td>birthday</td>
    </tr>
    <c:forEach items="${students}" var="stu" varStatus="st">
        <tr>
            <td>${stu.id}</td>
            <td>${stu.name}</td>
            <td>${stu.student_id}</td>
            <td>${stu.sex}</td>
            <td>${stu.birthday}</td>
        </tr>
    </c:forEach>
</table>