package EmailValidate;

import jakarta.mail.*;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;
import java.util.Random;

public class mailSender {

	public boolean sendEmail(String to, String from, String subject, String text) {
		boolean flag = false;

		System.out.println("Email  of user " + to);
		// Generate OTP
		String otp = generateOTP();

		// Append OTP to the email text
		text = text + "\n\nYour OTP is: " + otp;

		// smtp properties
		Properties properties = new Properties();
		properties.put("mail.smtp.auth", true);
		properties.put("mail.smtp.starttls.enable", "true");
		properties.put("mail.smtp.port", "587");
		properties.put("mail.smtp.host", "smtp.gmail.com");
		properties.put("mail.smtp.ssl.trust", "smtp.gmail.com"); // Trust the SSL certificate

		final String username = "archit4910";
		final String password = "fzcinlaignjihpgz";

		// session
		Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			Message message = new MimeMessage(session);
			message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setFrom(new InternetAddress(from));
			message.setSubject(subject);
			message.setText(text);
			Transport.send(message);
			flag = true;
			if (flag) {
				DAOMethod dao = new DAOMethod();
				boolean f = dao.forgetPassword(otp, to);
				if (f) {
					System.out.println("password is updated to the table successfully");
				} else {
					System.out.println("Password is not inserted to db ");
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;

	}

	// Helper method to generate a random 6-digit OTP
	private String generateOTP() {
		Random random = new Random();
		int otp = 100000 + random.nextInt(900000);
		return String.valueOf(otp);
	}

}
