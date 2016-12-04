package micromonolith.testdatagenerator;

/**
 * Author: Joakim Tengstrand
 */
public interface User extends SqlStatement {
    User withSurname(String surname);
    User withGivenName(String givenName);
}
