package micromonolith.testdatagenerator;

public interface User extends SqlStatement {
    User withSurname(String surname);
    User withGivenName(String givenName);
}
