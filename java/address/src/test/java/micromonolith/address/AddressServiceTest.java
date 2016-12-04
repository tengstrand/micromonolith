package micromonolith.address;

import micromonolith.address_api.AddressCriteria;
import micromonolith.testdatagenerator.Address;
import micromonolith.testdatagenerator.DbPersister;
import micromonolith.testdatagenerator.Model;
import org.junit.Test;

import java.util.List;

/**
 * Author: Joakim Tengstrand
 */
public class AddressServiceTest {

    @Test
    public void findAddresses() {
        Model model = Model.newInstance();
        Address address = model.newAddress().withCity("Stockholm");
        model.newUser(address).withGivenName("Bill");
        DbPersister.persist(model);

        AddressCriteria criteria = new AddressCriteria().withStreetName("MyStreet");
        List<micromonolith.address.Address> addresses = new AddressService().findAddresses(criteria);

        // verify the result
    }
}
