/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.75
 * Generated at: 2018-01-01 16:14:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Test_005fView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=BIG5\">\r\n");
      out.write("\t\t<title>Insert title here</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t查詢所有管理員\r\n");
      out.write("\t\t<FORM METHOD=\"post\" ACTION=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/adm.do\" >\r\n");
      out.write("\t        <input type=\"submit\" value=\"查詢\">\r\n");
      out.write("\t        <input type=\"hidden\" name=\"action\" value=\"get_adm_one_data\">\r\n");
      out.write("\t    </FORM> \r\n");
      out.write("\t    \r\n");
      out.write("\t           管理員編號+權限編號（MA00000005PU00000004）\r\n");
      out.write("\t    <FORM METHOD=\"post\" ACTION=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/man_men_data.do\" >\r\n");
      out.write("\t        <b>輸入編號:</b>\r\n");
      out.write("\t        <input type=\"text\" name=\"admno\">\r\n");
      out.write("\t        <input type=\"submit\" value=\"送出\">\r\n");
      out.write("\t        <input type=\"hidden\" name=\"button\" value=\"back\">\r\n");
      out.write("\t    </FORM>\r\n");
      out.write("\t  \r\n");
      out.write("\t  \t留言板搜尋\r\n");
      out.write("\t  \t<form method='post' action='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/pboard_article.do'>\r\n");
      out.write("\t  \t\t<input type=\"text\" name=\"title\">\r\n");
      out.write("\t  \t\t<input type=\"submit\" value=\"送出\">\r\n");
      out.write("\t        <input type=\"hidden\" name=\"button\" value=\"search\">\r\n");
      out.write("\t  \t</form>\r\n");
      out.write("\t  \t\r\n");
      out.write("\t  \t權限編號（PU00000008）\r\n");
      out.write("\t  \t<FORM METHOD=\"post\" ACTION=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/test.do\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t        <b>輸入編號:</b>\r\n");
      out.write("\t        <input type=\"file\" name=\"upfile1\">\r\n");
      out.write("\t        <input type=\"submit\" value=\"送出\">\r\n");
      out.write("\t        <input type=\"hidden\" name=\"action\" value=\"get_pur_one_data\">\r\n");
      out.write("\t    </FORM>\r\n");
      out.write("\t</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
