package EmailValidate;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newPassword")
public class newPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final String DB_URL = "jdbc:mysql://localhost:3306/employee_management?user=root&password=archit4910@";
		final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confPassword = request.getParameter("confPassword");

		if (password.equals(confPassword)) {
			try {
				Class.forName(DB_DRIVER);
				Connection conn = DriverManager.getConnection(DB_URL);

				try {
					// Update the password in the table for the given email
					String updateSql = "UPDATE add_employee SET password=? WHERE email=?";
					try (PreparedStatement updateStmt = conn.prepareStatement(updateSql)) {
						updateStmt.setString(1, password);
						updateStmt.setString(2, email);

						int row = updateStmt.executeUpdate();
						if (row > 0) {
							// Password updated successfully

							// Delete forget_Password from the table
							String deleteSql = "UPDATE add_employee SET forget_Password=NULL WHERE email=?";
							try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSql)) {
								deleteStmt.setString(1, email);
								deleteStmt.executeUpdate();
							}

							response.sendRedirect("User_login.jsp");
						} else {
							// Failed to update password
							response.sendRedirect("newPassword.jsp");
						}
					}
				} finally {
					if (conn != null) {
						conn.close();
					}
				}

			} catch (Exception e) {
				e.printStackTrace();
				response.sendRedirect("newPassword.jsp");
			}
		} else {
			// Passwords do not match
			response.sendRedirect("newPassword.jsp");
		}
	}
}
