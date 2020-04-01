<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            <th>医疗中心</th>
            <th>地址</th>
            <th>管理员编号</th>
            <th>管理员</th>
            <th>医疗中心联系电话</th>
            <th>修改</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${allMedcenterList}" var="med">
            <c:if test="${med.idMedcenter > 0}">
                <tr>
                    <td class="col-md-1 success" >${med.idMedcenter}</td>
                    <td class="col-md-2 success" >${med.nameMedcenter}</td>
                    <td class="col-md-3 success" >${med.addressMedcenter}</td>
                    <td class="col-md-1 success" >${med.idAdmin}</td>
                    <td class="col-md-1 success" >${med.nameAdmin}</td>
                    <td class="col-md-2 success" >${med.telMedcenter}</td>

                    <td class="col-md-1 warning"><a href="#" data-target="#modify" data-toggle="modal" ><span class="glyphicon glyphicon-edit">修改</span></a></td>
                    <td class="col-md-1 warning">删除</td>
                </tr>
            </c:if>
        </c:forEach>

        </tbody>

    </table>
</div>
</body>
</html>
