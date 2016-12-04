package micromonolith.address_api;

/**
 * Author: Joakim Tengstrand
 */
public interface AddressData {
    int getStreetNumber();
    String getStreetName();
    String getZipcode();
    String getCity();
}
