package testemailsent;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendEmailTemplate {
    
    public static void main(String[] args) {
        
        try {
            System.out.println("============== Test Started ===============");

            sentEmail("This is a test mail from Selenium.");
            
            System.out.println("============== Email Sent ===============");

        } catch (EmailException e) {
            e.printStackTrace();
        }
    }

	public static void sentEmail(String messageBody) throws EmailException {
		// Create the email object
		Email email = new SimpleEmail();
		email.setHostName("smtp.mail.yahoo.com");  // Yahoo SMTP server
		email.setSmtpPort(465);  // Use 465 for SSL connection
		
		email.setAuthenticator(new DefaultAuthenticator("turanoviklora@yahoo.com", "cokqyyoacyptaxfp"));
		email.setSSLOnConnect(true);  // SSL enabled

		// Email details
		email.setFrom("turanoviklora@yahoo.com");  // Sender's Yahoo email
		email.setSubject("Selenium Test Report for Salesforce login test");
		email.setMsg(messageBody);
		email.addTo("turanoviklora@yahoo.com");  // Add recipient email

		// Send the email
		email.send();
	}
}

