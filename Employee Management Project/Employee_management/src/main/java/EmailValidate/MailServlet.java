package EmailValidate;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/forgotPassword")
public class MailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String email = request.getParameter("email");
		System.out.println("email " + email);

		mailSender gEmailSender = new mailSender();
		// GEmailSender gEmailSender = new GEmailSender();

		String to = email;
		String from = "archit4910@gmail.com";
		String subject = "Password Reset Request";
		String text = "Dear User,\n\n"
				+ "You have requested to reset your password. Please use the following OTP to proceed with the password reset:\n\n";

		text += "If you didn't request a password reset, please ignore this email.\n\n";
		text += "Best regards,\nMobilestyx Consulting Solutions";

		boolean b = gEmailSender.sendEmail(to, from, subject, text);
		HttpSession mySession = request.getSession();
		if (b) {
			System.out.println("Email is sent successfully");
			mySession.setAttribute("message", "OTP is sent to your email id");
			mySession.setAttribute("email", to);
			response.sendRedirect("EnterOtp.jsp");

		} else {

			System.out.println("There is a problem in sending the email");
			response.sendRedirect("forgotPassword.jsp");
		}

	}
}
