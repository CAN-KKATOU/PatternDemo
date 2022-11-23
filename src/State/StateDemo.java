package State;

public class StateDemo {
    static void test(State state) {
        state.f();
        state.g();
        state.h();
    }

    public static void main(String[] args) {
        var state = new State(new Implementation1());
        test(state);

        System.out.println("Changing implementation");

        state.change(new Implementation2());
        test(state);
    }
}
