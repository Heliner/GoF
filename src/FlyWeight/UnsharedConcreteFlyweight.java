package FlyWeight;

public class UnsharedConcreteFlyweight extends Flyweight {
    @Override
    public void Operation(int extrinsicstate) {
        System.out.println("不共享（外部）对象的具体FlyWeight：" + extrinsicstate);
    }
}
