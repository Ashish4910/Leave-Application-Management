package EmailValidate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DAOMethod {

	public boolean forgetPassword(String otp, String email) {
		boolean f = false;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=archit4910@");
			PreparedStatement pstmt = null;
			try {
				pstmt = conn.prepareStatement("update add_employee set forget_Password=? where email=?");
				pstmt.setString(1, otp);
				pstmt.setString(2, email);
				int row = pstmt.executeUpdate();
				if (row > 0) {
					f = true;
				}
			} finally {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return f;
	}
}
