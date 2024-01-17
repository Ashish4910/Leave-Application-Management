package EmailValidate;

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

@WebServlet("/ValidateOtp")
public class ValidateOtp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final String DB_URL = "jdbc:mysql://localhost:3306/employee_management?user=root&password=archit4910@";
		final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";

		String email = request.getParameter("email");
		String otp = request.getParameter("otp");

		try {
			Class.forName(DB_DRIVER);
			Connection conn = DriverManager.getConnection(DB_URL);

			try {
				// Check if the OTP exists in the table for the given email
				String sql = "SELECT * FROM add_employee WHERE email=? AND forget_Password=?";
				try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
					pstmt.setString(1, email);
					pstmt.setString(2, otp);
					HttpSession session = request.getSession();

					try (ResultSet rs = pstmt.executeQuery()) {
						if (rs.next()) {
							session.setAttribute("email", email);
							// OTP is valid, perform actions accordingly
							// For example, redirect to a success page
							response.sendRedirect("newPassword.jsp");
						} else {
							// Invalid OTP, set an error message in the session
							request.getSession().setAttribute("message", "Invalid OTP. Please try again.");
							response.sendRedirect("otp_entry.jsp"); // Redirect back to the OTP entry page
						}
					}
				}
			} finally {
				if (conn != null) {
					conn.close();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
