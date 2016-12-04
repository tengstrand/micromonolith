package micromonolith.testdatagenerator;


public class IdGenerator {
    private int id = 1;

    public int nextId() {
        return id++;
    }
}
