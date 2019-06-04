package Proxy.StaticProxy;

public class Client {
    public static void main(String[] args) {
        RealSubject real = new RealSubject();

        ProxySubject proxy = new ProxySubject(real);

        proxy.confer();
        proxy.signContent();
        proxy.bookTicket();
        proxy.sing();
        proxy.collectMoney();
    }
}
