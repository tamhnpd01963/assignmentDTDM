<%-- 
    Document   : chitiethoadon
    Created on : Feb 28, 2018, 9:55:25 AM
    Author     : ADMIN
--%>

<%@page import="model.ChiTietHoaDonDAO"%>
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
        <title>Chi Tiet Hoa Don</title>
    </head>
    <% ChiTietHoaDonDAO cthdDAO = new ChiTietHoaDonDAO();%>
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
                    <h6><a style="color: #050505; margin-left: 10px" href="loaisanpham.jsp">LOẠI SẢN PHẨM</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="LogoutServlet">LOGOUT</a></h6>
                </div>

                <div id="content-right" style="width: 75%">
                    <h1><strong>CHI TIẾT HÓA ĐƠN</strong></h1>
                    <form action="ChiTietHoaDonServlet" method="post" >
                        <div class="form-group">
                            <label for="email">MÃ HÓA ĐƠN:</label>
                            <input type="text" class="form-control" placeholder=" NHẬP MÃ HÓA ĐƠN" name="idHD" value="${CHITIETHOADON.get(0)}"/>
                        </div>
                        <div class="form-group">
                            <label for="email">MÃ SẢN PHẨM:</label>
                            <input type="text" class="form-control" placeholder="NHẬP MÃ SẢN PHẨM" name="id" value="${CHITIETHOADON.get(1)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">ĐƠN GIÁ:</label>
                            <input type="number" class="form-control" placeholder="NHẬP ĐƠN GIÁ" name="DonGia" value="${CHITIETHOADON.get(2)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">SỐ LƯỢNG:</label>
                            <input type="number" class="form-control" placeholder="NHẬP SỐ LƯỢNG" name="SoLuong" value="${CHITIETHOADON.get(3)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">THÀNH TIỀN:</label>
                            <input type="number" class="form-control" placeholder="NHẬP SỐ TIỀN" name="ThanhTien" value="${CHITIETHOADON.get(4)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">GHI CHÚ:</label>
                            <input type="text" class="form-control" placeholder="NHẬP GHI CHÚ" name="GhiChu" value="${CHITIETHOADON.get(5)}"/>
                        </div>
                        <button type="submit" class="btn btn-default" name="action" value="add">ADD</button>
                        <button type="submit" class="btn btn-default" name="action" value="update">UPDATE</button>
                    </form><hr><hr>

                    <h2>CHI TIẾT HÓA ĐƠN</h2>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>MÃ HÓA ĐƠN</th>
                                <th>MÃ SẢN PHẨM</th>
                                <th>ĐƠN GIÁ</th>
                                <th>SỐ LƯỢNG</th>
                                <th>THÀNH TIỀN</th>
                                <th>GHI CHÚ</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                for (int i = 0; i < cthdDAO.getAllChiTietHoaDon().size(); i++) {
                            %>
                            <tr>
                                <td><%=cthdDAO.getAllChiTietHoaDon().get(i).getIdHD()%></td>
                                <td><%=cthdDAO.getAllChiTietHoaDon().get(i).getId()%></td>
                                <td><%=cthdDAO.getAllChiTietHoaDon().get(i).getDonGia()%></td>
                                <td><%=cthdDAO.getAllChiTietHoaDon().get(i).getSoLuong()%></td>
                                <td><%=cthdDAO.getAllChiTietHoaDon().get(i).getThanhTien()%></td>
                                <td><%=cthdDAO.getAllChiTietHoaDon().get(i).getGhiChu()%></td>
                                <td>
                                    <a href='<%="ChiTietHoaDonServlet?action=edit&idHD=" + cthdDAO.getAllChiTietHoaDon().get(i).getIdHD()%>'>Edit</a>|
                                    <a href='<%="ChiTietHoaDonServlet?action=del&idHD=" + cthdDAO.getAllChiTietHoaDon().get(i).getIdHD()%>'>Del</a>
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
