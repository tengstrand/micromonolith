package micromonolith.address;

import micromonolith.address_api.AddressData;

/**
 * Author: Joakim Tengstrand
 */
public class Address implements AddressData {
    private int streetNumber;
    private String streetName;
    private String zipcode;
    private String city;

    public Address(int streetNumber, String streetName, String zipcode, String city) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.zipcode = zipcode;
        this.city = city;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }
}
