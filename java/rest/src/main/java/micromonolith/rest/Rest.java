package micromonolith.rest;

import micromonolith.email.EmailService;
import micromonolith.user.UserService;

/**
 * This is our REST API that we expose.
 * It manages the dependency injection for services that is calling
 * other services.
 * (you need to imagine that we have a lot of networking going on here)!
 */
public class Rest {

    // Here we instantiates all our stateless services.
    private EmailService emailService = new EmailService();
    private UserService userService = new UserService();

    // We inject one "function" at a time (*).
    // Every "functions" is just a Java interfaces with only one method,
    // but this is the closest we get to functions in Java!
    //
    // (*) We introduce the term "micro injection".
    //     By using smaller building blocks ("functions" instead of interfaces
    //     containing many methods) we get a more robust and flexible
    //     interface between services with a minimum of exposure.
    //
    // A problem in object oriented languages is that they
    // encourages you to create bigger building blocks, like classes
    // instead of functions.
    {
        userService.pdfSender = emailService;
    }

    // Another way of injecting our functions is to pass them in as arguments to our methods.
    public void doUserStuff() {
        // micro injection - only inject the function/method sendMail
        userService.doSomething(emailService);
    }

    public void doUserPdfStuff() {
        userService.doAnotherThing();
    }
}
