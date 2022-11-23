package State;

import Nap.Nap;

public class Rinse implements StateInterface {
    @Override
    public void run() {
        System.out.println("Rinsing");
        new Nap(0.5);
    }
}
