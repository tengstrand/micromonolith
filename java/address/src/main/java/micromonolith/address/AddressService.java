package micromonolith.address;

import micromonolith.address_api.AddressCriteria;

import java.util.Arrays;
import java.util.List;

public class AddressService {

    public List<Address> findAddresses(AddressCriteria criteria) {
        // do some intelligent searching here...
        Address address = new Address(
                10,
                "Downing Street",
                "SW1A 2AA",
                "London"
        );
        return Arrays.asList(address);
    }
}
