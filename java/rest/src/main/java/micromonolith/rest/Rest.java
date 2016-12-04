package micromonolith.rest;

import micromonolith.address.Address;
import micromonolith.address.AddressService;
import micromonolith.address_api.AddressCriteria;
import micromonolith.email.EmailService;
import micromonolith.user.UserService;

import java.util.List;

/**
 * This is our REST API that we expose.
 * It manages the dependency injection for services that is calling
 * other services.
 *
 * The idea is to show the principles of the monolith architecture,
 * so the code is free from technical stuff like HTTP and database connectons,
 * that is up to you to imagine in your mind!
 *
 * Author: Joakim Tengstrand
 */
public class Rest {

    // Here we instantiates all our stateless services.
    private AddressService addressService = new AddressService();
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
    {
        userService.pdfSender = emailService;
    }

    /**
     * The Address and AddressCriteria is part of the addressApi project,
     * and is used to integrate this service with the address service.
     */
    public void findAddresses() {
        AddressCriteria criteria = new AddressCriteria();

        // do something intelligent with the result!
        List<Address> addresses = addressService.findAddresses(criteria);
    }

    // Another way of injecting our functions is to pass them in as arguments to our methods.
    public void doUserStuff() {
        // micro injection - only inject the function/method sendMail (that EmailService implements)
        userService.doSomething(emailService);
    }

    public void doMoreUserStuff() {
        userService.doAnotherThing();
    }
}
