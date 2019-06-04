package Proxy.StaticProxy;


public class RealSubject implements Subject {

    @Override
    public void confer() {
        System.out.println("realStart confer");
    }

    @Override
    public void signContent() {
        System.out.println("realStart signContent");

    }

    @Override
    public void bookTicket() {
        System.out.println("realStart bookTicket");

    }

    @Override
    public void sing() {
        System.out.println("realStart sing");

    }

    @Override
    public void collectMoney() {
        System.out.println("RealStart collectMoney");

    }
}
