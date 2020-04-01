<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2020/2/6
  Time: 13:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="../css/bootstrap.css" />
    <script type="text/javascript" src="../js/jquery-3.4.1.js" ></script>
    <script type="text/javascript" src="../js/bootstrap.js" ></script>


</head>
<body>
<div class="col-lg-12 container-fluid danger" align="center">

    <table class="table table-bordered text-center">
        <thead>
        <tr>
            <th>编号</th>
            <th>科室</th>
            <th>管理员</th>
            <th>修改</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${allDepartList}" var="depart">
            <tr>
                <td class="col-md-2 success" >${depart.idDepart}</td>
                <td class="col-md-2 success" >${depart.nameDepart}</td>
                <td class="col-md-2 success" >${depart.nameAdmin}</td>
                <td class="col-md-2 warning"><a href="#" data-target="#modify" data-toggle="modal" ><span class="glyphicon glyphicon-edit">修改</span></a></td>
                <td class="col-md-2 warning">删除</td>
            </tr>
        </c:forEach>

        </tbody>

    </table>
</div>
</body>
</html>
