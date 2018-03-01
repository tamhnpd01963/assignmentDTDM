<%-- 
    Document   : khachhang
    Created on : Oct 25, 2017, 12:05:45 PM
    Author     : ADMIN
--%>

<%@page import="model.KhachHangDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>JSP Page</title>
    </head>
    <% KhachHangDAO khDAO = new KhachHangDAO();%>
    <body>
        <jsp:include page="menu.jsp"></jsp:include>
            <br><br>
            <div id="container">

                <br><br>
                <div id="content">

                    <div id="content-left" style="width: 25%">
                        <h2>Welcome to ${USERNAME}</h2><br>
                    <h6><a style="color: #050505; margin-left: 10px" href="addsanpham.jsp">Quản Lý Sản Phẩm</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="khachhanh.jsp">Quản Lý Khách Hàng</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="hoadon.jsp">QUẢN LÝ HÓA ĐƠN</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="chitiethoadon.jsp">CHI TIẾT HÓA ĐƠN</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="loaisanpham.jsp">LOẠI SẢN PHẨM</a></h6>
                    <h6><a style="color: #050505; margin-left: 10px" href="LogoutServlet">Logout</a></h6>
                </div>
                <div id="content-right" style="width: 75%">
                    <h1><strong>QUẢN LÝ KHÁCH HÀNG</strong></h1>
                    <form action="KHServlet" method="post">
                        <div class="form-group">
                            <label for="email">MÃ KHÁCH HÀNG:</label>
                            <input type="text" class="form-control" placeholder=" Mời nhập mã khách hàng" name="MaKH" value="${KHACHHANG.get(0)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">TÊN KHÁCH HÀNG:</label>
                            <input type="text" class="form-control" placeholder="Mời nhập tên khách hàng" name="TenKH" value="${KHACHHANG.get(1)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">ĐỊA CHỈ:</label>
                            <input type="text" class="form-control" placeholder="Mời nhập địa chỉ khách hàng" name="DiaChi" value="${KHACHHANG.get(2)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">EMAIL:</label>
                            <input type="text" class="form-control" placeholder="Mời nhập Email khách hàng" name="Email" value="${KHACHHANG.get(3)}"/>
                        </div>
                        <div class="form-group">
                            <label for="pwd">SỐ ĐIỆN THOẠI:</label>
                            <input type="number" class="form-control" placeholder="Mời nhập số điện thoại khách hàng" name="SoDienThoai" value="${KHACHHANG.get(4)}"/>
                        </div>
                        <button type="submit" class="btn btn-default" name="action" value="add">Add</button>
                        <button type="submit" class="btn btn-default" name="action" value="update">Update</button>
                    </form>
                    <h2>DANH SÁCH KHÁCH HÀNG</h2>
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>Mã khách hàng</th>
                                <th>Tên khách hàng</th>
                                <th>Địa chỉ</th>
                                <th>Email</th>
                                <th>Số điện thoại</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                for (int i = 0; i < khDAO.getAllKhachHang().size(); i++) {
                            %>
                            <tr>
                                <td><%=khDAO.getAllKhachHang().get(i).getMaKH()%></td>
                                <td><%=khDAO.getAllKhachHang().get(i).getTenKH()%></td>
                                <td><%=khDAO.getAllKhachHang().get(i).getDiaChi()%></td>
                                <td><%=khDAO.getAllKhachHang().get(i).getEmail()%></td>
                                <td><%=khDAO.getAllKhachHang().get(i).getSoDienThoai()%></td>
                                <td>
                                    <a href='<%="KHServlet?action=edit&MaKH=" + khDAO.getAllKhachHang().get(i).getMaKH()%>'><i class="fa fa-pencil" aria-hidden="true"></i>Edit</a>|
                                    <a href='<%="KHServlet?action=del&MaKH=" + khDAO.getAllKhachHang().get(i).getMaKH()%>'><i class="fa fa-trash" aria-hidden="true"></i>Del</a>
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
