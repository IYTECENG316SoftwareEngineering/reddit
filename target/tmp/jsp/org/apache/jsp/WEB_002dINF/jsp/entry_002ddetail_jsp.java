package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class entry_002ddetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jsp/../layout/taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_url_value_nobody.release();
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
      out.write("\r\n");
      out.write("<!-- include tag libs files -->\r\n");
      out.write("\r\n");
      out.write("<!-- in order to avoid insert tag libs to each page -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!-- \tuser registration form -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-9\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"text-left\">\r\n");
      out.write("\t\t<h3 > <a href=\"");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("\"> ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entry.topic.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </a></h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"thumbnail\">\r\n");
      out.write("\t\t<div class=\"caption-full\">\r\n");
      out.write("\t\t\t<p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entry.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"ratings\">\r\n");
      out.write("\t\t\t\t<span class=\"pull-right\"><b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entry.user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" </b>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entry.publishedDate}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<br>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>");
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

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/topic/${entry.topic.id}.html", java.lang.String.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }
}
