<%-- 
    Document   : home
    Created on : Oct 1, 2017, 10:25:53 PM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>home</title>
    </head>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
        
            <br><br>
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
        <jsp:include page="footer.jsp"></jsp:include>        
    </body>
</html>
