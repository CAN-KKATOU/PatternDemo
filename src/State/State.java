package State;

public class State {

    private State impl;

    protected State() {

    }

    public State(State imp) {
        impl = imp;
    }

    public void change(State newImp) {
        impl = newImp;
    }

    public void f() {
        impl.f();
    }

    public void g() {
        impl.g();
    }

    public void h() {
        impl.h();
    }
}
