package micromonolith.email_api;

/**
 * Author: Joakim Tengstrand
 */
public interface PdfEmailSender {
    void sendPdfEmail(String message);
}
