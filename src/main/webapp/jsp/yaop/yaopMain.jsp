<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2020/2/13
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>


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
<%@include file="yaopTitle.jsp"%>


<div class="container-fluid">

    <div class="col-md-4 container-fluid">
        <%@include file="yaopLeft.jsp"%>
    </div>


    <div class="right col-md-8 container-fluid">
        <%@include file="yaopHome.jsp"%>

    </div>

</div>

</body>
</html>