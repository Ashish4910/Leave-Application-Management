/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.80
 * Generated at: 2023-12-05 11:31:20 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.Admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import java.sql.*;

public final class Admin_005fdashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("java.util");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<title>Admin Dashboard</title>\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://kit.fontawesome.com/f327e1d3d1.js\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".full-height-sidebar {\r\n");
      out.write("	height: 100vh;\r\n");
      out.write("	background-color: #111;\r\n");
      out.write("	color: white;\r\n");
      out.write("\r\n");
      out.write("	/* Set a high z-index to ensure it appears above other content */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom-width {\r\n");
      out.write("	width: 280px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".right-content {\r\n");
      out.write("	overflow-y: auto;\r\n");
      out.write("	height: calc(100vh - 72px); /* Adjust the height as needed */\r\n");
      out.write("	padding: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-toggle, .btn-toggle-nav a {\r\n");
      out.write("	color: #fff; /* White color */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-toggle:focus, .btn-toggle-nav a:focus {\r\n");
      out.write("	outline: none; /* Remove focus outline */\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("		<div\r\n");
      out.write("			class=\"d-flex flex-column  text-bg-dark  col-lg-2 full-height-sidebar custom-width  \">\r\n");
      out.write("			<a href=\"/\"\r\n");
      out.write("				class=\"d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none\">\r\n");
      out.write("				<svg class=\"bi pe-none me-2\" width=\"40\" height=\"32\">\r\n");
      out.write("				<use xlink:href=\"#bootstrap\"></use></svg> <span class=\"fs-4\">Employeee\r\n");
      out.write("					Department </span>\r\n");
      out.write("			</a>\r\n");
      out.write("			<hr>\r\n");
      out.write("			<ul class=\"nav nav-pills flex-column mb-auto container-fluid\">\r\n");
      out.write("				<li class=\"nav-item\"><a href=\"#\" class=\"nav-link active\"\r\n");
      out.write("					aria-current=\"page\"> <svg class=\"bi pe-none me-2\" width=\"16\"\r\n");
      out.write("							height=\"16\">\r\n");
      out.write("						<use xlink:href=\"#home\"></use></svg> Dashboard\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li><a href=\"Employee_Section.jsp\" class=\"nav-link text-white\">\r\n");
      out.write("						<svg class=\"bi pe-none me-2\" width=\"16\" height=\"16\">\r\n");
      out.write("						<use xlink:href=\"#speedometer2\"></use></svg> Employee Section\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li><a href=\"Departments.jsp\" class=\"nav-link text-white\">\r\n");
      out.write("						<svg class=\"bi pe-none me-2\" width=\"16\" height=\"16\">\r\n");
      out.write("						<use xlink:href=\"#table\"></use></svg> Department Section\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<li><a href=\"#\" class=\"nav-link text-white\"> <svg\r\n");
      out.write("							class=\"bi pe-none me-2\" width=\"16\" height=\"16\">\r\n");
      out.write("						<use xlink:href=\"#grid\"></use></svg> Leave Types\r\n");
      out.write("				</a></li>\r\n");
      out.write("				<!-- 	<li><a href=\"#\" class=\"nav-link text-white\"> <svg\r\n");
      out.write("							class=\"bi pe-none me-2\" width=\"16\" height=\"16\">\r\n");
      out.write("						<use xlink:href=\"#people-circle\"></use></svg> Manage Leaves\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<!-- manage leave Drop-down end -->\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a href=\"Manage_Admin.jsp\"\r\n");
      out.write("					class=\"nav-link text-white\"> <svg class=\"bi pe-none me-2\"\r\n");
      out.write("							width=\"16\" height=\"16\">\r\n");
      out.write("                        <use xlink:href=\"#people-circle\"></use>\r\n");
      out.write("                    </svg> Manage Admin\r\n");
      out.write("				</a></li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\">\r\n");
      out.write("					<button class=\"btn btn-toggle rounded border-0 collapsed\"\r\n");
      out.write("						data-bs-toggle=\"collapse\" data-bs-target=\"#manageLeaveCollapse\"\r\n");
      out.write("						aria-expanded=\"false\" style=\"margin-left: 30px;\">Manage\r\n");
      out.write("						Leave</button>\r\n");
      out.write("					<div class=\"collapse \" id=\"manageLeaveCollapse\">\r\n");
      out.write("						<div class=\"row text-center\">\r\n");
      out.write("							<ul class=\"nav nav-pills flex-column mb-auto container-fluid\">\r\n");
      out.write("								<li><a href=\"Approved.jsp\"\r\n");
      out.write("									class=\"link-body-emphasis d-inline-flex text-decoration-none rounded text-white\"\r\n");
      out.write("									style=\"margin-left: 17px;\">Approved</a> <i\r\n");
      out.write("									class=\"fa-solid fa-check\" style=\"\"></i></li>\r\n");
      out.write("								<li><a href=\"Decline.jsp\"\r\n");
      out.write("									class=\"link-body-emphasis d-inline-flex text-decoration-none rounded text-white\">Decline\r\n");
      out.write("								</a> <i class=\"fa-solid fa-circle-xmark\" style=\"\"></i></li>\r\n");
      out.write("								<li><a href=\"Pending.jsp\"\r\n");
      out.write("									class=\"link-body-emphasis d-inline-flex text-decoration-none rounded text-white\">\r\n");
      out.write("										Pending </a><i class=\"fa-solid fa-arrow-rotate-right\" style=\"\"></i></li>\r\n");
      out.write("								<li><a href=\"Leave_Histroy.jsp\" class=\"link-body-emphasis d-inline-flex text-decoration-none rounded text-white\"\r\n");
      out.write("									style=\"margin-left: 55px;\">View Leave History</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\r\n");
      out.write("		<div class=\"container col-lg-9 bg-light mt-4 right-content\">\r\n");
      out.write("\r\n");
      out.write("			<div class=\"card-body\">\r\n");
      out.write("				<nav class=\"navbar navbar-light bg-light\">\r\n");
      out.write("					<div class=\"container-fluid\">\r\n");
      out.write("						<a class=\"navbar-brand\" href=\"#\"><h4>Deskboard</h4></a> <a\r\n");
      out.write("							class=\"navbar-brand\" href=\"#\">Home/Admin Page</a>\r\n");
      out.write("						<!-- 	<button type=\"button\" class=\"btn btn-primary\"\r\n");
      out.write("							style=\"hight: 200px; width: 200px\">Admin</button> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						<div class=\"dropdown nav-item \">\r\n");
      out.write("							<a class=\"btn btn-success dropdown-toggle btn-lg  btn-wider \"\r\n");
      out.write("								href=\"#\" role=\"button\" data-bs-toggle=\"dropdown\"\r\n");
      out.write("								aria-expanded=\"false\">Admin</a>\r\n");
      out.write("							<ul class=\"dropdown-menu\">\r\n");
      out.write("								<li><a class=\"dropdown-item\" href=\"#\">Log-Out</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</nav>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<hr>\r\n");
      out.write("			<!-- =============================================================================================== -->\r\n");
      out.write("			");

			Connection conn1 = null;
			PreparedStatement pstmt1 = null;
			ResultSet rs1 = null;
			String sql1 = "SELECT COUNT(*) AS total FROM apply_leave";
			int totalLeaveApplications = 0;

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=root123@");
				pstmt1 = conn1.prepareStatement(sql1);
				rs1 = pstmt1.executeQuery();

				if (rs1.next()) {
					totalLeaveApplications = rs1.getInt("total");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs1 != null)
				rs1.close();
					if (pstmt1 != null)
				pstmt1.close();
					if (conn1 != null)
				conn1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
      out.write("\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<!-- Left Side Card -->\r\n");
      out.write("				<div class=\"col-lg-4\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<div class=\"row \">\r\n");
      out.write("								<div class=\"col-lg-2\">\r\n");
      out.write("									<i class=\"fa-solid fa-briefcase \"\r\n");
      out.write("										style=\"font-size: 2rem; position: left; top: 10px; right: 10px; color: blue;\"></i>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-lg-10 text-center\">\r\n");
      out.write("									<h5 class=\"card-title\" style=\"\">Available Leave Type</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row mt-5\">\r\n");
      out.write("								<div class=\"col-lg-6 text-center\">\r\n");
      out.write("									<h1>");
      out.print(totalLeaveApplications);
      out.write("</h1>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-lg-6\">\r\n");
      out.write("									<h5>Leave Type</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<!-- <a href=\"#\" class=\"card-link\">Card link</a>\r\n");
      out.write("                <a href=\"#\" class=\"card-link\">Another link</a> -->\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				");

				Connection conn2 = null;
				PreparedStatement pstmt2 = null;
				ResultSet rs2 = null;
				String sql2 = "SELECT COUNT(*) AS total FROM add_employee";
				int totalLeaveApplications2 = 0;

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=root123@");
					pstmt2 = conn2.prepareStatement(sql2);
					rs2 = pstmt2.executeQuery();

					if (rs2.next()) {
						totalLeaveApplications2 = rs2.getInt("total");
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (rs2 != null)
					rs2.close();
						if (pstmt2 != null)
					pstmt2.close();
						if (conn2 != null)
					conn2.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
      out.write("\r\n");
      out.write("				<!-- Middle Card -->\r\n");
      out.write("				<div class=\"col-lg-4\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<div class=\"row \">\r\n");
      out.write("								<div class=\"col-lg-2\">\r\n");
      out.write("									<i class=\"fa-solid fa-user-group\"\r\n");
      out.write("										style=\"font-size: 2rem; position: left; top: 10px; right: 10px; color: blue;\"></i>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-lg-10 text-center\">\r\n");
      out.write("									<h5 class=\"card-title\" style=\"\">Registered Employees</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row mt-5\">\r\n");
      out.write("								<div class=\"col-lg-6 text-center\">\r\n");
      out.write("									<h1>");
      out.print(totalLeaveApplications2);
      out.write("</h1>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-lg-6 \">\r\n");
      out.write("									<h5>Active Employees</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<!-- <a href=\"#\" class=\"card-link\">Card link</a>\r\n");
      out.write("                <a href=\"#\" class=\"card-link\">Another link</a> -->\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				");

				Connection conn3 = null;
				PreparedStatement pstmt3 = null;
				ResultSet rs3 = null;
				String sql3 = "SELECT COUNT(*) AS total FROM departments";
				int totalDepartments = 0;

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=root123@");
					pstmt3 = conn3.prepareStatement(sql3);
					rs3 = pstmt3.executeQuery();

					if (rs3.next()) {
						totalDepartments = rs3.getInt("total");
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (rs3 != null)
					rs3.close();
						if (pstmt3 != null)
					pstmt3.close();
						if (conn3 != null)
					conn3.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<!-- Right Side Card -->\r\n");
      out.write("				<div class=\"col-lg-4\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<div class=\"row \">\r\n");
      out.write("								<div class=\"col-lg-2\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("									<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"30\" height=\"30\"\r\n");
      out.write("										fill=\"currentColor\" class=\"bi bi-microsoft\"\r\n");
      out.write("										viewBox=\"0 0 16 16\" style=\"color: blue;\">\r\n");
      out.write("  <path\r\n");
      out.write("											d=\"M7.462 0H0v7.19h7.462V0zM16 0H8.538v7.19H16V0zM7.462 8.211H0V16h7.462V8.211zm8.538 0H8.538V16H16V8.211z\" />\r\n");
      out.write("</svg>\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-lg-10 text-center\">\r\n");
      out.write("									<h5 class=\"card-title\" style=\"\">Available Departments</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row mt-5\">\r\n");
      out.write("								<div class=\"col-lg-6 text-center\">\r\n");
      out.write("									<h1>");
      out.print(totalDepartments);
      out.write("</h1>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-lg-6\">\r\n");
      out.write("									<h5>Employees Department</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<!-- <a href=\"#\" class=\"card-link\">Card link</a>\r\n");
      out.write("                <a href=\"#\" class=\"card-link\">Another link</a> -->\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			");

			Connection conn4 = null;
			PreparedStatement pstmt4 = null;
			ResultSet rs4 = null;
			String sql4 = "SELECT COUNT(*) AS total FROM employee_management.apply_leave WHERE Apply_Status='Pending'";
			int totalPending = 0;

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=root123@");
				pstmt4 = conn4.prepareStatement(sql4);
				rs4 = pstmt4.executeQuery();

				if (rs4.next()) {
					totalPending = rs4.getInt("total");
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs4 != null)
				rs4.close();
					if (pstmt4 != null)
				pstmt4.close();
					if (conn4 != null)
				conn4.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<br>\r\n");
      out.write("			<div class=\"row\">\r\n");
      out.write("				<!-- Left Side Card -->\r\n");
      out.write("				<div class=\"col-lg-4\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<div class=\"row \">\r\n");
      out.write("								<div class=\"col-lg-2\">\r\n");
      out.write("									<i class=\"fa-solid fa-spinner\"\r\n");
      out.write("										style=\"font-size: 2rem; position: left; top: 10px; right: 10px; color: blue;\"></i>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-lg-10 text-center\">\r\n");
      out.write("									<h5 class=\"card-title\" style=\"\">Pending Application</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row mt-5\">\r\n");
      out.write("								<div class=\"col-lg-6 text-center\">\r\n");
      out.write("									<h1>");
      out.print(totalPending);
      out.write("</h1>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-lg-6\">\r\n");
      out.write("									<h5>Pending</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<!-- <a href=\"#\" class=\"card-link\">Card link</a>\r\n");
      out.write("                <a href=\"#\" class=\"card-link\">Another link</a> -->\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				");

				Connection conn5 = null;
				PreparedStatement pstmt5 = null;
				ResultSet rs5 = null;
				String sql5 = "SELECT COUNT(*) AS total FROM apply_leave WHERE Apply_Status='decline'";
				int totalDecline = 0;

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=root123@");
					pstmt5 = conn5.prepareStatement(sql5);
					rs5 = pstmt5.executeQuery();

					if (rs5.next()) {
						totalDecline = rs5.getInt("total");
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (rs5 != null)
					rs5.close();
						if (pstmt5 != null)
					pstmt5.close();
						if (conn5 != null)
					conn5.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<!-- Middle Card -->\r\n");
      out.write("				<div class=\"col-lg-4\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<div class=\"row \">\r\n");
      out.write("								<div class=\"col-lg-2\">\r\n");
      out.write("									<i class=\"fa-solid fa-xmark\"\r\n");
      out.write("										style=\"font-size: 2rem; position: left; top: 10px; right: 10px; color: blue;\"></i>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-lg-10 text-center\">\r\n");
      out.write("									<h5 class=\"card-title\" style=\"\">Decline Application</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row mt-5\">\r\n");
      out.write("								<div class=\"col-lg-6 text-center\">\r\n");
      out.write("									<h1>");
      out.print(totalDecline);
      out.write("</h1>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-lg-6\">\r\n");
      out.write("									<h5>Decline</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<!-- <a href=\"#\" class=\"card-link\">Card link</a>\r\n");
      out.write("                <a href=\"#\" class=\"card-link\">Another link</a> -->\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				");

				Connection conn6 = null;
				PreparedStatement pstmt6 = null;
				ResultSet rs6 = null;
				String sql6 = "SELECT COUNT(*) AS total FROM employee_management.apply_leave WHERE Apply_Status='approved'";
				int totalApproved = 0;

				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					conn6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=root123@");
					pstmt6 = conn6.prepareStatement(sql6);
					rs6 = pstmt6.executeQuery();

					if (rs6.next()) {
						totalApproved = rs6.getInt("total");
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					try {
						if (rs6 != null)
					rs6.close();
						if (pstmt6 != null)
					pstmt6.close();
						if (conn6 != null)
					conn6.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<!-- Right Side Card -->\r\n");
      out.write("				<div class=\"col-lg-4\">\r\n");
      out.write("					<div class=\"card\">\r\n");
      out.write("						<div class=\"card-body\">\r\n");
      out.write("							<div class=\"row \">\r\n");
      out.write("								<div class=\"col-lg-2\">\r\n");
      out.write("									<i class=\"fa-solid fa-square-check\"\r\n");
      out.write("										style=\"font-size: 2rem; position: left; top: 10px; right: 10px; color: blue;\"></i>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-lg-10 text-center\">\r\n");
      out.write("									<h5 class=\"card-title\" style=\"\">Approved Application</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("							<div class=\"row mt-5\">\r\n");
      out.write("								<div class=\"col-lg-6 text-center\">\r\n");
      out.write("									<h1>");
      out.print(totalApproved);
      out.write("</h1>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"col-lg-6\">\r\n");
      out.write("									<h5>Approved</h5>\r\n");
      out.write("								</div>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("							<!-- <a href=\"#\" class=\"card-link\">Card link</a>\r\n");
      out.write("                <a href=\"#\" class=\"card-link\">Another link</a> -->\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- =======================================Recent list  ===================================================-->\r\n");
      out.write("			<!-- =======================================Recent list end  ===================================================-->\r\n");
      out.write("\r\n");
      out.write("			<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("				<div class=\"card-body mt-3 mb-3\">\r\n");
      out.write("					<nav class=\"navbar navbar-light bg-light\">\r\n");
      out.write("						<div class=\"container-fluid\">\r\n");
      out.write("							<a class=\"navbar-brand\" href=\"#\">Recent List </a> <a\r\n");
      out.write("								class=\"navbar-brand\" href=\"Leave_type\"> </a>\r\n");
      out.write("							<!-- 	<button type=\"button\" class=\"btn btn-primary\"\r\n");
      out.write("							style=\"hight: 200px; width: 200px\">Admin</button> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<div class=\"dropdown nav-item \">\r\n");
      out.write("								<a class=\"navbar-brand\" href=\"#\"> List 24 hours Section</a> <a\r\n");
      out.write("									class=\"navbar-brand\" href=\"Leave_type\"> </a>\r\n");
      out.write("\r\n");
      out.write("							</div>\r\n");
      out.write("						</div>\r\n");
      out.write("					</nav>\r\n");
      out.write("				</div>\r\n");
      out.write("				<table class=\"table table-bordered\">\r\n");
      out.write("					<thead>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th scope=\"col\">SR.NO</th>\r\n");
      out.write("							<th scope=\"col\">Emplooye Id</th>\r\n");
      out.write("							<th scope=\"col\">Full Name</th>\r\n");
      out.write("							<th scope=\"col\">Leave Type</th>\r\n");
      out.write("							<th scope=\"col\">Applied on</th>\r\n");
      out.write("							<th scope=\"col\">Current Status</th>\r\n");
      out.write("							<th scope=\"col\">Details</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						</tr>\r\n");
      out.write("					<tbody>\r\n");
      out.write("						");

						Connection conn = null;
						PreparedStatement pstmt = null;
						ResultSet rs = null;

						try {
							Class.forName("com.mysql.cj.jdbc.Driver");
							conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=root123@");

							// Assuming '5' is an integer value
							/*     int employeeId = 5; */

							String sql = "SELECT " + "add_employee.employeeId, " + "add_employee.id, " + "add_employee.firstName, "
							+ "add_employee.lastName, " + "apply_leave.leave_type, " + "apply_leave.applied, "
							+ "apply_leave.leaveCode, " + "apply_leave.Apply_Status " + "FROM " + "add_employee " + "JOIN "
							+ "apply_leave ON add_employee.id = apply_leave.id";

							pstmt = conn.prepareStatement(sql);
							/*       pstmt.setInt(1, employeeId); */

							rs = pstmt.executeQuery();
							int row = 1;
							while (rs.next()) {
						
      out.write("\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>");
      out.print(row++);
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(rs.getString("employeeId"));
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(rs.getString("firstName"));
      out.write(' ');
      out.print(rs.getString("lastName"));
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(rs.getString("leave_type"));
      out.write("</td>\r\n");
      out.write("							<td>");
      out.print(rs.getString("applied"));
      out.write("</td>\r\n");
      out.write("							<td>\r\n");
      out.write("								");
      out.write(' ');

 String applyStatus = rs.getString("Apply_Status");
 String iconClass = "fa-spinner"; // default icon
 String statusClass = "text-primary"; // default status color

 if ("approved".equalsIgnoreCase(applyStatus)) {
 	iconClass = "fa-check"; // icon for approved status
 	statusClass = "text-success"; // color for approved status
 } else if ("decline".equalsIgnoreCase(applyStatus)) {
 	iconClass = "fa-times"; // icon for declined status
 	statusClass = "text-danger"; // color for declined status
 }
 // You can add more conditions for other status types
 
      out.write(" <span class=\"");
      out.print(statusClass);
      out.write('"');
      out.write('>');
      out.print(applyStatus);
      out.write("</span> <i\r\n");
      out.write("								class=\"fa-solid ");
      out.print(iconClass);
      out.write("\"\r\n");
      out.write("								style=\"font-size: 1rem; position: left; top: 5px; right: 10px; color: blue;\"></i>\r\n");
      out.write("							</td>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("							<td><a\r\n");
      out.write("								href=\"Employee_leave_detail.jsp?leaveCode=");
      out.print(rs.getString("leaveCode"));
      out.write("&id=");
      out.print(rs.getString("id"));
      out.write("\"\r\n");
      out.write("								class=\"btn btn-secondary\">Details</a></td>\r\n");
      out.write("\r\n");
      out.write("							");

							}
							} catch (Exception e) {
							e.printStackTrace();
							} finally {
							try {
							if (rs != null)
								rs.close();
							if (pstmt != null)
								pstmt.close();
							if (conn != null)
								conn.close();
							} catch (SQLException e) {
							e.printStackTrace();
							}
							}
							
      out.write("\r\n");
      out.write("						\r\n");
      out.write("					</tbody>\r\n");
      out.write("				</table>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
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
