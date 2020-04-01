<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2020/2/13
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="col-lg-12 container-fluid danger" align="center">

    <table class="table table-bordered text-center">
        <thead>
        <tr>
            <th>编号</th>
            <th>药物品名</th>
            <th>药品类别</th>
            <th>标注</th>
            <th>修改</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${allYaopList}" var="yaop">
            <c:if test="${yaop.idMedicine > 0}">
            <tr>
                <td class="col-md-1 success" >${yaop.idMedicine}</td>
                <td class="col-md-2 success" >${yaop.nameMedicine}</td>
                <td class="col-md-1 success" >${yaop.classicMedicine}</td>
                <td class="col-md-1 success" >${yaop.tag}</td>

                <td class="col-md-2 warning"><a href="#" data-target="#modify" data-toggle="modal" ><span class="glyphicon glyphicon-edit">修改</span></a></td>
                <td class="col-md-2 warning">删除</td>
            </tr>
            </c:if>
        </c:forEach>

        </tbody>

    </table>
</div>
</body>
</html>
