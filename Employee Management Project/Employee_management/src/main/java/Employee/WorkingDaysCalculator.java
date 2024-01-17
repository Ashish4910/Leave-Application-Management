package Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class WorkingDaysCalculator {

	public static long calculateWorkingDays(String startDateString, String endDateString) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate startDate = LocalDate.parse(startDateString, formatter);
		LocalDate endDate = LocalDate.parse(endDateString, formatter);

		long workingDays = 0;

		while (!startDate.isAfter(endDate)) {
			if (startDate.getDayOfWeek() != DayOfWeek.SATURDAY && startDate.getDayOfWeek() != DayOfWeek.SUNDAY) {
				workingDays++;
			}
			startDate = startDate.plusDays(1);
		}

		return workingDays;
	}

	public static boolean getTheStatusOfEmployeePunchIN(int employeeId) {
		boolean status = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/employee_management?user=root&password=archit4910@");

			String query = "SELECT Result_status FROM employee_management.employee_attendance WHERE Employee_Id=? ORDER BY id DESC LIMIT 1";
			try (PreparedStatement pstmt = conn.prepareStatement(query)) {
				pstmt.setInt(1, employeeId);
				try (ResultSet rs = pstmt.executeQuery()) {
					if (rs.next()) {
						String result_status = rs.getString("Result_status");
						if ("Enabled".equalsIgnoreCase(result_status.trim())) {
							status = true;
						}
					} else {
						status = true;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}