package State;

import Nap.Nap;

public class Wash implements StateInterface {

    @Override
    public void run() {
        System.out.println("Washing");
        new Nap(0.5);
    }
}
