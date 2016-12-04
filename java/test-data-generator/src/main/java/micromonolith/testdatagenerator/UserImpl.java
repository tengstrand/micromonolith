package micromonolith.testdatagenerator;

public class UserImpl implements User {

    public int id;
    public String givenName;
    public String surname;
    public int addressId;

    public UserImpl(IdGenerator idGenerator, AddressImpl address) {
        id = idGenerator.nextId();
        givenName = "Carl" + id;
        surname = "Andersson" + id;
        addressId = address.id;
    }

    public User withGivenName(String givenName) {
        this.givenName = givenName;
        return this;
    }

    public User withSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String sql() {
        return String.format("insert into user (id, given_name, surname, address_id) values (%d, '%s', '%s', %d)",
                id, givenName, surname, addressId);
    }

    @Override
    public String toString() {
        return sql();
    }
}
