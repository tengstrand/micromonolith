package micromonolith.email_api;

/**
 * Author: Joakim Tengstrand
 */
public interface EmailSender {
    void sendMail(String message);
}
