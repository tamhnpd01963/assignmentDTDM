<%-- 
    Document   : adminlogin
    Created on : Oct 9, 2017, 10:13:27 AM
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <%
            if (session != null) {
                if (session.getAttribute("USERNAME") == null) {
                    response.sendRedirect("login.jsp");
                }
            }
        %>
        <jsp:include page="menu.jsp"></jsp:include>
            <br><br>
            <div id="container">

                <br><br>
                <div id="content">
                    <div id="content-left" style="width: 25%">
                        <h2>WELCOME TO ${USERNAME}</h2><br>
                    <h6><a style="color: #050505; margin-left: 10px" href="addsanpham.jsp">QUẢN LÝ SẢN PHẨM</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="khachhang.jsp">QUẢN LÝ KHÁCH HÀNG</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="hoadon.jsp">QUẢN LÝ HÓA ĐƠN</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="chitiethoadon.jsp">CHI TIẾT HÓA ĐƠN</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="loaisanpham.jsp">LOẠI SẢN PHẨM</a></h6>
                    <h6><a style="color: #050505" href="LogoutServlet">LOGOUT</a></h6>
                </div>
                <div id="content-right" style="width: 75%">
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
