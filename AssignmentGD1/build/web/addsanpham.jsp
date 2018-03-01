<%-- 
    Document   : addsanpham
    Created on : Oct 17, 2017, 8:28:36 PM
    Author     : ADMIN
--%>

<%@page import="model.SanPhamDAO"%>
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
    <% SanPhamDAO spDAO = new SanPhamDAO();%>
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
                    <h1><strong>QUẢN LÝ SẢN PHẨM</strong></h1>
                    <form action="SanPhamServlet" method="post" >
                        <div class="form-group">
                            <label for="email">MÃ SẢN PHẨM:</label>
                            <input type="text" class="form-control" placeholder=" NHẬP MÃ SẢN PHẨM" name="id" value="${SANPHAM.get(0)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">TÊN SẢN PHẨM:</label>
                            <input type="text" class="form-control" placeholder="NHẬP TÊN SẢN PHẨM" name="name" value="${SANPHAM.get(1)}"/>
                        </div>
                        <div class="form-group">
                            <label for="email">MÃ LOẠI SẢN PHẨM:</label>
                            <input type="text" class="form-control" placeholder=" NHẬP MÃ LOẠI SẢN PHẨM" name="idM" value="${SANPHAM.get(2)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">SỐ LƯỢNG:</label>
                            <input type="number" class="form-control" placeholder="NHẬP SỐ LƯỢNG" name="quantity" value="${SANPHAM.get(3)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">ĐƠN GIÁ:</label>
                            <input type="number" class="form-control" placeholder="NHẬP GIÁ TIỀN" name="price" value="${SANPHAM.get(4)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">GHI CHÚ:</label>
                            <input type="text" class="form-control" placeholder="NHẬP GHI CHÚ" name="note" value="${SANPHAM.get(5)}"/>
                        </div>
                        <button type="submit" class="btn btn-default" name="action" value="add">ADD</button>
                        <button type="submit" class="btn btn-default" name="action" value="update">UPDATE</button>
                    </form><hr><hr>

                    <h2>DANH SÁCH SẢN PHẨM</h2>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>MÃ SẢN PHẨM</th>
                                <th>TÊN SẢN PHẨM</th>
                                <th>MÃ LOẠI SẢN PHẨM</th>
                                <th>SỐ LƯỢNG</th>
                                <th>ĐƠN GIÁ</th>
                                <th>GHI CHÚ</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                for (int i = 0; i < spDAO.getAllSanPham().size(); i++) {
                            %>
                            <tr>
                                <td><%=spDAO.getAllSanPham().get(i).getId()%></td>
                                <td><%=spDAO.getAllSanPham().get(i).getName()%></td>
                                <td><%=spDAO.getAllSanPham().get(i).getIdM()%></td>
                                <td><%=spDAO.getAllSanPham().get(i).getQuatity()%></td>
                                <td><%=spDAO.getAllSanPham().get(i).getPrice()%></td>
                                <td><%=spDAO.getAllSanPham().get(i).getNote()%></td>
                                <td>
                                    <a href='<%="SanPhamServlet?action=edit&id=" + spDAO.getAllSanPham().get(i).getId()%>'>Edit</a>|
                                    <a href='<%="SanPhamServlet?action=del&id=" + spDAO.getAllSanPham().get(i).getId()%>'>Del</a>
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
