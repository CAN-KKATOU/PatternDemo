package SinglePattern;

final class IntegerSingleton implements Resource<Integer> {

    private static IntegerSingleton inst = new IntegerSingleton();

    private Integer value = Integer.valueOf(0);

    private IntegerSingleton() {
        System.out.println("IntegerSingleton");
    }

    public static IntegerSingleton instance() {
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
