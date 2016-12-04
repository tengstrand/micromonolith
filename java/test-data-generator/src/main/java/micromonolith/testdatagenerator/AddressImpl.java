package micromonolith.testdatagenerator;

public class AddressImpl implements Address {

    public int id;
    public int streetNumber;
    public String streetName;
    public String zipcode;
    public String city;

    public AddressImpl(IdGenerator idGenerator) {
        this.id = idGenerator.nextId();
        streetName = "Street" + id;
        streetNumber = id;
        zipcode = "12345";
        city = "Stockholm";
    }

    public Address withStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    public Address withStreetName(String streetName) {
        this.streetName = streetName;
        return this;
    }

    public Address withZipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public Address withCity(String city) {
        this.city = city;
        return this;
    }

    public String sql() {
        return String.format("insert into address (id, street_number, street_name, zipcode, city) values (%d, %d, '%s', '%s', '%s')",
                id, streetNumber, streetName, zipcode, city);
    }
}
