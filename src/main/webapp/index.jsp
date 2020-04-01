<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title></title>

    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/bootstrap.css" />
    <link rel="stylesheet" href="css/styleee.css">
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript" src="js/bootstrap.js" ></script>

    <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body >
<div>
    <table class="table table-bordered text-center">
        <tr>
            <td colspan="2" align="center"><img src="img/index_titleee.png"></td>
        </tr>

        <tr>
            <td class="col-md-6 danger " height="400"><h1><a href="jsp/wenz/wenzMain.jsp">问诊窗口</a></h1></br><h1><a href="jsp/baike/baike.jsp">危急百科</a> </h1></td>
            <td class="col-md-6 danger " ><h1><a href="${pageContext.request.contextPath}/yaop/queryAllYaop">站点管理</a></h1></br><h1><a href="${pageContext.request.contextPath}/renshi/renshimain">系统管理</a></h1></br><h1><a href="jsp/caiwu/caiwu.jsp">财务管理</a></h1></br></td>
        </tr>

        <tr class="success">
            <td class="col-md-6" rowspan="1"><h1>我是用户</h1></td>
            <td class="col-md-6 success" height="300"><img src="img/doctorart.png"></td>

        </tr>
        <tr>
            <td colspan="2" align="right"><img src="img/index_log.png" class="show-login-btn"></td>
        </tr>



    </table>


</div>

            <div class="login-box" align="center">
                <div class="hide-login-btn">
                    <i class="fa fa-times" aria-hidden="true"></i>
                </div>
                
                <img src="img/index_titleee.png">
                <form class="login-form" action="test.html" method="post">

                    <h1>Welcome!</h1>
                    <input class="txtb" type="text" name="" placeholder="Username" />
                    <input class="txtb" type="password" name=""placeholder="Passwword" />
                    <input class="login-btn" type="submit" name="" value="Login" />
                </form>
            </div>


            <script type="text/javascript">
                $(".show-login-btn").on("click",function(){
                    $(".login-box").toggleClass("showed")
                });
                $(".hide-login-btn").on("click",function(){
                    $(".login-box").toggleClass("showed")
                });
            </script>

</body>
</html>
