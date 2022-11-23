package Proxy;

public class Proxy implements ProxyBase {

    private ProxyBase impl = new Implementation();

    @Override
    public void f() {
        impl.f();
    }

    @Override
    public void g() {
        impl.g();
    }

    @Override
    public void h() {
        impl.h();
    }
}
