<%-- 
    Document   : hoadon
    Created on : Feb 28, 2018, 9:55:25 AM
    Author     : ADMIN
--%>

<%@page import="model.HoaDonDAO"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Hoa Don</title>
    </head>
    <% HoaDonDAO hdDAO = new HoaDonDAO();%>
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
                        <h2>Welcome to ${USERNAME}</h2><br>
                    <h6><a style="color: #050505; margin-left: 10px" href="addsanpham.jsp">QUẢN LÝ SẢN PHẨM</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="khachhang.jsp">QUẢN LÝ KHÁCH HÀNG</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="hoadon.jsp">QUẢN LÝ HÓA ĐƠN</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="chitiethoadon.jsp">CHI TIẾT HÓA ĐƠN</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="LogoutServlet">LOGOUT</a></h6>
                </div>

                <div id="content-right" style="width: 75%">
                    <h1><strong>QUẢN LÝ HÓA ĐƠN</strong></h1>
                    <form action="HoaDonServlet" method="post" >
                        <div class="form-group">
                            <label for="email">MÃ HÓA ĐƠN:</label>
                            <input type="text" class="form-control" placeholder=" NHẬP MÃ HÓA ĐƠN" name="idHD" value="${HOADON.get(0)}"/>
                        </div>
                        <div class="form-group">
                            <label for="email">MÃ KHÁCH HÀNG:</label>
                            <input type="text" class="form-control" placeholder="NHẬP MÃ KHÁCH HÀNG" name="idKH" value="${HOADON.get(1)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">NGÀY LẬP HÓA ĐƠN:</label>
                            <input type="text" class="form-control" placeholder="NHẬP NGÀY" name="ngaylapHD" value="${HOADON.get(2)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">TỔNG TIỀN:</label>
                            <input type="number" class="form-control" placeholder="NHẬP TỔNG TIỀN" name="price" value="${HOADON.get(3)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">GHI CHÚ:</label>
                            <input type="text" class="form-control" placeholder="NHẬP GHI CHÚ" name="note" value="${HOADON.get(4)}"/>
                        </div>
                        <button type="submit" class="btn btn-default" name="action" value="add">ADD</button>
                        <button type="submit" class="btn btn-default" name="action" value="update">UPDATE</button>
                    </form><hr><hr>

                    <h2>DANH SÁCH HÓA ĐƠN</h2>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>MÃ HÓA ĐƠN</th>
                                <th>MÃ KHÁCH HÀNG</th>
                                <th>NGÀY LẬP HÓA ĐƠN</th>
                                <th>TỔNG TIỀN</th>
                                <th>GHI CHÚ</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                for (int i = 0; i < hdDAO.getAllHoaDon().size(); i++) {
                            %>
                            <tr>
                                <td><%=hdDAO.getAllHoaDon().get(i).getIdHD()%></td>
                                <td><%=hdDAO.getAllHoaDon().get(i).getIdKH()%></td>
                                <td><%=hdDAO.getAllHoaDon().get(i).getNgaylapHD()%></td>
                                <td><%=hdDAO.getAllHoaDon().get(i).getPrice()%></td>
                                <td><%=hdDAO.getAllHoaDon().get(i).getNote()%></td>
                                <td>
                                    <a href='<%="HoaDonServlet?action=edit&idHD=" + hdDAO.getAllHoaDon().get(i).getIdHD()%>'>Edit</a>|
                                    <a href='<%="HoaDonServlet?action=del&idHD=" + hdDAO.getAllHoaDon().get(i).getIdHD()%>'>Del</a>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
