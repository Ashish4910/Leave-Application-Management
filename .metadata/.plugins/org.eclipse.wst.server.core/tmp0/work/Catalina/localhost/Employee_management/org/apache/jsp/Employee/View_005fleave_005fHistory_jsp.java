/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-12-04 12:34:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Employee;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.servlet.http.HttpSession;

public final class View_005fleave_005fHistory_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.servlet.http.HttpSession");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>View Leave History</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".full-height-sidebar {\r\n");
      out.write("	height: 100vh;\r\n");
      out.write("	background-color: #111;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom-width {\r\n");
      out.write("	width: 280px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-wider {\r\n");
      out.write("	min-width: 150px; /* Adjust the width as needed */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".right-content {\r\n");
      out.write("	overflow-y: auto;\r\n");
      out.write("	height: calc(100vh - 72px); /* Adjust the height as needed */\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("		<div\r\n");
      out.write("			class=\"d-flex flex-column  text-bg-dark  col-lg-2 full-height-sidebar custom-width \">\r\n");
      out.write("			<a href=\"/\"\r\n");
      out.write("				class=\"d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none\">\r\n");
      out.write("				<svg class=\"bi pe-none me-2\" width=\"40\" height=\"32\">\r\n");
      out.write("				<use xlink:href=\"#bootstrap\"></use></svg> <span class=\"fs-4\">Employee\r\n");
      out.write("					Department </span>\r\n");
      out.write("			</a>\r\n");
      out.write("			<hr>\r\n");
      out.write("			<ul class=\"nav nav-pills flex-column mb-auto container-fluid\">\r\n");
      out.write("				<li class=\"nav-item\"><a href=\"Employee_dashboard.jsp\"\r\n");
      out.write("					class=\"nav-link active\" aria-current=\"page\"> <svg\r\n");
      out.write("							class=\"bi pe-none me-2\" width=\"16\" height=\"16\">\r\n");
      out.write("						<use xlink:href=\"#home\"></use></svg> Apply Leave\r\n");
      out.write("				</a></li>\r\n");
      out.write("\r\n");
      out.write("				");

				int employeeId = Integer.parseInt(request.getParameter("id"));
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li><a href=\"View_leave_History.jsp?id=");
      out.print(employeeId);
      out.write("\"\r\n");
      out.write("					class=\"nav-link text-white\"> <svg class=\"bi pe-none me-2\"\r\n");
      out.write("							width=\"16\" height=\"16\">\r\n");
      out.write("						<use xlink:href=\"#speedometer2\"></use></svg> View My Leave History\r\n");
      out.write("				</a></li>\r\n");
      out.write("\r\n");
      out.write("			</ul>\r\n");
      out.write("			<hr>\r\n");
      out.write("			<div class=\"dropdown\">\r\n");
      out.write("				<a href=\"#\"\r\n");
      out.write("					class=\"d-flex align-items-center text-white text-decoration-none dropdown-toggle\"\r\n");
      out.write("					data-bs-toggle=\"dropdown\" aria-expanded=\"false\"> <img\r\n");
      out.write("					src=\"https://github.com/mdo.png\" alt=\"\" width=\"32\" height=\"32\"\r\n");
      out.write("					class=\"rounded-circle me-2\"> <strong>mdo</strong>\r\n");
      out.write("				</a>\r\n");
      out.write("				<ul class=\"dropdown-menu dropdown-menu-dark text-small shadow\">\r\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"#\">New project...</a></li>\r\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"#\">Settings</a></li>\r\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"#\">Profile</a></li>\r\n");
      out.write("					<li><hr class=\"dropdown-divider\"></li>\r\n");
      out.write("					<li><a class=\"dropdown-item\" href=\"#\">Sign out</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"container col-lg-9 bg-light mt-4 right-content\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<nav class=\"navbar navbar-light bg-light\">\r\n");
      out.write("					<div class=\"container-fluid\">\r\n");
      out.write("						<a class=\"navbar-brand\" href=\"#\"><h4>Employee Section</h4></a> <a\r\n");
      out.write("							class=\"navbar-brand\" href=\"#\">View Leave History</a>\r\n");
      out.write("						<!-- 	<button type=\"button\" class=\"btn btn-primary\"\r\n");
      out.write("							style=\"hight: 200px; width: 200px\">Admin</button> -->\r\n");
      out.write("\r\n");
      out.write(" ");

                        HttpSession session1 = request.getSession(false); // Use getSession(false) to prevent creating a new session
                        String userEmail = (String) session.getAttribute("email");
                        String userName = (String) session.getAttribute("firstName");
                    
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<div class=\"dropdown nav-item \">\r\n");
      out.write("							<a class=\"btn btn-success dropdown-toggle btn-lg  btn-wider \"\r\n");
      out.write("								href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("								aria-expanded=\"false\">	  Welcome, ");
      out.print( userEmail );
      out.write("!</a>\r\n");
      out.write("							<ul class=\"dropdown-menu\">\r\n");
      out.write("							  Welcome, ");
      out.print( userEmail );
      out.write("!\r\n");
      out.write("							  ");
      out.print( userName );
      out.write("\r\n");
      out.write("								<li><a class=\"dropdown-item\" href=\"#\">Log-Out</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</nav>\r\n");
      out.write("			</div>\r\n");
      out.write("			<hr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<table class=\"table\">\r\n");
      out.write("				<thead>\r\n");
      out.write("					<tr>\r\n");
      out.write("						<th scope=\"col\">SR.NO</th>\r\n");
      out.write("						<th scope=\"col\">Employee ID</th>\r\n");
      out.write("						<th scope=\"col\">Type</th>\r\n");
      out.write("						<th scope=\"col\">Conditions</th>\r\n");
      out.write("						<th scope=\"col\">From</th>\r\n");
      out.write("						<th scope=\"col\">To</th>\r\n");
      out.write("						<th scope=\"col\">Applied</th>\r\n");
      out.write("						<th scope=\"col\">Admin Remarks</th>\r\n");
      out.write("					</tr>\r\n");
      out.write("				</thead>\r\n");
      out.write("				<tbody>\r\n");
      out.write("					");

					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=root123@");
						PreparedStatement psmt = conn.prepareStatement("SELECT * FROM apply_leave WHERE id=?");
						psmt.setInt(1, employeeId);

						ResultSet rs = psmt.executeQuery();
						int rowNumber = 1;
						while (rs.next()) {

							int id = rs.getInt("id");

							String leave_type = rs.getString("leave_type");
							String startDate = rs.getString("start_date");
							String endDate = rs.getString("end_date");
							String long_text = rs.getString("long_text");
							String applied = rs.getString("applied");
							String status = rs.getString("Apply_Status");
					
      out.write("\r\n");
      out.write("					<tr>\r\n");
      out.write("						<td>");
      out.print(rowNumber++);
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(id);
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(leave_type);
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(long_text);
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(startDate);
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(endDate);
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(applied);
      out.write("</td>\r\n");
      out.write("						<td>");
      out.print(status);
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</tr>\r\n");
      out.write("					");

					}
					} catch (Exception e) {
					e.printStackTrace();
					}
					
      out.write("\r\n");
      out.write("				</tbody>\r\n");
      out.write("			</table>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<!-- 	========================second div end ========================= -->\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("		integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\"\r\n");
      out.write("		crossorigin=\"anonymous\"></script>\r\n");
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
