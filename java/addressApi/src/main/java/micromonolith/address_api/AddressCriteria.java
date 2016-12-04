package micromonolith.address_api;

public class AddressCriteria {
    // This is just a simple struct, and we don't have any need for getters and setters.
    public String streetName;
    public int streetNumber;
    // ...

    public AddressCriteria withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public AddressCriteria withStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }
}
