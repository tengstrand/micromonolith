package micromonolith;

import micromonolith.rest.Rest;

/**
 * This is our "client" that calls our "REST" API.
 */
public class Client {

    public static void main(String[] args) {
        Rest rest = new Rest();
        rest.doUserStuff();
        rest.doMoreUserStuff();
    }
}
