<%-- 
    Document   : login
    Created on : Oct 8, 2017, 7:54:47 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/demo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
            <br><br>
            <div id="content">

                <div id="content-left">

                    <div class="container1">
                        <h2 style="margin-left: 400px" >ĐĂNG NHẬP HỆ THỐNG</h2>
                        <br>

                        <form class="form-signin" action="SanPhamServlet" method="POST" style="margin-left: 400px">
                                <input type="text" class="form-control" placeholder="username" name="user" required autofocus>
                                <input type="password" class="form-control" placeholder="password" name="pass" required>
                                
                                <button class="btn btn-lg btn-primary btn-block" type="submit" name="action" value="login">Login</button>
                            </form>
                            <center>
                            <form action="TaiKhoanServlet" method="post">
                                <button type="button" class="btn btn-lg btn-primary btn-block" data-toggle="modal" data-target="#myModal" style="width: 300px; margin-left: 220px;">Sign up</button>
                                <div class="modal fade" id="myModal" role="dialog">
                                    <div class="modal-dialog">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                                <h4 class="modal-title">Đăng ý tài khoản khách hàng</h4>
                                            </div>
                                            <div class="modal-body">
                                                <div class="form-group">
                                                    <label for="email">Username:</label>
                                                    <input type="text" class="form-control" placeholder=" Mời nhập Username" name="user"/>
                                                </div>
                                                <div class="form-group">
                                                    <label for="pwd">Password:</label>
                                                    <input type="password" class="form-control" placeholder="Mời nhập Password" name="pass"/>
                                                </div>
                                            </div>
                                            <div class="modal-footer">
                                                <button type="submit" class="btn btn-default" name="action" value="add">Đăng ký</button>
                                                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                    </div>
                </div>
            </div>
        </div>
        <br><br>
    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
