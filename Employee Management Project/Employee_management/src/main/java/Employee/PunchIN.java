package Employee;

import java.io.IOException;
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
import javax.servlet.http.HttpSession;

@WebServlet("/punchIN")
public class PunchIN extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Method to check if the employee has already punched out
	private boolean hasEmployeePunchedOut(int employeeId) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=archit4910@");

			PreparedStatement psmt = conn.prepareStatement(
					"SELECT punchOUT_Time FROM employee_attendance WHERE Employee_Id = ? AND punchOUT_Time IS  NULL");
			psmt.setInt(1, employeeId);

			ResultSet rs = psmt.executeQuery();

			boolean hasPunchedOut = rs.next(); // If rs.next() is true, it means there is a non-null punchOUT_Time for
												// the given employeeId

			// Close resources
			rs.close();
			psmt.close();
			conn.close();

			return hasPunchedOut;

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Retrieve data from the form
		int employeeId = Integer.parseInt(request.getParameter("employeeId"));
		String punchType = request.getParameter("punchType");
		String attendance_Code = request.getParameter("uniqueCode");
		String status = "Disabled";

		// Check if the employee has already punched out
		if (hasEmployeePunchedOut(employeeId)) {
			// Employee has already punched out, handle accordingly (e.g., show an error
			// message)
			response.sendRedirect("Employee/Employee_Attendance.jsp?id=" + employeeId);
			return;
		}

		Date currentDate = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");

		// Rest of your existing code...

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=archit4910@");

			PreparedStatement psmt = conn.prepareStatement(
					"INSERT INTO employee_attendance (punchIN_Date, punchIN_Time, punchIN_Day, Attendance_Code, Employee_Id, Result_status) VALUES (?,?,?,?,?,?)");

			// Format Date and Time
			String formattedDate = dateFormat.format(currentDate);
			String formattedTime = timeFormat.format(currentDate);
			String formattedDay = dayFormat.format(currentDate);

			// Set values for the prepared statement
			psmt.setString(1, formattedDate);
			psmt.setString(2, formattedTime);
			psmt.setString(3, formattedDay);
			psmt.setString(4, attendance_Code);
			psmt.setInt(5, employeeId);
			psmt.setString(6, status);

			// Execute the SQL statement
			int row = psmt.executeUpdate();

			HttpSession session = request.getSession();

			if (row >= 1) {
				session.setAttribute("Attendance_Code", attendance_Code);
				System.out.println("Successfully updated the value");
				response.sendRedirect("Employee/Employee_Attendance.jsp?id=" + employeeId);
			} else {
				response.sendRedirect("User_login.jsp");
			}

			// Close resources
			psmt.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
