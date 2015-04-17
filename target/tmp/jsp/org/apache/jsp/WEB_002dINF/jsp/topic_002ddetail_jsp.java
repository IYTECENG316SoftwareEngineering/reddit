package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class topic_002ddetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jsp/../layout/taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_sec_authentication_var_property_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_security_authorize_access;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_errors_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_textarea_path_class_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_hidden_value_path_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_cssClass_commandName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_form_method_cssClass_commandName;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_form_input_value_path_id_class_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_sec_authentication_var_property_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_security_authorize_access = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_errors_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_textarea_path_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_hidden_value_path_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_spring_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_cssClass_commandName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_form_method_cssClass_commandName = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_form_input_value_path_id_class_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_sec_authentication_var_property_nobody.release();
    _jspx_tagPool_security_authorize_access.release();
    _jspx_tagPool_form_errors_path_nobody.release();
    _jspx_tagPool_form_textarea_path_class_nobody.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_form_hidden_value_path_nobody.release();
    _jspx_tagPool_spring_url_value_nobody.release();
    _jspx_tagPool_form_form_cssClass_commandName.release();
    _jspx_tagPool_form_form_method_cssClass_commandName.release();
    _jspx_tagPool_form_input_value_path_id_class_nobody.release();
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
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_sec_authentication_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-9\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"text-left\">\r\n");
      out.write("\t\t<h3>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topic.title}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h3>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t");
      //  security:authorize
      org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
      _jspx_th_security_authorize_1.setPageContext(_jspx_page_context);
      _jspx_th_security_authorize_1.setParent(null);
      _jspx_th_security_authorize_1.setAccess("isAuthenticated()");
      int _jspx_eval_security_authorize_1 = _jspx_th_security_authorize_1.doStartTag();
      if (_jspx_eval_security_authorize_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\r\n");
        out.write("\t\t");
        //  form:form
        org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_0 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_method_cssClass_commandName.get(org.springframework.web.servlet.tags.form.FormTag.class);
        _jspx_th_form_form_0.setPageContext(_jspx_page_context);
        _jspx_th_form_form_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_1);
        _jspx_th_form_form_0.setCommandName("entry");
        _jspx_th_form_form_0.setMethod("POST");
        _jspx_th_form_form_0.setCssClass("form-horizontal");
        int[] _jspx_push_body_count_form_form_0 = new int[] { 0 };
        try {
          int _jspx_eval_form_form_0 = _jspx_th_form_form_0.doStartTag();
          if (_jspx_eval_form_form_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\r\n");
              out.write("\t\t\t");
              if (_jspx_meth_form_textarea_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_0, _jspx_page_context, _jspx_push_body_count_form_form_0))
                return;
              out.write("\r\n");
              out.write("\t\t\t");
              //  form:errors
              org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_form_errors_0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _jspx_tagPool_form_errors_path_nobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
              _jspx_th_form_errors_0.setPageContext(_jspx_page_context);
              _jspx_th_form_errors_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
              _jspx_th_form_errors_0.setPath("description");
              int[] _jspx_push_body_count_form_errors_0 = new int[] { 0 };
              try {
                int _jspx_eval_form_errors_0 = _jspx_th_form_errors_0.doStartTag();
                if (_jspx_th_form_errors_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (Throwable _jspx_exception) {
                while (_jspx_push_body_count_form_errors_0[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_form_errors_0.doCatch(_jspx_exception);
              } finally {
                _jspx_th_form_errors_0.doFinally();
                _jspx_tagPool_form_errors_path_nobody.reuse(_jspx_th_form_errors_0);
              }
              out.write("\r\n");
              out.write("\t\t\t<br>\r\n");
              out.write("\t\t\t<button type=\"submit\" name=\"addEntry\" class=\"btn btn-default\">Submit</button>\r\n");
              out.write("\t\t");
              int evalDoAfterBody = _jspx_th_form_form_0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_form_form_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            return;
          }
        } catch (Throwable _jspx_exception) {
          while (_jspx_push_body_count_form_form_0[0]-- > 0)
            out = _jspx_page_context.popBody();
          _jspx_th_form_form_0.doCatch(_jspx_exception);
        } finally {
          _jspx_th_form_form_0.doFinally();
          _jspx_tagPool_form_form_method_cssClass_commandName.reuse(_jspx_th_form_form_0);
        }
        out.write("\r\n");
        out.write("\t");
      }
      if (_jspx_th_security_authorize_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_1);
        return;
      }
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_1);
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      if (_jspx_meth_form_form_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).on(\"click\", \".open-editEntry\", function() {\r\n");
      out.write("\t\tvar my_entry = $(this).data('entry');\r\n");
      out.write("\t\tvar entry_id = $(this).data('id');\r\n");
      out.write("\t\t$(\".modal-body #desc\").val(my_entry);\r\n");
      out.write("\t\t$(\".modal-body #id\").val(entry_id);\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
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

  private boolean _jspx_meth_sec_authentication_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  sec:authentication
    org.springframework.security.taglibs.authz.AuthenticationTag _jspx_th_sec_authentication_0 = (org.springframework.security.taglibs.authz.AuthenticationTag) _jspx_tagPool_sec_authentication_var_property_nobody.get(org.springframework.security.taglibs.authz.AuthenticationTag.class);
    _jspx_th_sec_authentication_0.setPageContext(_jspx_page_context);
    _jspx_th_sec_authentication_0.setParent(null);
    _jspx_th_sec_authentication_0.setVar("user");
    _jspx_th_sec_authentication_0.setProperty("principal");
    int _jspx_eval_sec_authentication_0 = _jspx_th_sec_authentication_0.doStartTag();
    if (_jspx_th_sec_authentication_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_sec_authentication_var_property_nobody.reuse(_jspx_th_sec_authentication_0);
      return true;
    }
    _jspx_tagPool_sec_authentication_var_property_nobody.reuse(_jspx_th_sec_authentication_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${topic.entries}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("entry");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t<div class=\"thumbnail\">\r\n");
          out.write("\t\t\t<div class=\"caption-full\">\r\n");
          out.write("\t\t\t\t<p>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entry.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("\r\n");
          out.write("\t\t\t\t<div class=\"ratings\">\r\n");
          out.write("\t\t\t\t\t<span class=\"pull-right\"><b>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entry.user.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </b> <a\r\n");
          out.write("\t\t\t\t\t\thref=\"");
          if (_jspx_meth_spring_url_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entry.dateString}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("\t\t\t\t\t\t");
          if (_jspx_meth_security_authorize_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write(" </span>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t<br>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_spring_url_0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("/entry/${entry.id}.html", java.lang.String.class, (PageContext)_jspx_page_context, null));
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

  private boolean _jspx_meth_security_authorize_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_authorize_0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _jspx_tagPool_security_authorize_access.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_authorize_0.setPageContext(_jspx_page_context);
    _jspx_th_security_authorize_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_security_authorize_0.setAccess("isAuthenticated()");
    int _jspx_eval_security_authorize_0 = _jspx_th_security_authorize_0.doStartTag();
    if (_jspx_eval_security_authorize_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_security_authorize_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
        return true;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t");
    }
    if (_jspx_th_security_authorize_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_0);
      return true;
    }
    _jspx_tagPool_security_authorize_access.reuse(_jspx_th_security_authorize_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_security_authorize_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_authorize_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entry.user.name == user.username}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t\t\t\t\t\t<button class=\"open-editEntry btn btn-primary btn-sm\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\tdata-id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entry.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" data-entry=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${entry.description}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\r\n");
        out.write("\t\t\t\t\t\t\t\t\tdata-toggle=\"modal\" data-target=\"#myModal\">Edit</button>\r\n");
        out.write("\t\t\t\t\t\t\t");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_form_textarea_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:textarea
    org.springframework.web.servlet.tags.form.TextareaTag _jspx_th_form_textarea_0 = (org.springframework.web.servlet.tags.form.TextareaTag) _jspx_tagPool_form_textarea_path_class_nobody.get(org.springframework.web.servlet.tags.form.TextareaTag.class);
    _jspx_th_form_textarea_0.setPageContext(_jspx_page_context);
    _jspx_th_form_textarea_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_0);
    _jspx_th_form_textarea_0.setPath("description");
    _jspx_th_form_textarea_0.setDynamicAttribute(null, "class", new String("form-control"));
    int[] _jspx_push_body_count_form_textarea_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_textarea_0 = _jspx_th_form_textarea_0.doStartTag();
      if (_jspx_th_form_textarea_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_textarea_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_textarea_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_textarea_0.doFinally();
      _jspx_tagPool_form_textarea_path_class_nobody.reuse(_jspx_th_form_textarea_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_form_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_form_1 = (org.springframework.web.servlet.tags.form.FormTag) _jspx_tagPool_form_form_cssClass_commandName.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_form_1.setPageContext(_jspx_page_context);
    _jspx_th_form_form_1.setParent(null);
    _jspx_th_form_form_1.setCommandName("entry");
    _jspx_th_form_form_1.setCssClass("form-horizontal topicForm");
    int[] _jspx_push_body_count_form_form_1 = new int[] { 0 };
    try {
      int _jspx_eval_form_form_1 = _jspx_th_form_form_1.doStartTag();
      if (_jspx_eval_form_form_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t<!-- Modal -->\r\n");
          out.write("\t<div class=\"modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
          out.write("\t\taria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\r\n");
          out.write("\t\t<div class=\"modal-dialog\">\r\n");
          out.write("\t\t\t<div class=\"modal-content\">\r\n");
          out.write("\t\t\t\t<div class=\"modal-header\">\r\n");
          out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">\r\n");
          out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span><span class=\"sr-only\">Close</span>\r\n");
          out.write("\t\t\t\t\t</button>\r\n");
          out.write("\t\t\t\t\t<h6 class=\"modal-title\" id=\"myModalLabel\">Edit Entry</h6>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
          out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
          out.write("\t\t\t\t\t\t<label for=\"description\" class=\"col-sm-2 control-label\"><h5>Entry:</h5></label>\r\n");
          out.write("\t\t\t\t\t\t<div class=\"col-sm-9\">\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_form_input_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t");
          if (_jspx_meth_form_hidden_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_form_form_1, _jspx_page_context, _jspx_push_body_count_form_form_1))
            return true;
          out.write("\r\n");
          out.write("\t\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
          out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">\r\n");
          out.write("\t\t\t\t\t\tClose</button>\r\n");
          out.write("\t\t\t\t\t<input type=\"submit\" name=\"edit\" class=\"btn btn-primary\"\r\n");
          out.write("\t\t\t\t\t\tvalue=\"Save\" />\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t</div>\r\n");
          out.write("\r\n");
          out.write("\t\t</div>\r\n");
          out.write("\t</div>\r\n");
          int evalDoAfterBody = _jspx_th_form_form_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_form_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_form_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_form_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_form_1.doFinally();
      _jspx_tagPool_form_form_cssClass_commandName.reuse(_jspx_th_form_form_1);
    }
    return false;
  }

  private boolean _jspx_meth_form_input_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_form_input_0 = (org.springframework.web.servlet.tags.form.InputTag) _jspx_tagPool_form_input_value_path_id_class_nobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_form_input_0.setPageContext(_jspx_page_context);
    _jspx_th_form_input_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_input_0.setId("desc");
    _jspx_th_form_input_0.setPath("description");
    _jspx_th_form_input_0.setDynamicAttribute(null, "class", new String("form-control"));
    _jspx_th_form_input_0.setDynamicAttribute(null, "value", new String(""));
    int[] _jspx_push_body_count_form_input_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_input_0 = _jspx_th_form_input_0.doStartTag();
      if (_jspx_th_form_input_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_input_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_input_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_input_0.doFinally();
      _jspx_tagPool_form_input_value_path_id_class_nobody.reuse(_jspx_th_form_input_0);
    }
    return false;
  }

  private boolean _jspx_meth_form_hidden_0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_form_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_form_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:hidden
    org.springframework.web.servlet.tags.form.HiddenInputTag _jspx_th_form_hidden_0 = (org.springframework.web.servlet.tags.form.HiddenInputTag) _jspx_tagPool_form_hidden_value_path_nobody.get(org.springframework.web.servlet.tags.form.HiddenInputTag.class);
    _jspx_th_form_hidden_0.setPageContext(_jspx_page_context);
    _jspx_th_form_hidden_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_form_1);
    _jspx_th_form_hidden_0.setPath("id");
    _jspx_th_form_hidden_0.setDynamicAttribute(null, "value", new String(""));
    int[] _jspx_push_body_count_form_hidden_0 = new int[] { 0 };
    try {
      int _jspx_eval_form_hidden_0 = _jspx_th_form_hidden_0.doStartTag();
      if (_jspx_th_form_hidden_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_hidden_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_hidden_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_hidden_0.doFinally();
      _jspx_tagPool_form_hidden_value_path_nobody.reuse(_jspx_th_form_hidden_0);
    }
    return false;
  }
}
