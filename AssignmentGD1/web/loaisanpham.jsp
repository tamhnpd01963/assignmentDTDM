<%-- 
    Document   : loaisanpham
    Created on : Feb 28, 2018, 11:27:24 PM
    Author     : ADMIN
--%>

<%@page import="model.LoaiSanPhamDAO"%>
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
        <title>add san pham</title>
    </head>
    <% LoaiSanPhamDAO lspDAO = new LoaiSanPhamDAO();%>
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
                    <h1><strong>LOẠI SẢN PHẨM</strong></h1>
                    <form action="LoaiSanPhamServlet" method="post" >
                        <div class="form-group">
                            <label for="email">MÃ LOẠI SẢN PHẨM:</label>
                            <input type="text" class="form-control" placeholder=" NHẬP MÃ LOẠI SẢN PHẨM" name="idM" value="${LOAISANPHAM.get(0)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">TÊN LOẠI SẢN PHẨM:</label>
                            <input type="text" class="form-control" placeholder="NHẬP TÊN LOẠI SẢN PHẨM" name="TenLSP" value="${LOAISANPHAM.get(1)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">MÔ TẢ:</label>
                            <input type="text" class="form-control" placeholder=" NHẬP MÔ TẢ" name="MoTa" value="${LOAISANPHAM.get(2)}"/>
                        </div>
                        <button type="submit" class="btn btn-default" name="action" value="add">ADD</button>
                        <button type="submit" class="btn btn-default" name="action" value="update">UPDATE</button>
                    </form><hr><hr>

                    <h2>LOẠI SẢN PHẨM</h2>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>MÃ LOẠI SẢN PHẨM</th>
                                <th>TÊN LOẠI SẢN PHẨM</th>
                                <th>MÔ TẢ</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                for (int i = 0; i < lspDAO.getAllLoaiSanPham().size(); i++) {
                            %>
                            <tr>
                                <td><%=lspDAO.getAllLoaiSanPham().get(i).getIdM()%></td>
                                <td><%=lspDAO.getAllLoaiSanPham().get(i).getTenLSP()%></td>
                                <td><%=lspDAO.getAllLoaiSanPham().get(i).getMoTa()%></td>
                                <td>
                                    <a href='<%="LoaiSanPhamServlet?action=edit&idM=" + lspDAO.getAllLoaiSanPham().get(i).getIdM()%>'>Edit</a>|
                                    <a href='<%="LoaiSanPhamServlet?action=del&idM=" + lspDAO.getAllLoaiSanPham().get(i).getIdM()%>'>Del</a>
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
