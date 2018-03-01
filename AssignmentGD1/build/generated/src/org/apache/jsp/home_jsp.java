package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.jsp", out, false);
      out.write("\n");
      out.write("        \n");
      out.write("            <br><br>\n");
      out.write("            <div id=\"container\">\n");
      out.write("                <br><br>\n");
      out.write("                <div id=\"content\">\n");
      out.write("                    <div id=\"content-left\">\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "slideshow.jsp", out, false);
      out.write("\n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <div class=\"prod\">\n");
      out.write("                                <div class=\"name\"><h3>SamSung Galaxy J7 Pro</h3></div>\n");
      out.write("                                <img class=\"image\" src=\"image/sp1.png\"/>\n");
      out.write("                                <div class=\"overlay\">\n");
      out.write("                                    <div class=\"text\">\n");
      out.write("                                        <p>\n");
      out.write("                                            <button type=\"submit\" name=\"action\" value=\"giohang\">dat hang</button>\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <div class=\"prod\">\n");
      out.write("                                <div class=\"name\"><h3>Lenovo IdeaPad 120S</h3></div>\n");
      out.write("                                <img class=\"image\" src=\"image/sp2.png\"/>\n");
      out.write("                                <div class=\"overlay\">\n");
      out.write("                                    <div class=\"text\">\n");
      out.write("                                        <p>\n");
      out.write("                                            * Thông tin sản phẩm<br>\n");
      out.write("                                            - Camera chính và camera trước 13MP<br>\n");
      out.write("                                            - Màn hình Full HD 6inch<br>\n");
      out.write("                                            - Thời lượng pin lên đến 2 ngày<br>\n");
      out.write("\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <div class=\"prod\">\n");
      out.write("                                <div class=\"name\"><h3>SamSung Galaxy S8</h3></div>\n");
      out.write("                                <img class=\"image\" src=\"image/sp3.png\"/>\n");
      out.write("                                <div class=\"overlay\">\n");
      out.write("                                    <div class=\"text\">\n");
      out.write("                                        <p>\n");
      out.write("                                            * Thông tin sản phẩm<br>\n");
      out.write("                                            - Camera chính và camera trước 13MP<br>\n");
      out.write("                                            - Màn hình Full HD 6inch<br>\n");
      out.write("                                            - Thời lượng pin lên đến 2 ngày<br>\n");
      out.write("\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <div class=\"prod\">\n");
      out.write("                                <div class=\"name\"><h3>iPhone 7 32G</h3></div>\n");
      out.write("                                <img class=\"image\" src=\"image/sp4.png\"/>\n");
      out.write("                                <div class=\"overlay\">\n");
      out.write("                                    <div class=\"text\">\n");
      out.write("                                        <p>\n");
      out.write("                                            * Thông tin sản phẩm<br>\n");
      out.write("                                            - Camera chính và camera trước 13MP<br>\n");
      out.write("                                            - Màn hình Full HD 6inch<br>\n");
      out.write("                                            - Thời lượng pin lên đến 2 ngày<br>\n");
      out.write("\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <div class=\"prod\">\n");
      out.write("                                <div class=\"name\"><h3>Oppo A71</h3></div>\n");
      out.write("                                <img class=\"image\" src=\"image/sp5.png\"/>\n");
      out.write("                                <div class=\"overlay\">\n");
      out.write("                                    <div class=\"text\">\n");
      out.write("                                        <p>\n");
      out.write("                                            * Thông tin sản phẩm<br>\n");
      out.write("                                            - Camera chính và camera trước 13MP<br>\n");
      out.write("                                            - Màn hình Full HD 6inch<br>\n");
      out.write("                                            - Thời lượng pin lên đến 2 ngày<br>\n");
      out.write("\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <div class=\"col-25\">\n");
      out.write("                            <div class=\"prod\">\n");
      out.write("                                <div class=\"name\"><h3>Oppo F3</h3></div>\n");
      out.write("                                <img class=\"image\" src=\"image/sp6.png\"/>\n");
      out.write("                                <div class=\"overlay\">\n");
      out.write("                                    <div class=\"text\">\n");
      out.write("                                        <p>\n");
      out.write("                                            * Thông tin sản phẩm<br>\n");
      out.write("                                            - Camera chính và camera trước 13MP<br>\n");
      out.write("                                            - Màn hình Full HD 6inch<br>\n");
      out.write("                                            - Thời lượng pin lên đến 2 ngày<br>\n");
      out.write("\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "content-right.jsp", out, false);
      out.write("\n");
      out.write("                </div>               \n");
      out.write("            </div>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write("        \n");
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
