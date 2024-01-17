<%@ page import="java.sql.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page isELIgnored="False"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Employee Leave Details</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
	crossorigin="anonymous">

<style type="text/css">
.full-height-sidebar {
	height: 100vh;
	background-color: #111;
	color: white;
}

.custom-width {
	width: 280px;
}

.btn-wider {
	min-width: 150px; /* Adjust the width as needed */
}

.right-content {
	overflow-y: auto;
	height: calc(100vh - 72px); /* Adjust the height as needed */
	padding: 20px;
}

.btn-toggle, .btn-toggle-nav a {
	color: #fff; /* White color */
}

.btn-toggle:focus, .btn-toggle-nav a:focus {
	outline: none; /* Remove focus outline */
}
}
</style>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
	integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<c:if test="${empty adminObj }">

		<c:redirect url="../Index.jsp">
		</c:redirect>
	</c:if>

	<div class="row">
		<jsp:include page="/Admin/include.jsp" />

		<!-- ==================================== Second Div Start ===================== -->

		<div class="container col-lg-9 bg-light mt-4 right-content ashish">

			<div class="card-body">
				<nav class="navbar navbar-light bg-light">
					<div class="container-fluid">

						<a class="navbar-brand" href="#"><h4>Leave Details</h4></a> <a
							class="navbar-brand" href="#">Home / Leave Details</a>
						<!-- 	<button type="button" class="btn btn-primary"
							style="hight: 200px; width: 200px">Admin</button> -->



						<div class="dropdown nav-item ">
							<a class="btn btn-success dropdown-toggle btn-lg  btn-wider "
								href="#" role="button" data-bs-toggle="dropdown"
								aria-expanded="false">Admin</a>
							<ul class="dropdown-menu">
									<li><a class="dropdown-item" href="../adminLogout">Log-Out</a></li>
							</ul>
						</div>

					</div>
				</nav>
			</div>

			<hr>



			<%
			int id = Integer.parseInt(request.getParameter("id"));
			System.out.println("ID in employee Leave details page " + id);
			String leaveCode = request.getParameter("leaveCode");
			String sql = "SELECT add_employee.employeeId, " + "add_employee.firstName, " + "add_employee.lastName, "
					+ "add_employee.email, " + "add_employee.gender," + "add_employee.contact," + "apply_leave.start_date, "
					+ "apply_leave.end_date, " + "apply_leave.leave_type, " + "apply_leave.long_text, "
					+ "apply_leave.Apply_Status, " + "apply_leave.Admin_Remarks, " + "apply_leave.Admin_Action_ON, "
					+ "apply_leave.applied " + "FROM add_employee " + "JOIN apply_leave ON add_employee.id = apply_leave.id "
					+ "WHERE add_employee.id = ? AND apply_leave.leaveCode=?";

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager
				.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=archit4910@");
				PreparedStatement psmt = conn.prepareStatement(sql);
				psmt.setInt(1, id);
				psmt.setString(2, leaveCode);
				ResultSet rs = psmt.executeQuery();

				while (rs.next()) {
			%>




			<table class="table table-bordered">
				<thead>
					<tr>
						<th scope="col">Employee ID</th>
						<td><%=rs.getString("employeeId")%></td>
						<th scope="col">Employee Name</th>
						<td><%=rs.getString("firstName")%></td>
						<th scope="col">Gender</th>
						<td><%=rs.getString("gender")%></td>
					</tr>
					<tr>
						<th scope="col">Employee Email</th>
						<td><%=rs.getString("email")%></td>
						<th scope="col">Employee Contact</th>
						<td><%=rs.getString("contact")%></td>
						<th scope="col">Leave Type</th>
						<td><%=rs.getString("leave_type")%></td>
					</tr>


					<tr>
						<th scope="col">Leave FROM</th>
						<td><%=rs.getString("start_date")%></td>
						<th scope="col">Leave UPTO</th>
						<td><%=rs.getString("end_date")%></td>

					</tr>

					<tr>
						<th scope="col">Leave Applied</th>
						<td><%=rs.getString("applied")%></td>
						<th scope="col">Status</th>
						<%-- <td><%=rs.getString("Apply_Status")%></td> --%>

						<td>
							<%-- Check and display status with corresponding icon --%> <%
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
 %> <span class="<%=statusClass%>"><%=applyStatus%></span> <i
							class="fa-solid <%=iconClass%>"
							style="font-size: 1rem; position: left; top: 5px; right: 10px; color: blue;"></i>
						</td>


					</tr>

					<tr>
						<th scope="col">Leave Conditions</th>
						<td colspan="5" style="text-align: center;"><%=rs.getString("long_text")%></td>

					</tr>


					<tr>
						<th scope="col">Admin Remarks</th>
						<td colspan="5" style="text-align: center;"><%=rs.getString("Admin_Remarks")%></td>
					</tr>

					<tr>
						<th scope="col">Admin Action ON</th>
						<td><%=rs.getString("Admin_Action_ON")%></td>


					</tr>


				</thead>
				<tbody>
					<%
					}
					} catch (

					Exception e) {
					e.printStackTrace();
					}
					%>

				</tbody>

			</table>

			<div class="text-center mt-3 mb-3">



				<button type="button" class="btn btn-success" data-bs-toggle="modal"
					data-bs-target="#exampleModal" data-bs-whatever="@mdo">Set
					Action</button>


				<div class="modal fade" id="exampleModal" tabindex="-1"
					aria-labelledby="exampleModalLabel" aria-hidden="true">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<h1 class="modal-title fs-5" id="exampleModalLabel">Set
									Action</h1>
								<button type="button" class="btn-close" data-bs-dismiss="modal"
									aria-label="Close"></button>
							</div>


							<div class="modal-body">
								<form action="../employee_leave_details" method="post">

									<!--=======hidden value to the form ======  -->
									<input type="hidden" name="leaveCode" value="<%=leaveCode%>">
									<input type="hidden" name="id" value="<%=id%>">

									<!-- ======= hidden value is end ========  -->


									<div class="mb-3">
										<select class="form-control" name="status" required>
											<option value="" disabled selected hidden>Choose</option>
											<option value="Approved">Approved</option>
											<option value="Decline">Decline</option>
										</select>
									</div>

									<div class="mb-3">

										<textarea class="form-control" name="description"
											placeholder="Description" required></textarea>
									</div>


									<div class="modal-footer">
										<button type="button" class="btn btn-danger"
											data-bs-dismiss="modal">Close</button>
										<button type="submit" class="btn btn-primary">Apply</button>
									</div>
								</form>
							</div>
						</div>
					</div>
				</div>



			</div>


		</div>




		<!-- 	========================second div end ========================= -->
	</div>








	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>