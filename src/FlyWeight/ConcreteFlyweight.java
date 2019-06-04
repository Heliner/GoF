package FlyWeight;

public class ConcreteFlyweight extends Flyweight {
    @Override
    public void Operation(int extrinsicstate) {
        System.out.println("共享（内部）对象的具体FlyWeight：" + extrinsicstate);
    }
}
