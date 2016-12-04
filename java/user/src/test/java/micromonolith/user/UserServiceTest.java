package micromonolith.user;

import micromonolith.email.api.EmailSender;
import org.junit.Test;

// Our tests are allowed to have explicit dependencies to other
// services (which is not the case for the production code).
import micromonolith.testdatagenerator.*;

public class UserServiceTest {

    @Test
    public void doSomething() {
        Model model = Model.newInstance();
        Address address = model.newAddress();
        model.newUser(address).withSurname("Donald"); // Trump or Duck?
        DbPersister.persist(model);

        EmailSender emailSender = new EmailSender() {
            public void sendMail(String message) {
            }
        };
        UserService service = new UserService();
        service.doSomething(emailSender);

        // the verifications goes here.
    }
}
