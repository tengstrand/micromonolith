package micromonolith.testdatagenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * This is an example of how you can create a test data generator
 * that can create test data to put into your database(s)
 * to simplify test data setup in your integration tests.
 *
 * Author: Joakim Tengstrand
 */
public class Model {

    private Model() {}

    private IdGenerator idGenerator = new IdGenerator();
    private List<SqlStatement> sqlStatements = new ArrayList<SqlStatement>();

    public static Model newInstance() {
        return new Model();
    }

    public Address newAddress() {
        Address address = new AddressImpl(idGenerator);
        sqlStatements.add(address);
        return address;
    }

    public User newUser(Address address) {
        User user = new UserImpl(idGenerator, (AddressImpl)address);
        sqlStatements.add(user);
        return user;
    }

    public List<SqlStatement> sqlStatements() {
        return sqlStatements;
    }
}
