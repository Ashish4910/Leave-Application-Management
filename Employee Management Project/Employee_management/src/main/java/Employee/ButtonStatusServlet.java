package Employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ButtonStatusServlet")
public class ButtonStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// Variable to store the last disabled timestamp
	private static long lastDisabledTime = 0;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();

		// Check if the button was disabled less than 8 hours ago
		long currentTime = System.currentTimeMillis();
		long remainingTime = 8 * 60 * 60 * 1000 - (currentTime - lastDisabledTime);

		if (remainingTime > 0) {
			// Button is still disabled, return the status and timestamp
			out.println("{\"status\":\"disabled\",\"timestamp\":\"" + formatTimestamp(lastDisabledTime) + "\"}");
		} else {
			// Button should be enabled, return the status and set the new timestamp
			out.println("{\"status\":\"enabled\"}");
			lastDisabledTime = currentTime;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Dummy method for updating the button status in the database
		// You should replace this with your actual database update logic

		int employeeId = Integer.parseInt(request.getParameter("employeeId"));

		// For demonstration purposes, update the last disabled time and set
		// Result_status in the database
		updateButtonStatusInDatabase(employeeId);

		response.getWriter().write("Button status updated successfully");
	}

	private void updateButtonStatusInDatabase(int employeeId) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_management", "root",
					"archit4910@");

			// Get the Result_status from the employee_attendance table
			String selectQuery = "SELECT Result_status FROM employee_attendance WHERE Employee_Id = ? ORDER BY id DESC LIMIT 1";
			PreparedStatement selectStatement = conn.prepareStatement(selectQuery);
			selectStatement.setInt(1, employeeId);

			ResultSet resultSet = selectStatement.executeQuery();
			String resultStatus = "";

			if (resultSet.next()) {
				resultStatus = resultSet.getString("Result_status");
			}

			// Update the last disabled time based on the Result_status
			if ("some_condition_for_disable".equals(resultStatus)) {
				lastDisabledTime = System.currentTimeMillis();
			}

			// Update the Result_status in the database (you need to replace this with your
			// actual update logic)
			String updateQuery = "UPDATE employee_attendance SET Result_status = ? WHERE Employee_Id = ?";
			PreparedStatement updateStatement = conn.prepareStatement(updateQuery);
			updateStatement.setString(1, "some_updated_value");
			updateStatement.setInt(2, employeeId);

			updateStatement.executeUpdate();

			conn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	private String formatTimestamp(long timestamp) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(new Date(timestamp));
	}
}
