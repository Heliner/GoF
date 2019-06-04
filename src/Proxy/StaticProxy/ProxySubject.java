package Proxy.StaticProxy;

public class ProxySubject implements Subject {
    Subject realSubject;

    public ProxySubject(Subject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void confer() {
        System.out.println("ProxySubject confer");

    }

    @Override
    public void signContent() {
        System.out.println("ProxySubject signContent");

    }

    @Override
    public void bookTicket() {
        System.out.println("ProxySubject bookTicket");

    }

    @Override
    public void sing() {
        realSubject.sing();
    }

    @Override
    public void collectMoney() {
        System.out.println("ProxySubject collectMoney");

    }
}
