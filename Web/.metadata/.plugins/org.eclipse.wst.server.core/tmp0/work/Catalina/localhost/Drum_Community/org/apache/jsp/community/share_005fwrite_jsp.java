/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.39
 * Generated at: 2017-10-12 05:08:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.community;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class share_005fwrite_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<script language = \"javascript\">\r\n");
      out.write("\tfunction writeCheck()\r\n");
      out.write("\t{\r\n");
      out.write("\t var form = document.writeform;\r\n");
      out.write("\t \r\n");
      out.write("\t if( !form.name.value )   // form 에 있는 name 값이 없을 때\r\n");
      out.write("\t {\r\n");
      out.write("\t  alert( \"이름을 적어주세요\" ); // 경고창 띄움\r\n");
      out.write("\t  form.name.focus();   // form 에 있는 name 위치로 이동\r\n");
      out.write("\t  return;\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\t if( !form.password.value )\r\n");
      out.write("\t {\r\n");
      out.write("\t  alert( \"비밀번호를 적어주세요\" );\r\n");
      out.write("\t  form.password.focus();\r\n");
      out.write("\t  return;\r\n");
      out.write("\t }\r\n");
      out.write("\t \r\n");
      out.write("\tif( !form.title.value )\r\n");
      out.write("\t {\r\n");
      out.write("\t  alert( \"제목을 적어주세요\" );\r\n");
      out.write("\t  form.title.focus();\r\n");
      out.write("\t  return;\r\n");
      out.write("\t }\r\n");
      out.write("\t\r\n");
      out.write("\tif( !form.memo.value )\r\n");
      out.write("\t {\r\n");
      out.write("\t  alert( \"내용을 적어주세요\" );\r\n");
      out.write("\t  form.memo.focus();\r\n");
      out.write("\t  return;\r\n");
      out.write("\t }\r\n");
      out.write("\t\r\n");
      out.write("\tform.submit();\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\r\n");
      out.write("<title>공유하기</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"community.css\" type=\"text/css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"wrapper\">\r\n");
      out.write("\t\t\t<div class=\"header1\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"header2\">\r\n");
      out.write("\t\t\t\t<!-- <form name=form_login method=post>\r\n");
      out.write("\t\t\t\tID <input type=\"text\" name=\"id\">\r\n");
      out.write("\t\t\t\tPW <input type=\"text\" name=\"pw\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" name=\"login\" value=\"로그인\" onclick = \"location.href = 'Login.jsp'\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" name=\"member\" onclick = \"location.href = 'member.html'\">회원가입</button>\r\n");
      out.write("\t\t\t\t</form> -->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"menu\">\r\n");
      out.write("\t\t\t\t\t<li class=\"bar\">│</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"menuLink\"><a href=\"post.jsp\">자유게시판</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"bar\">│</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"menuLink\"><a href=\"share.jsp\">공유하기</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"bar\">│</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"menuLink\"><a href=\"notice.jsp\">공지사항</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"bar\">│</li>\r\n");
      out.write("\t\t\t\t\t<li class=\"menuLink\"><a href=\"main.html\">홈</a></li>\r\n");
      out.write("\t\t\t\t\t<li class=\"bar\">|</li>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"board\" style=\"width: 50%; margin: 0 25%; position: absoulte; align: center;\">\r\n");
      out.write("\t\t\t\t<table align = center>\r\n");
      out.write("\t\t\t\t\t<form name = writeform method = post action = \"share_write_ok.jsp\">\r\n");
      out.write("\t\t\t\t\t  <tr>\r\n");
      out.write("\t\t\t\t\t   <td>\r\n");
      out.write("\t\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t    <table width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\">\r\n");
      out.write("\t\t\t\t\t     <tr style=\"background:url('img/table_mid.gif') repeat-x; text-align:center;\">\r\n");
      out.write("\t\t\t\t\t      <td width=\"5\"><img src=\"img/table_left.gif\" width=\"5\" height=\"30\" /></td>\r\n");
      out.write("\t\t\t\t\t      <td>글쓰기</td>\r\n");
      out.write("\t\t\t\t\t      <td width=\"5\"><img src=\"img/table_right.gif\" width=\"5\" height=\"30\" /></td>\r\n");
      out.write("\t\t\t\t\t     </tr>\r\n");
      out.write("\t\t\t\t\t    </table>\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t   <table>\r\n");
      out.write("\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t      <td align=\"center\">제목</td>\r\n");
      out.write("\t\t\t\t\t      <td><input name=\"title\" size=\"50\" maxlength=\"100\"></td>\r\n");
      out.write("\t\t\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t     </tr>\r\n");
      out.write("\t\t\t\t\t     <tr height=\"1\" bgcolor=\"#dddddd\"><td colspan=\"4\"></td></tr>\r\n");
      out.write("\t\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t      <td align=\"center\">이름</td>\r\n");
      out.write("\t\t\t\t\t      <td><input name=\"name\" size=\"50\" maxlength=\"50\"></td>\r\n");
      out.write("\t\t\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t     </tr>\r\n");
      out.write("\t\t\t\t\t      <tr height=\"1\" bgcolor=\"#dddddd\"><td colspan=\"4\"></td></tr>\r\n");
      out.write("\t\t\t\t\t    <tr>\r\n");
      out.write("\t\t\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t      <td align=\"center\">비밀번호</td>\r\n");
      out.write("\t\t\t\t\t      <td><input name=\"password\" size=\"50\" maxlength=\"50\"></td>\r\n");
      out.write("\t\t\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t     </tr>\r\n");
      out.write("\t\t\t\t\t     <tr height=\"1\" bgcolor=\"#dddddd\"><td colspan=\"4\"></td></tr>\r\n");
      out.write("\t\t\t\t\t     <tr>\r\n");
      out.write("\t\t\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t      <td align=\"center\">내용</td>\r\n");
      out.write("\t\t\t\t\t      <td><textarea name=\"memo\" cols=\"50\" rows=\"13\"></textarea></td>\r\n");
      out.write("\t\t\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t     </tr>\r\n");
      out.write("\t\t\t\t\t     <tr height=\"1\" bgcolor=\"#dddddd\"><td colspan=\"4\"></td></tr>\r\n");
      out.write("\t\t\t\t\t     <tr height=\"1\" bgcolor=\"#82B5DF\"><td colspan=\"4\"></td></tr>\r\n");
      out.write("\t\t\t\t\t     <tr align=\"center\">\r\n");
      out.write("\t\t\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t      <td colspan=\"2\"><input type=button value=\"등록\" OnClick = \"javascript:writeCheck();\">\r\n");
      out.write("\t\t\t\t\t       <input type=button value=\"취소\" OnClick = \"javascript:history.back(-1);\">\r\n");
      out.write("\t\t\t\t\t      <td>&nbsp;</td>\r\n");
      out.write("\t\t\t\t\t     </tr>\r\n");
      out.write("\t\t\t\t\t    </table>\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\t   </td>\r\n");
      out.write("\t\t\t\t\t  </tr>\r\n");
      out.write("\t\t\t\t  </form>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"footer\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
