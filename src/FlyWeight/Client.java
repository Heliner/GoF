package FlyWeight;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight flyweight =
                flyweightFactory.getFlyWeight("80kg");
        Flyweight flyweight1 = flyweightFactory.getFlyWeight("100kg");
        Flyweight unsharedFlyweight = new UnsharedConcreteFlyweight();

        int op = 1;
        flyweight.Operation(op++);
        flyweight1.Operation(op++);
        unsharedFlyweight.Operation(op++);

    }
}
