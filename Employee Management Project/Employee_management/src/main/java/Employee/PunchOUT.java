package Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/punchOUT")
public class PunchOUT extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String employeeId = request.getParameter("employeeId");
		String status = "Enabled";
		// there is no need for attendace code in the following code its only for
		// testing purpose
		// String attendanceCode = request.getParameter("Attendance_Code");

		PrintWriter out = response.getWriter();
		// out.print("Attendance Code " + attendanceCode);
		// out.print("Employee Code " + employeeId);
		System.out.println("Employee Code " + employeeId);

		Date currentDate = new Date();

		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");

		// ... (existing code)

		// ... (existing code)

		if (employeeId != null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection conn = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/employee_management?user=root&password=archit4910@");

				// Validate if Punch IN has been done for the given employee
				PreparedStatement validatePunchIN = conn.prepareStatement(
						"SELECT * FROM employee_attendance WHERE Employee_Id = ? AND PunchOut_Time IS NULL");
				validatePunchIN.setString(1, employeeId);

				ResultSet resultSet = validatePunchIN.executeQuery();

				if (!resultSet.next()) {
					// No Punch IN record found for the employee
					response.sendRedirect("User_login.jsp");
					return; // Exit the servlet
				}

				// Continue with the Punch OUT logic
				// Get the primary key (or another unique identifier) of the row to be updated
				PreparedStatement getPrimaryKey = conn.prepareStatement(
						"SELECT id FROM employee_attendance WHERE PunchOut_Time IS NULL AND Employee_Id = ? ORDER BY id DESC LIMIT 1");
				getPrimaryKey.setString(1, employeeId);

				ResultSet primaryKeyResult = getPrimaryKey.executeQuery();

				if (primaryKeyResult.next()) {
					int primaryKey = primaryKeyResult.getInt("id");

					// Update the punchOut_Time for the specific record using the retrieved primary
					// key
					PreparedStatement psmt = conn.prepareStatement(
							"UPDATE employee_attendance SET PunchOut_Time=?, Result_status=? WHERE id = ?");

					// Format Date and Time
					String formattedTime = timeFormat.format(currentDate);

					// Set values for the prepared statement
					psmt.setString(1, formattedTime);
					psmt.setString(2, status);
					psmt.setInt(3, primaryKey);

					// Execute the SQL statement
					int row = psmt.executeUpdate();

					if (row >= 1) {
						System.out.println("Successfully updated the value punch out");
						response.sendRedirect("Employee/Employee_Attendance.jsp?id=" + employeeId);
					} else {
						response.sendRedirect("User_login.jsp");
					}

					// Close resources
					primaryKeyResult.close();
					getPrimaryKey.close();
					resultSet.close();
					validatePunchIN.close();
					psmt.close();
					conn.close();
				} else {
					// Handle the case where the primary key could not be retrieved
					response.sendRedirect("User_login.jsp");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			response.sendRedirect("User_login.jsp");
		}
	}
}
