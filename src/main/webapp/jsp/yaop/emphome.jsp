<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2020/2/12
  Time: 16:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title></title>
</head>
<body>
<div class="col-lg-12 container-fluid danger" align="center">

    <table class="table table-bordered text-center">
        <thead>
        <tr>
            <th>编号</th>
            <th>员工</th>
            <th>性别</th>
            <th>岗位编号</th>
            <th>任职岗位</th>
            <th>修改</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${allEmpList}" var="emp">
            <tr>
                <td class="col-md-1 success" >${emp.idEmp}</td>
                <td class="col-md-2 success" >${emp.nameEmp}</td>
                <td class="col-md-1 success" >${emp.sexEmp}</td>
                <td class="col-md-2 success" >${emp.idStation}</td>
                <td class="col-md-2 success" >${emp.nameStation}</td>

                <td class="col-md-2 warning"><a href="#" data-target="#modify" data-toggle="modal" ><span class="glyphicon glyphicon-edit">修改</span></a></td>
                <td class="col-md-2 warning">删除</td>
            </tr>
        </c:forEach>

        </tbody>

    </table>
</div>
</body>
</html>
