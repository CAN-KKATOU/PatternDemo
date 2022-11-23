package Nap;

import java.util.concurrent.TimeUnit;

public class Nap {
    public Nap(double sec) {
        try {
            TimeUnit.MILLISECONDS.sleep((int)(1000 * sec));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Nap(double sec, String desc) {
        this(sec);
        System.out.println(desc);
    }
}
