package Mediator;

import Decorator.ConcreteDecoratorB;

public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void outAction() {
        mediator.send("caller2","1号呼叫2号");

    }

    @Override
    public void selfAction() {
        System.out.println("ConcreteColleague1 Self work");
    }
}
