package micromonolith.testdatagenerator;

/**
 * Author: Joakim Tengstrand
 */
public interface Address extends SqlStatement {
    Address withStreetNumber(int streetNumber);
    Address withStreetName(String streetName);
    Address withZipcode(String zipcode);
    Address withCity(String city);
}
