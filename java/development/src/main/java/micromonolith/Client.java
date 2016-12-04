package micromonolith;

import micromonolith.rest.Rest;

/**
 * This is our "client" that calls our "REST" API.
 *
 * Author: Joakim Tengstrand
 */
public class Client {

    public static void main(String[] args) {
        Rest rest = new Rest();
        rest.doUserStuff();
        rest.doMoreUserStuff();

        // we have not implemented a real REST API, so we don't retrieve anything.
        rest.findAddresses();
    }
}
