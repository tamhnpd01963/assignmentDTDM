<%-- 
    Document   : menu
    Created on : Oct 1, 2017, 10:40:41 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body data-spy="scroll" data-target=".navbar" data-offset="50">
        <nav class="navbar navbar-inverse navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                    <a class="navbar-brand" href="home.jsp">David Caption</a>
                </div>
                <div>
                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav">
                            <li><a href="home.jsp">TRANG CHỦ</a></li>
                            <li><a href="#section2">ĐIỆN THOẠI</a></li>
                            <li><a href="#section3">LAPTOP</a></li>
                            <li><a href="#section4">PHỤ KIỆN</a></li>
                            <li><a href="#section5">LIÊN HỆ</a></li>
                            <li style="left: 280px"><a  href="giohang.jsp">GIỎ HÀNG</a></li>
                            <li style="left: 280px" ><a><input type="text" placeholder="Bạn tìm gì..." /></a></li>
                            <li style="left: 350px"><a  href="login.jsp">LOGIN</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
