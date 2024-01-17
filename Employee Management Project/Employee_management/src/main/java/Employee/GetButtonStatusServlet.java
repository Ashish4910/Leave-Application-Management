package Employee;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

@WebServlet("/getButtonStatus")
public class GetButtonStatusServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Retrieve button status and timestamp from the database
		Map<String, Object> statusInfo = getButtonStatusFromDatabase(request);

		// Prepare the response JSON
		JSONObject jsonResponse = new JSONObject(statusInfo);

		// Send the JSON response
		response.setContentType("application/json");
		response.getWriter().write(jsonResponse.toString());
	}

	private Map<String, Object> getButtonStatusFromDatabase(HttpServletRequest request) {
		// Replace with your actual database connection details
		String jdbcURL = "jdbc:mysql://localhost:3306/employee_management";
		String dbUser = "root";
		String dbPassword = "archit4910@";

		// SQL query to get the button status and timestamp
		String selectQuery = "SELECT Result_status, CURRENT_TIMESTAMP FROM employee_attendance WHERE Employee_Id = ?";

		Map<String, Object> statusInfo = new HashMap<>();

		try (Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
				PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
			String employeeIdParam = request.getParameter("employeeId");

			if (employeeIdParam != null && !employeeIdParam.isEmpty()) {
				try {
					int employeeId = Integer.parseInt(employeeIdParam);
					preparedStatement.setInt(1, employeeId);

					try (ResultSet resultSet = preparedStatement.executeQuery()) {
						if (resultSet.next()) {
							statusInfo.put("status", resultSet.getString("Result_status"));
							statusInfo.put("timestamp", resultSet.getTimestamp("CURRENT_TIMESTAMP"));
						}
					}
				} catch (NumberFormatException e) {
					e.printStackTrace();
					// Handle the parsing exception as needed
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// Handle the database exception as needed
		}

		return statusInfo;
	}
}
