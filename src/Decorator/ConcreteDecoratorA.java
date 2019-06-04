package Decorator;

public class ConcreteDecoratorA extends Decorator {
    private String state = "";

    @Override
    public void Operation() {
        component.Operation();
        state="decoratorA";
        System.out.println("具体装饰对象A的操作");
    }


}
