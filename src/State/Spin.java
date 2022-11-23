package State;

import Nap.Nap;

public class Spin implements StateInterface {
    @Override
    public void run() {
        System.out.println("Spinning");
        new Nap(0.5);
    }
}
