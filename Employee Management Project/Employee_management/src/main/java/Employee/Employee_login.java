package Employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Employee_login")
public class Employee_login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=archit4910@");

			PreparedStatement psmt = conn.prepareStatement("select * from add_employee where email=? and password=?");
			psmt.setString(1, email);
			psmt.setString(2, password);

			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				int id = rs.getInt("id");
				System.out.println("Id for employee " + id);

				// Set the user's email and employeeId in the session attributes
				HttpSession session = request.getSession(true);
				session.setAttribute("email", email);
				session.setAttribute("employeeId", id);

//				// Retrieve the latest check-in status for the employee
//				PreparedStatement checkInStatusStatement = conn.prepareStatement(
//						"SELECT Attendance_Code FROM employee_attendance WHERE Employee_Id = ? ORDER BY punchIN_Date DESC, punchIN_Time DESC LIMIT 1");
//				checkInStatusStatement.setInt(1, id);
//
//				System.out.println(
//						"====================== employee login servlet is hit and server try to get the attendance code to the page =========================");
//				ResultSet resultSet = checkInStatusStatement.executeQuery();
//
//				// Update the session attribute with the retrieved check-in status
//				if (resultSet.next()) {
//					String latestAttendanceCode = resultSet.getString("Attendance_Code");
//
//					session.setAttribute("Attendance_Code", latestAttendanceCode);
//					System.out.println(" Attendance code in the employee Login servlet " + latestAttendanceCode);
//
//					String punchIN = resultSet.getString("punchIN_Time");
//					System.out.println("punch IN  in the employee Login servlet " + punchIN);
//
//				}
//
//				else {
//					// If no check-in status found, set the session attribute to null
//					session.setAttribute("Attendance_Code", null);
//					System.out.println("====== Attendance code in employee Login is NULL===========");
//				}
//				System.out.println(
//						"====================== employee login servlet is hit and server try to get the attendance code to the page =========================");

				// Redirect the user to the employee dashboard
				response.sendRedirect("Employee/Employee_dashboard.jsp");

			} else {

				response.sendRedirect("Employee/Employee.jsp?error=true");

				// response.sendRedirect("Employee/Employee.jsp");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
