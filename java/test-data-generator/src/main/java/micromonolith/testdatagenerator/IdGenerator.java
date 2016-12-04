package micromonolith.testdatagenerator;

/**
 * Author: Joakim Tengstrand
 */
public class IdGenerator {
    private int id = 1;

    public int nextId() {
        return id++;
    }
}
