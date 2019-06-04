package Mediator;

public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void outAction() {
        mediator.send("caller","2号呼叫1号");

    }

    @Override
    public void selfAction() {
        System.out.println("ConcreteColleague2 Self work");
    }
}
