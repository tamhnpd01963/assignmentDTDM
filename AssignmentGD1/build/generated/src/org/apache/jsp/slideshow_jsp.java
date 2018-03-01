package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class slideshow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>slideshow</title>\n");
      out.write("        <link href=\"css/css_slideshows.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"css/jquery-1.9.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script language=\"javascript\">\n");
      out.write("            /***************************************************************************************\n");
      out.write("             * Run when page load\n");
      out.write("             ***************************************************************************************/\n");
      out.write("            $(document).ready(function ()\n");
      out.write("            {\n");
      out.write("                initSlideShow();\n");
      out.write("\n");
      out.write("            });\n");
      out.write("            /***************************************************************************************\n");
      out.write("             ****************************************************************************************/\n");
      out.write("            function initSlideShow()\n");
      out.write("            {\n");
      out.write("                if ($(\".slideshow div\").length > 1) //Only run slideshow if have the slideshow element and have more than one image.\n");
      out.write("                {\n");
      out.write("                    var transationTime = 5000;//5000 mili seconds i.e 5 second\n");
      out.write("                    $(\".slideshow div:first\").addClass('active'); //Make the first image become active i.e on the top of other images\n");
      out.write("                    setInterval(slideChangeImage, transationTime); //set timer to run the slide show.\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            /***************************************************************************************\n");
      out.write("             ****************************************************************************************/\n");
      out.write("\n");
      out.write("            function slideChangeImage()\n");
      out.write("            {\n");
      out.write("                var active = $(\".slideshow div.active\"); //Get the current active element.\n");
      out.write("                if (active.length == 0)\n");
      out.write("                {\n");
      out.write("                    active = $(\".slideshow div:last\"); //If do not see the active element is the last image.\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                var next = active.next().length ? active.next() : $(\".slideshow div:first\"); //get the next element to do the transition\n");
      out.write("                active.addClass('lastactive');\n");
      out.write("                next.css({opacity: 0.0}) //do the fade in fade out transition\n");
      out.write("                        .addClass('active')\n");
      out.write("                        .animate({opacity: 1.0}, 1500, function ()\n");
      out.write("                        {\n");
      out.write("                            active.removeClass(\"active lastactive\");\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"slideshow\">\n");
      out.write("            <div><a href=\"#\"><img src=\"image/1.png\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("            <div><a href=\"#\"><img src=\"image/2.png\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("            <div><a href=\"#\"><img src=\"image/3.png\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("            <div><a href=\"#\"><img src=\"image/4.png\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("            <div><a href=\"#\"><img src=\"image/5.png\" alt=\"\" border=\"0\" /></a></div>\n");
      out.write("\n");
      out.write("        </div>\n");
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
