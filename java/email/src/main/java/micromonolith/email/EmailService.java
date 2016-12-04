package micromonolith.email;

import micromonolith.email.api.*;

/**
 * Author: Joakim Tengstrand
 */
public class EmailService implements EmailSender, PdfEmailSender {

    public void sendMail(String message) {
        System.out.println("Email sent: " + message);
    }

    public void sendPdfEmail(String message) {
        System.out.println("Pdf email sent: " + message);
    }
}
