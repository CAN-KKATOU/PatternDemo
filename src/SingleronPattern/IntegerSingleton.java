package SingleronPattern;

final class IntegerSingleton implements Resource<Integer> {

    private volatile static IntegerSingleton inst;

    private Integer value = 0;

    private IntegerSingleton() {
        System.out.println("IntegerSingleton");
    }

    public static IntegerSingleton instance() {
        if (inst == null) {
            synchronized (IntegerSingleton.class) {
                if (inst == null)
                    inst = new IntegerSingleton();
            }
        }
        return inst;
    }

    @Override
    public synchronized Integer get() {
        return value;
    }

    @Override
    public synchronized void set(Integer x) {
        value = x;
    }
}
