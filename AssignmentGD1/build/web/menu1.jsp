<%-- 
    Document   : menu1
    Created on : Oct 25, 2017, 11:49:17 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>mn</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
                <link href="css/style.css" rel="stylesheet" type="text/css"/>
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
                            <li style="left: 280px"><a  href="giohang.jsp">Giỏ hàng</a></li>
                            <li style="left: 280px" ><a> <input type="text" name="timkiem" /> </a></li>
                            <li style="left: 350px"><a  href="LogoutServlet">Logout</a></li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>
                    <div id="container">
                <br><br>
                <div id="content">
                    <div id="content-left">
                    <jsp:include page="slideshow.jsp"></jsp:include>
                        <div class="col-25">
                            <div class="prod">
                                <div class="name"><h3>SamSung Galaxy J7 Pro</h3></div>
                                <img class="image" src="image/sp1.png"/>
                                <div class="overlay">
                                    <div class="text">
                                        <p>
                                            <button type="submit" name="action" value="giohang">dat hang</button>
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                        
                        <div class="col-25">
                            <div class="prod">
                                <div class="name"><h3>Lenovo IdeaPad 120S</h3></div>
                                <img class="image" src="image/sp2.png"/>
                                <div class="overlay">
                                    <div class="text">
                                        <p>
                                            * Thông tin sản phẩm<br>
                                            - Camera chính và camera trước 13MP<br>
                                            - Màn hình Full HD 6inch<br>
                                            - Thời lượng pin lên đến 2 ngày<br>

                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                        
                        <div class="col-25">
                            <div class="prod">
                                <div class="name"><h3>SamSung Galaxy S8</h3></div>
                                <img class="image" src="image/sp3.png"/>
                                <div class="overlay">
                                    <div class="text">
                                        <p>
                                            * Thông tin sản phẩm<br>
                                            - Camera chính và camera trước 13MP<br>
                                            - Màn hình Full HD 6inch<br>
                                            - Thời lượng pin lên đến 2 ngày<br>

                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                        
                        <div class="col-25">
                            <div class="prod">
                                <div class="name"><h3>iPhone 7 32G</h3></div>
                                <img class="image" src="image/sp4.png"/>
                                <div class="overlay">
                                    <div class="text">
                                        <p>
                                            * Thông tin sản phẩm<br>
                                            - Camera chính và camera trước 13MP<br>
                                            - Màn hình Full HD 6inch<br>
                                            - Thời lượng pin lên đến 2 ngày<br>

                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                        
                        <div class="col-25">
                            <div class="prod">
                                <div class="name"><h3>Oppo A71</h3></div>
                                <img class="image" src="image/sp5.png"/>
                                <div class="overlay">
                                    <div class="text">
                                        <p>
                                            * Thông tin sản phẩm<br>
                                            - Camera chính và camera trước 13MP<br>
                                            - Màn hình Full HD 6inch<br>
                                            - Thời lượng pin lên đến 2 ngày<br>

                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                        
                        
                        <div class="col-25">
                            <div class="prod">
                                <div class="name"><h3>Oppo F3</h3></div>
                                <img class="image" src="image/sp6.png"/>
                                <div class="overlay">
                                    <div class="text">
                                        <p>
                                            * Thông tin sản phẩm<br>
                                            - Camera chính và camera trước 13MP<br>
                                            - Màn hình Full HD 6inch<br>
                                            - Thời lượng pin lên đến 2 ngày<br>

                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                <jsp:include page="content-right.jsp"></jsp:include>
                </div>               
            </div>
    </body>
</html>

