/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.76
 * Generated at: 2023-11-03 12:27:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class User_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/CSS/Admin_login.jsp", Long.valueOf(1698996664507L));
    _jspx_dependants.put("/CSS/Links.jsp", Long.valueOf(1698994928437L));
  }

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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<link\r\n");
      out.write("	href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("<link\r\n");
      out.write("	href=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("<script\r\n");
      out.write("	src=\"//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\n");
      out.write("body#LoginForm {\n");
      out.write("	background-image:\n");
      out.write("		url(\"https://images.pexels.com/photos/62693/pexels-photo-62693.jpeg?auto=compress&cs=tinysrgb&w=600\");\n");
      out.write("	background-repeat: no-repeat;\n");
      out.write("	background-position: center;\n");
      out.write("	background-size: cover;\n");
      out.write("	padding: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel h2 {\n");
      out.write("	color: #444444;\n");
      out.write("	font-size: 18px;\n");
      out.write("	margin: 0 0 8px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".panel p {\n");
      out.write("	color: #777777;\n");
      out.write("	font-size: 14px;\n");
      out.write("	margin-bottom: 30px;\n");
      out.write("	line-height: 24px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-form .form-control {\n");
      out.write("	background: #f7f7f7 none repeat scroll 0 0;\n");
      out.write("	border: 1px solid #d4d4d4;\n");
      out.write("	border-radius: 4px;\n");
      out.write("	font-size: 14px;\n");
      out.write("	height: 50px;\n");
      out.write("	line-height: 50px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main-div {\n");
      out.write("	background: #ffffff none repeat scroll 0 0;\n");
      out.write("	border-radius: 2px;\n");
      out.write("	margin: 10px auto 30px;\n");
      out.write("	max-width: 38%;\n");
      out.write("	padding: 50px 70px 70px 71px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-form .form-group {\n");
      out.write("	margin-bottom: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-form {\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".forgot a {\n");
      out.write("	color: #777777;\n");
      out.write("	font-size: 14px;\n");
      out.write("	text-decoration: underline;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-form  .btn.btn-primary {\n");
      out.write("	background: #f0ad4e none repeat scroll 0 0;\n");
      out.write("	border-color: #f0ad4e;\n");
      out.write("	color: #ffffff;\n");
      out.write("	font-size: 14px;\n");
      out.write("	width: 100%;\n");
      out.write("	height: 50px;\n");
      out.write("	line-height: 50px;\n");
      out.write("	padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".forgot {\n");
      out.write("	text-align: left;\n");
      out.write("	margin-bottom: 30px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".botto-text {\n");
      out.write("	color: #ffffff;\n");
      out.write("	font-size: 14px;\n");
      out.write("	margin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".login-form .btn.btn-primary.reset {\n");
      out.write("	background: #ff9900 none repeat scroll 0 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".back {\n");
      out.write("	text-align: left;\n");
      out.write("	margin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".back a {\n");
      out.write("	color: #444444;\n");
      out.write("	font-size: 13px;\n");
      out.write("	text-decoration: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myButton:hover {\n");
      out.write("	background-color: blue;\n");
      out.write("	color: white;\n");
      out.write("	width: 250px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#myButton {\n");
      out.write("	color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#backbutton:hover {\n");
      out.write("	background-color: blue;\n");
      out.write("	color: white;\n");
      out.write("	width: 250px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".backbutton {\n");
      out.write("	color: black;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write('\r');
      out.write('\n');
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n");
      out.write("	crossorigin=\"anonymous\">");
      out.write("\r\n");
      out.write("<!------ Include the above in your HEAD tag ---------->\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"LoginForm\">\r\n");
      out.write("	<div class=\"container p-5\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"login-form\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"main-div\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"panel\">\r\n");
      out.write("					<h2>Employee Login</h2>\r\n");
      out.write("					<p>Please enter your email and password</p>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<form id=\"Login\">\r\n");
      out.write("\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("						<div class=\"input-group\">\r\n");
      out.write("							<input type=\"email\" class=\"form-control\" id=\"inputEmail\"\r\n");
      out.write("								placeholder=\"Email Address\">\r\n");
      out.write("							<div class=\"input-group-append\">\r\n");
      out.write("								<span class=\"input-group-text\"><i\r\n");
      out.write("									class=\"fa-solid fa-user\"></i></span>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<div class=\"form-group\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<div class=\"input-group\">\r\n");
      out.write("\r\n");
      out.write("							<input type=\"password\" class=\"form-control\" id=\"inputPassword\"\r\n");
      out.write("								placeholder=\"Password\">\r\n");
      out.write("\r\n");
      out.write("							<div class=\"input-group-append\">\r\n");
      out.write("								<span class=\"input-group-text\"><i\r\n");
      out.write("									class=\"fa-solid fa-lock\"></i></span>\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					<br> <br>\r\n");
      out.write("\r\n");
      out.write("					<button type=\"submit\" class=\"btn btn-outline-light  btn-lg\"\r\n");
      out.write("						id=\"myButton\">\r\n");
      out.write("						Submit <i class=\"fa-solid fa-arrow-right myButton\"></i>\r\n");
      out.write("					</button>\r\n");
      out.write("					<br> <br> <a href=\"Index.jsp\"><i\r\n");
      out.write("						class=\"fa-solid fa-arrow-left\"></i> Back to Admin Login </a>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
