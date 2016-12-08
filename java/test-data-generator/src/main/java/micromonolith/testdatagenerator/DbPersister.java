package micromonolith.testdatagenerator;

import java.util.List;

public class DbPersister {

    /**
     * persist all sql statements in the model to the database, e.g.:
     *
     *    Model model = Model.newInstance();
     *    Address address = model.newAddress();
     *    User user = model.newUser(address);
     *    DbPersister.persist(model);
     */
    public static void persist(Model model) {
        List<SqlStatement> sqlStatements = model.sqlStatements();

        // store all sql statements to the database...
    }
}
