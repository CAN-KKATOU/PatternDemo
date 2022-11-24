package SingleronPattern;

public class SinglePattern {
    public static <T> void show(Resource<T> r) {
        var val = r.get();
        System.out.println(val);
    }

    public static <T> void put(Resource<T> r, T val) {
        r.set(val);
    }

    public static void main(String[] args) {
        System.out.println("Inside main()");

        var ir1 = IntegerSingleton.instance();

        var ir2 = IntegerSingleton.instance();

        show(ir1);

        put(ir2, 9);

        show(ir1);
    }
}
