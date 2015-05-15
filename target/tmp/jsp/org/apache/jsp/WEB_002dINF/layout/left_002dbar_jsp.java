package org.apache.jsp.WEB_002dINF.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class left_002dbar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<div class=\"col-md-3\">\r\n");
      out.write("\t<p class=\"lead\">Populars</p>\r\n");
      out.write("\t<ul id=\"leftFrame\" class=\"list-group\">\r\n");
      out.write("\r\n");
      out.write("\t</ul>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\tsearchAjax();\r\n");
      out.write("\t\tgetCategories();\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction searchAjax() {\r\n");
      out.write("\t\t$\r\n");
      out.write("\t\t\t\t.ajax({\r\n");
      out.write("\t\t\t\t\turl : \"/topic/populars.html\",\r\n");
      out.write("\t\t\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\t\t\tsuccess : function(responce) {\r\n");
      out.write("\t\t\t\t\t\t/* what  i have to put here to updte my table <table id=\"table_grid\"> */\r\n");
      out.write("\t\t\t\t\t\t$\r\n");
      out.write("\t\t\t\t\t\t\t\t.each(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tresponce,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tfunction(key, topic) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tvar htmlrow = \"<a class='list-group-item' href='/topic/\"+topic.id+\".html'> <span class='badge'>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ topic.dailyEntryCount\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</span>\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ topic.title\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t+ \"</a>\";\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t$(\"#leftFrame\").append(htmlrow);\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t})\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\terror : function() {\r\n");
      out.write("\t\t\t\t\t\talert(\"error\");\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction getCategories() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"/category/list.html\",\r\n");
      out.write("\t\t\ttype : \"GET\",\r\n");
      out.write("\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\tsuccess : function(responce) {\r\n");
      out.write("\t\t\t\t/* what  i have to put here to updte my table <table id=\"table_grid\"> */\r\n");
      out.write("\t\t\t\t$.each(responce, function(key, category) {\r\n");
      out.write("\t\t\t\t\tvar htmlrow = \"<li><a href='/category/\" + category.name\r\n");
      out.write("\t\t\t\t\t\t\t+ \".html' </a>\" + category.name + \"</li> \";\r\n");
      out.write("\t\t\t\t\t$(\"#categoryList\").append(htmlrow);\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\terror : function() {\r\n");
      out.write("\t\t\t\talert(\"error\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
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
