<%-- 
    Document   : giohang
    Created on : Oct 24, 2017, 6:41:13 PM
    Author     : ADMIN
--%>

<%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="model.GioHang"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Anh</title>
    <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="js/jquery.min.js"></script>
    <!-- Custom Theme files -->
    <!--theme-style-->
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <link href="fontawesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <!--//theme-style-->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Bonfire Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
          Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!--fonts-->
    <link href='http://fonts.googleapis.com/css?family=Exo:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
    <!--//fonts-->
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>
    <script type="text/javascript">
        jQuery(document).ready(function ($) {
            $(".scroll").click(function (event) {
                event.preventDefault();
                $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
            });
        });
    </script>
    <!--slider-script-->
    <script src="js/responsiveslides.min.js"></script>
    <script>
        $(function () {
            $("#slider1").responsiveSlides({
                auto: true,
                speed: 500,
                namespace: "callbacks",
                pager: true
            });
        });
    </script>
    <!--//slider-script-->
    <script>$(document).ready(function (c) {
            $('.alert-close').on('click', function (c) {
                $('.message').fadeOut('slow', function (c) {
                    $('.message').remove();
                });
            });
        });
    </script>
    <script>$(document).ready(function (c) {
            $('.alert-close1').on('click', function (c) {
                $('.message1').fadeOut('slow', function (c) {
                    $('.message1').remove();
                });
            });
        });
    </script>
</head>
<body>
    <%

        GioHang cart = (GioHang) session.getAttribute("giohang");
        if (cart == null) {
            cart = new GioHang();
            session.setAttribute("cart", cart);
        }

    %>
    <jsp:include page="menu.jsp"></jsp:include>
        <div class="container">
            <table class="data" style="border: 1px solid #f2f2f2;width: 100%;">
                <tr class="data" style="border: 1px solid #f2f2f2;">

                    <th class="data" style="border: 1px solid #f2f2f2;">Tên sp</th>
                    <th class="data" style="border: 1px solid #f2f2f2;">Giá</th>
                    <th class="data" style="border: 1px solid #f2f2f2;">Số lượng</th>
                    <th class="data" style="border: 1px solid #f2f2f2;">Hành động</th>
                </tr>
            <%for (Map.Entry<Long, Item> list : cart.getCartItems().entrySet()) {%>
            <tr class="data" style="border: 1px solid #f2f2f2;">

                <td class="data"><%=list.getValue().getProduct().getName()%></td>
                <td class="data"><%=String.format("%,.0f", list.getValue().getProduct().getPrice())%> vnđ</td>
                <td class="data"><%=list.getValue().getQuantity()%></td>                           
                <td class="data"><a class="btn btn-danger" href="GioHangServlet?command=remove&id=<%=list.getValue().getProduct().getId()%>">Xóa</a></td>

            </tr>
            <%}%>

        </table>
        <div class="total">
            <div class="total_left">Tổng tiền: </div>
            <div class="total_right"><%=String.format("%,.0f", cart.totalCart())%> VNĐ</div>
            <div class="clearfix"> </div>
        </div>

    </div>


    <div class="clearfix"></div>
    <jsp:include page="footer.jsp"></jsp:include>

</body>
</html>