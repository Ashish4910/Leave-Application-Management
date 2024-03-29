<%@ page import="java.sql.*"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Admin Dashboard</title>
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
}
</style>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
	integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
	crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>

	<div class="row">
		<div
			class="d-flex flex-column  text-bg-dark  col-lg-2 full-height-sidebar custom-width ">
			<a href="/"
				class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
				<svg class="bi pe-none me-2" width="40" height="32">
				<use xlink:href="#bootstrap"></use></svg> <span class="fs-4">Employee
					Department </span>
			</a>
			<hr>
			<ul class="nav nav-pills flex-column mb-auto container-fluid">
				<li class="nav-item"><a href="Admin_dashboard.jsp"
					class="nav-link active" aria-current="page"> <svg
							class="bi pe-none me-2" width="16" height="16">
						<use xlink:href="#home"></use></svg> Dashboard
				</a></li>
				<li><a href="Employee_Section.jsp" class="nav-link text-white">
						<svg class="bi pe-none me-2" width="16" height="16">
						<use xlink:href="#speedometer2"></use></svg> Employee Section
				</a></li>
				<li><a href="Departments.jsp" class="nav-link text-white">
						<svg class="bi pe-none me-2" width="16" height="16">
						<use xlink:href="#table"></use></svg> Department Section
				</a></li>
				<li><a href="Leave_type.jsp" class="nav-link text-white"> <svg
							class="bi pe-none me-2" width="16" height="16">
						<use xlink:href="#grid"></use></svg> Leave Types
				</a></li>
				<li><a href="#" class="nav-link text-white"> <svg
							class="bi pe-none me-2" width="16" height="16">
						<use xlink:href="#people-circle"></use></svg> Manage Leaves
				</a></li>

				<li><a href="MManage_Admin.jsp" class="nav-link text-white">
						<svg class="bi pe-none me-2" width="16" height="16">
						<use xlink:href="#people-circle"></use></svg> Manage Admin
				</a></li>
			</ul>
			<hr>
			<div class="dropdown">
				<a href="#"
					class="d-flex align-items-center text-white text-decoration-none dropdown-toggle"
					data-bs-toggle="dropdown" aria-expanded="false"> <img
					src="https://github.com/mdo.png" alt="" width="32" height="32"
					class="rounded-circle me-2"> <strong>mdo</strong>
				</a>
				<ul class="dropdown-menu dropdown-menu-dark text-small shadow">
					<li><a class="dropdown-item" href="#">New project...</a></li>
					<li><a class="dropdown-item" href="#">Settings</a></li>
					<li><a class="dropdown-item" href="#">Profile</a></li>
					<li><hr class="dropdown-divider"></li>
					<li><a class="dropdown-item" href="#">Sign out</a></li>
				</ul>
			</div>
		</div>


		<!-- ==================================== Second Div Start ===================== -->
		<div class="container col-lg-9 bg-light mt-4 right-content">

			<div class="card-body">
				<nav class="navbar navbar-light bg-light">
					<div class="container-fluid">
						<a class="navbar-brand" href="#"><h4>Employee Section</h4></a> <a
							class="navbar-brand" href="#">Home/Employee Management</a>
						<!-- 	<button type="button" class="btn btn-primary"
							style="hight: 200px; width: 200px">Admin</button> -->



						<div class="dropdown nav-item ">
							<a class="btn btn-success dropdown-toggle btn-lg  btn-wider "
								href="#" role="button" data-bs-toggle="dropdown"
								aria-expanded="false">Admin</a>
							<ul class="dropdown-menu">
								<li><a class="dropdown-item" href="#">Log-Out</a></li>
							</ul>
						</div>
					</div>
				</nav>
			</div>

			<hr>

			<div class="text-center mt-3 mb-3">
				<a href="Add_Employee.jsp" class="btn btn-primary text-center">Add
					Employee</a>
			</div>


			<table class="table">
				<thead>
					<tr>
						<th scope="col">#</th>
						<th scope="col">Employee ID</th>
						<th scope="col">FirstName</th>
						<th scope="col">LastName</th>
						<th scope="col">Email</th>
						<th scope="col">Password</th>
						<th scope="col">DOB</th>
						<th scope="col">Gender</th>
						<th scope="col">Department</th>
						<th scope="col">Address</th>
						<th scope="col">Contact</th>
						<th scope="col">City</th>
						<th scope="col">Country</th>
						<th scope="col">Status</th>

					</tr>
				</thead>
				<tbody>


					<%
					try {
						Class.forName("com.mysql.cj.jdbc.Driver");
						Connection conn = DriverManager
						.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=root123@");
						PreparedStatement psmt = conn.prepareStatement("Select * from add_employee");

						ResultSet rs = psmt.executeQuery();

						while (rs.next()) {
					%>

					<tr>
						<td scope="row"><%=rs.getString("id")%></td>
						<td scope="row"><%=rs.getString("EmployeeId")%></td>
						<td scope="row"><%=rs.getString("firstName")%></td>
						<td scope="row"><%=rs.getString("lastName")%></td>
						<td scope="row"><%=rs.getString("email")%></td>
						<td scope="row"><%=rs.getString("password")%></td>
						<td scope="row"><%=rs.getString("dob")%></td>
						<td scope="row"><%=rs.getString("gender")%></td>
						<td scope="row"><%=rs.getString("department")%></td>
						<td scope="row"><%=rs.getString("address")%></td>
						<td scope="row"><%=rs.getString("contact")%></td>
						<td scope="row"><%=rs.getString("city")%></td>
						<td scope="row"><%=rs.getString("country")%></td>
						<td>
							<td>
								<form action="../AddEmployeeDaoDelete" method="post">
									<!-- Hidden input to store the id value -->
									<input type="hidden" name="id" value="<%=rs.getString("id")%>">
									<!-- Submit button with the trash icon -->
									<button type="submit" class="btn btn-link">
										<i class="fa-solid fa-trash"></i>
									</button>
									<a href="Edit_LeaveType.jsp?id=<%=rs.getString("id")%>"
										class=""> <i class="fa-solid fa-pen-to-square"></i>
									</a>
								</form>
							</td>

					</tr>

					<%
					}

					} catch (Exception e) {
					e.printStackTrace();
					}
					%>



				</tbody>
			</table>

		</div>




		<!-- 	========================second div end ========================= -->
	</div>








	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
		crossorigin="anonymous"></script>
</body>
</html>