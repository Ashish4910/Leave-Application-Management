package EmailValidate;

public class Mail {
	public static void main(String[] args) {

		mailSender gEmailSender = new mailSender();
		// GEmailSender gEmailSender = new GEmailSender();

		String to = "palashish73797@gmail.com";

		String from = "archit4910@gmail.com";

		String subject = "Second: Sending email using GMail";

		String text = "This is a example email send using gmail and java program with out less secure app but know i wont show you ";

		boolean b = gEmailSender.sendEmail(to, from, subject, text);

		if (b) {
			System.out.println("Email is sent successfully");

		} else {

			System.out.println("There is problem in sending email");
		}

	}
}
