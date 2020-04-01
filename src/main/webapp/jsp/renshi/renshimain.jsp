
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="../../css/bootstrap.css" />
    <script type="text/javascript" src="../../js/jquery-3.4.1.js" ></script>
    <script type="text/javascript" src="../../js/bootstrap.js" ></script>

    <title></title>

</head>
<body>
<%@include file="renshiTitle.jsp"%>


<div class="container-fluid">
    <div class="col-md-3 bg-success">

        <a href="#left-menu" data-toggle="collapse"><h3>导航栏</h3></a>

        <ul id="left-menu">
            <li><a href="${pageContext.request.contextPath}/renshi/queryAllDepart"><h4>科室管理</h4></a> </li>
            <li><a href="${pageContext.request.contextPath}/renshi/queryAllStation"><h4>岗位管理</h4></a></li>
            <li><a href="${pageContext.request.contextPath}/renshi/queryAllEmp"><h4>员工管理</h4></a></li>

        </ul></div>
    <div class="right col-md-9 container-fluid">
     <%@include file="renshiHome.jsp"%>

        <%--<table class="table table-bordered text-center">--%>
            <%--<thead>--%>
            <%--<tr>--%>
                <%--<th>编号</th>--%>
                <%--<th>科室</th>--%>
                <%--<th>管理员</th>--%>
                <%--<th>修改</th>--%>
                <%--<th>撤销</th>--%>
            <%--</tr>--%>
            <%--</thead>--%>
            <%--<tbody>--%>
            <%--<c:forEach items="${allDepartList }" var="depart">--%>
                <%--<tr>--%>
                    <%--<td class="col-md-1" >${depart.idDepart}</td>--%>
                    <%--<td class="col-md-4 success" >${depart.nameDepart}</td>--%>
                    <%--<td class="col-md-4 success" >${depart.nameAdmin}</td>--%>
                    <%--<td class="col-md-2 warning"><a href="#" data-target="#modify" data-toggle="modal" ><span class="glyphicon glyphicon-edit">修改</span></a></td>--%>
                    <%--<td class="col-md-2 warning">删除</td>--%>
                <%--</tr>--%>
            <%--</c:forEach>--%>

            <%--</tbody>--%>

        <%--</table>--%>
    </div>

</div>

</body>
</html>