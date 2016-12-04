package micromonolith.testdatagenerator;

import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.assertEquals;

public class ModelTest {

    @Test
    public void newUser() {
        Model model = Model.newInstance();
        Address address = model.newAddress()
                .withStreetName("Storgatan")
                .withStreetNumber(15)
                .withCity("Uppsala")
                .withZipcode("11222");
        model.newUser(address)
                .withGivenName("Donalt")
                .withSurname("Duck");
        List<SqlStatement> statements = model.sqlStatements();

        assertEquals(2, statements.size());

        assertEquals("insert into address (id, street_number, street_name, zipcode, city) " +
                     "values (1, 15, 'Storgatan', '11222', 'Uppsala')",
                statements.get(0).sql());

        assertEquals("insert into user (id, given_name, surname, address_id) values (2, 'Donalt', 'Duck', 1)",
                statements.get(1).sql());
    }
}
