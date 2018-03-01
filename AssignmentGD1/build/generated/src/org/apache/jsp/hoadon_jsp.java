package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.HoaDonDAO;

public final class hoadon_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("        <title>Hoa Don</title>\n");
      out.write("    </head>\n");
      out.write("    ");
 HoaDonDAO hdDAO = new HoaDonDAO();
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");

            if (session != null) {
                if (session.getAttribute("USERNAME") == null) {
                    response.sendRedirect("login.jsp");
                }
            }
        
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("            <br><br>\n");
      out.write("            <div id=\"container\">\n");
      out.write("\n");
      out.write("                <br><br>\n");
      out.write("                <div id=\"content\">\n");
      out.write("\n");
      out.write("                    <div id=\"content-left\" style=\"width: 25%\">\n");
      out.write("                        <h2>Welcome to ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${USERNAME}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h2><br>\n");
      out.write("                    <h6><a style=\"color: #050505; margin-left: 10px\" href=\"addsanpham.jsp\">QUẢN LÝ SẢN PHẨM</a></h6>\n");
      out.write("                    <h6><a style=\"color: #050505; margin-left: 10px\" href=\"khachhang.jsp\">QUẢN LÝ KHÁCH HÀNG</a></h6>\n");
      out.write("                    <h6><a style=\"color: #050505; margin-left: 10px\" href=\"hoadon.jsp\">QUẢN LÝ HÓA ĐƠN</a></h6>\n");
      out.write("                    <h6><a style=\"color: #050505; margin-left: 10px\" href=\"LogoutServlet\">LOGOUT</a></h6>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div id=\"content-right\" style=\"width: 75%\">\n");
      out.write("                    <h1><strong>QUẢN LÝ HÓA ĐƠN</strong></h1>\n");
      out.write("                    <form action=\"HoaDonServlet\" method=\"post\" >\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"email\">MÃ HÓA ĐƠN:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\" NHẬP MÃ HÓA ĐƠN\" name=\"idHD\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${HOADON.get(0)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"email\">MÃ KHÁCH HÀNG:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"NHẬP MÃ KHÁCH HÀNG\" name=\"idKH\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${HOADON.get(1)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pwd\">NGÀY LẬP HÓA ĐƠN:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"NHẬP NGÀY\" name=\"ngaylapHD\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${HOADON.get(2)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pwd\">TỔNG TIỀN:</label>\n");
      out.write("                            <input type=\"number\" class=\"form-control\" placeholder=\"NHẬP TỔNG TIỀN\" name=\"price\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${HOADON.get(3)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"pwd\">GHI CHÚ:</label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"NHẬP GHI CHÚ\" name=\"note\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${HOADON.get(4)}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\" name=\"action\" value=\"add\">ADD</button>\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\" name=\"action\" value=\"update\">UPDATE</button>\n");
      out.write("                    </form><hr><hr>\n");
      out.write("\n");
      out.write("                    <h2>DANH SÁCH HÓA ĐƠN</h2>\n");
      out.write("                    <table class=\"table table-bordered\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>MÃ HÓA ĐƠN</th>\n");
      out.write("                                <th>MÃ KHÁCH HÀNG</th>\n");
      out.write("                                <th>NGÀY LẬP HÓA ĐƠN</th>\n");
      out.write("                                <th>TỔNG TIỀN</th>\n");
      out.write("                                <th>GHI CHÚ</th>\n");
      out.write("                                <th>Action</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                for (int i = 0; i < hdDAO.getAllHoaDon().size(); i++) {
                            
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(hdDAO.getAllHoaDon().get(i).getIdHD());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(hdDAO.getAllHoaDon().get(i).getIdKH());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(hdDAO.getAllHoaDon().get(i).getNgaylapHD());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(hdDAO.getAllHoaDon().get(i).getPrice());
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(hdDAO.getAllHoaDon().get(i).getNote());
      out.write("</td>\n");
      out.write("                                <td>\n");
      out.write("                                    <a href='");
      out.print("HoaDonServlet?action=edit&idHD=" + hdDAO.getAllHoaDon().get(i).getIdHD());
      out.write("'>Edit</a>|\n");
      out.write("                                    <a href='");
      out.print("HoaDonServlet?action=del&idHD=" + hdDAO.getAllHoaDon().get(i).getIdHD());
      out.write("'>Del</a>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
