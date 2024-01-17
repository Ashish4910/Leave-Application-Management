package Employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/updateButtonStatus")
public class UpdateButtonStatusServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Retrieve the status parameter from the request
		String status = request.getParameter("status");
		int employeeIdParam = Integer.parseInt(request.getParameter("employeeId"));

		// Update the button status in the database
		updateButtonStatusInDatabase(status, employeeIdParam);

		// Respond with a success message (you may customize the response as needed)
		response.getWriter().write("Button status updated successfully");
	}

	private void updateButtonStatusInDatabase(String status, int employeeId) {
		try {
			// Load JDBC driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Connect to the database
			String jdbcUrl = "jdbc:mysql://localhost:3306/employee_management";
			String dbUser = "root";
			String dbPassword = "archit4910@";
			Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword);

			// Update button status in the employee_attendance table
			String updateQuery = "UPDATE employee_attendance SET Result_status = ? WHERE Employee_Id = ?";
			try (PreparedStatement preparedStatement = connection.prepareStatement(updateQuery)) {
				// Set parameters
				preparedStatement.setString(1, status);
				preparedStatement.setInt(2, employeeId);

				// Execute the update
				preparedStatement.executeUpdate();
			}

			// Close the database connection
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			// Handle exceptions appropriately based on your application requirements
		}
	}
}
