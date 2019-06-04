package Mediator;

import java.util.Arrays;

public class Client {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        Colleague colleague = new ConcreteColleague1(mediator);
        Colleague colleague2 = new ConcreteColleague2(mediator);

        mediator.register("caller", colleague);
        mediator.register("caller2", colleague2);

        colleague.outAction();
        colleague2.outAction();

        int i = 1;
        int c = 0;
        while (c < 31) {
            System.out.println(i = i << 1);
            c++;
        }
    }
}
