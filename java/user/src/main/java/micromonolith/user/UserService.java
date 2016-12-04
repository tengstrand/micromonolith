package micromonolith.user;

import micromonolith.email_api.PdfEmailSender;
import micromonolith.email_api.EmailSender;

/**
 * Author: Joakim Tengstrand
 */
public class UserService {

    // Will be injected from the Rest service.
    public PdfEmailSender pdfSender;

    // An alternative way of doing the dependency injection
    // is to send them in to the constructor.
    // This is however not a good idea if we have more than a few
    // methods in our service.
    // Let's say we have ten methods in total, instead of just these two,
    // and that we want to call doAnotherThing. Instead of just injecting
    // EmailSender, we now need to inject all the others nine methods
    // in the constructor too (and maybe set them to null).

    public void doSomething(EmailSender sender) {
        System.out.println("Do important user stuff (in UserService)");
        sender.sendMail("Important mail");
    }

    public void doAnotherThing() {
        System.out.println("Do another user thing (in UserService)");
        pdfSender.sendPdfEmail("Another mail");
    }
}
