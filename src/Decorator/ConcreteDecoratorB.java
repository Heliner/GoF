package Decorator;

public class ConcreteDecoratorB extends Decorator {

    public void addedOperation() {
        System.out.println("Decorator B add operation");
    }


    @Override
    public void Operation() {
        component.Operation();
        System.out.println("具体装饰对象B的操作");
        this.addedOperation();
    }


}
