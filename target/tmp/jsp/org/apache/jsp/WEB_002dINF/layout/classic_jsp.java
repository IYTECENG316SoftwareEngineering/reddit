package org.apache.jsp.WEB_002dINF.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class classic_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/layout/../layout/taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sec_authentication_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_security_authorize_access;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_sec_authentication_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_security_authorize_access = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_sec_authentication_property_nobody.release();
    _jspx_tagPool_security_authorize_access.release();
    _jspx_tagPool_c_url_value_nobody.release();
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
      out.write("<!--  Add taglib -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://cdn.jsdelivr.net/jquery.validation/1.13.1/jquery.validate.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Jquery Integration -->\r\n");
      out.write("\r\n");
      out.write("<script src=\"//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- End of Jquery Integration -->\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap integration -->\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Optional theme -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Latest compiled and minified JavaScript -->\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!--End of Bootstrap integration -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("\r\n");
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
      out.write("<title>");
      if (_jspx_meth_tiles_getAsString_0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- reads the current attribute in general.xml, and put it in the page scope -->\r\n");
      out.write("\t");
      //  tilesx:useAttribute
      org.apache.tiles.jsp.taglib.UseAttributeTag _jspx_th_tilesx_useAttribute_0 = (_jspx_resourceInjector != null)? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.UseAttributeTag.class) : new org.apache.tiles.jsp.taglib.UseAttributeTag();
      _jspx_th_tilesx_useAttribute_0.setJspContext(_jspx_page_context);
      _jspx_th_tilesx_useAttribute_0.setName("current");
      _jspx_th_tilesx_useAttribute_0.doTag();
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_tilesx_useAttribute_0);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- from navbar example of bootstrap -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Static navbar -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"#\">CoDict</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\"\r\n");
      out.write("\t\t\t\tid=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\r\n");
      out.write("\t\t\t\t\t<li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${current == 'index' ?  'active' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a\r\n");
      out.write("\t\t\t\t\t\thref='");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("'>Home</a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<li class=\"dropdown\"><a href=\"#\" data-toggle=\"dropdown\"\r\n");
      out.write("\t\t\t\t\t\tclass=\"dropdown-toggle\">Categories <b class=\"caret\"></b></a>\r\n");
      out.write("\t\t\t\t\t\t<ul id=\"categoryList\" class=\"dropdown-menu\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_security_authorize_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_security_authorize_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_security_authorize_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_security_authorize_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t<form class=\"navbar-form navbar-left\" role=\"search\"\r\n");
      out.write("\t\t\t\t\taction=\"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\" method=\"GET\">\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search\"\r\n");
      out.write("\t\t\t\t\t\t\tname=criteria>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<button type=\"submit\" class=\"btn btn-default\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"glyphicon glyphicon-search\"></i>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_insertAttribute_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      if (_jspx_meth_tiles_insertAttribute_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t<br> <br>\r\n");
      out.write("\t\t<center>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_tiles_insertAttribute_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</center>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>");
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

  private boolean _jspx_meth_tiles_getAsString_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.tiles.jsp.taglib.GetAsStringTag _jspx_th_tiles_getAsString_0 = (_jspx_resourceInjector != null)? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.GetAsStringTag.class) : new org.apache.tiles.jsp.taglib.GetAsStringTag();
    _jspx_th_tiles_getAsString_0.setJspContext(_jspx_page_context);
    _jspx_th_tiles_getAsString_0.setName("title");
    _jspx_th_tiles_getAsString_0.doTag();
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_tiles_getAsString_0);
    return false;
  }

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setValue("/");
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

  private boolean _jspx_meth_security_authorize_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_0.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_0.setParent(null);
    _jspx_th_security_authorize_0.setAccess("hasRole('ROLE_ADMIN')");
    int _jspx_eval_security_authorize_0 = _jspx_th_security_authorize_0.doStartTag();
    if (_jspx_eval_security_authorize_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${current == 'users' ?  'active' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      if (_jspx_meth_spring_url_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_security_authorize_0, _jspx_page_context))
        return true;
      out.write("\">Users</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${current == 'topics' ?  'active' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      if (_jspx_meth_spring_url_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_security_authorize_0, _jspx_page_context))
        return true;
      out.write("\">Topics</a></li>\r\n");
      out.write("\t\t\t\t\t");
    }
    if (_jspx_th_security_authorize_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_0);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_0);
    return false;
  }

  private boolean _jspx_meth_spring_url_1(javax.servlet.jsp.tagext.JspTag _jspx_th_security_authorize_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_1 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_0);
    _jspx_th_spring_url_1.setValue("/users.html");
    int[] _jspx_push_body_count_spring_url_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_1 = _jspx_th_spring_url_1.doStartTag();
      if (_jspx_th_spring_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_1.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_2(javax.servlet.jsp.tagext.JspTag _jspx_th_security_authorize_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_2 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_2.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_0);
    _jspx_th_spring_url_2.setValue("/topics.html");
    int[] _jspx_push_body_count_spring_url_2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_2 = _jspx_th_spring_url_2.doStartTag();
      if (_jspx_th_spring_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_2.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_2);
    }
    return false;
  }

  private boolean _jspx_meth_security_authorize_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_1.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_1.setParent(null);
    _jspx_th_security_authorize_1.setAccess("isAuthenticated()");
    int _jspx_eval_security_authorize_1 = _jspx_th_security_authorize_1.doStartTag();
    if (_jspx_eval_security_authorize_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${current == 'account' ?  'active' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      if (_jspx_meth_spring_url_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_security_authorize_1, _jspx_page_context))
        return true;
      out.write('"');
      out.write('>');
      if (_jspx_meth_sec_authentication_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_security_authorize_1, _jspx_page_context))
        return true;
      out.write("</a></li>\r\n");
      out.write("\t\t\t\t\t");
    }
    if (_jspx_th_security_authorize_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_1);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_1);
    return false;
  }

  private boolean _jspx_meth_spring_url_3(javax.servlet.jsp.tagext.JspTag _jspx_th_security_authorize_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_3 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_3.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_1);
    _jspx_th_spring_url_3.setValue("/account.html");
    int[] _jspx_push_body_count_spring_url_3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_3 = _jspx_th_spring_url_3.doStartTag();
      if (_jspx_th_spring_url_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_3.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_3);
    }
    return false;
  }

  private boolean _jspx_meth_sec_authentication_0(javax.servlet.jsp.tagext.JspTag _jspx_th_security_authorize_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_authentication_0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _jspx_tagPool_sec_authentication_property_nobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_sec_authentication_0.setPageContext(_jspx_page_context);
    _jspx_th_sec_authentication_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_1);
    _jspx_th_sec_authentication_0.setProperty("name");
    int _jspx_eval_sec_authentication_0 = _jspx_th_sec_authentication_0.doStartTag();
    if (_jspx_th_sec_authentication_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authentication_property_nobody.reuse(_jspx_th_sec_authentication_0);
      return true;
    }
    _jspx_tagPool_sec_authentication_property_nobody.reuse(_jspx_th_sec_authentication_0);
    return false;
  }

  private boolean _jspx_meth_security_authorize_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_2.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_2.setParent(null);
    _jspx_th_security_authorize_2.setAccess("! isAuthenticated()");
    int _jspx_eval_security_authorize_2 = _jspx_th_security_authorize_2.doStartTag();
    if (_jspx_eval_security_authorize_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${current == 'register' ?  'active' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      if (_jspx_meth_spring_url_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_security_authorize_2, _jspx_page_context))
        return true;
      out.write("\">Register</a></li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${current == 'login' ?  'active' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><a\r\n");
      out.write("\t\t\t\t\t\t\thref=\"");
      if (_jspx_meth_spring_url_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_security_authorize_2, _jspx_page_context))
        return true;
      out.write("\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t");
    }
    if (_jspx_th_security_authorize_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_2);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_2);
    return false;
  }

  private boolean _jspx_meth_spring_url_4(javax.servlet.jsp.tagext.JspTag _jspx_th_security_authorize_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_4 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_4.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_2);
    _jspx_th_spring_url_4.setValue("/register.html");
    int[] _jspx_push_body_count_spring_url_4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_4 = _jspx_th_spring_url_4.doStartTag();
      if (_jspx_th_spring_url_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_4.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_5(javax.servlet.jsp.tagext.JspTag _jspx_th_security_authorize_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_5 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_5.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_2);
    _jspx_th_spring_url_5.setValue("/login.html");
    int[] _jspx_push_body_count_spring_url_5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_5 = _jspx_th_spring_url_5.doStartTag();
      if (_jspx_th_spring_url_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_5.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_5);
    }
    return false;
  }

  private boolean _jspx_meth_security_authorize_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_3 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_3.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_3.setParent(null);
    _jspx_th_security_authorize_3.setAccess("isAuthenticated()");
    int _jspx_eval_security_authorize_3 = _jspx_th_security_authorize_3.doStartTag();
    if (_jspx_eval_security_authorize_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      if (_jspx_meth_spring_url_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_security_authorize_3, _jspx_page_context))
        return true;
      out.write("\">Logout</a></li>\r\n");
      out.write("\t\t\t\t\t");
    }
    if (_jspx_th_security_authorize_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_3);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_3);
    return false;
  }

  private boolean _jspx_meth_spring_url_6(javax.servlet.jsp.tagext.JspTag _jspx_th_security_authorize_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_6 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_6.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_3);
    _jspx_th_spring_url_6.setValue("/logout");
    int[] _jspx_push_body_count_spring_url_6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_6 = _jspx_th_spring_url_6.doStartTag();
      if (_jspx_th_spring_url_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_6.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/result.html");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_0 = (_jspx_resourceInjector != null)? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_tiles_insertAttribute_0.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_0.setName("left-bar");
    _jspx_th_tiles_insertAttribute_0.doTag();
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_tiles_insertAttribute_0);
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_1 = (_jspx_resourceInjector != null)? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_tiles_insertAttribute_1.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_1.setName("body");
    _jspx_th_tiles_insertAttribute_1.doTag();
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_tiles_insertAttribute_1);
    return false;
  }

  private boolean _jspx_meth_tiles_insertAttribute_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_insertAttribute_2 = (_jspx_resourceInjector != null)? _jspx_resourceInjector.createTagHandlerInstance(org.apache.tiles.jsp.taglib.InsertAttributeTag.class) : new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    _jspx_th_tiles_insertAttribute_2.setJspContext(_jspx_page_context);
    _jspx_th_tiles_insertAttribute_2.setName("footer");
    _jspx_th_tiles_insertAttribute_2.doTag();
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_tiles_insertAttribute_2);
    return false;
  }
}
