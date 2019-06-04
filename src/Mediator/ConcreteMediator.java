package Mediator;

import java.util.HashMap;
import java.util.Map;

public class ConcreteMediator extends Mediator {
    Map<String, Colleague> map = new HashMap<String, Colleague>();

    @Override
    public void register(String name, Colleague colleague) {
        System.out.println(" 向中介者注册");
        map.put(name, colleague);
    }

    @Override
    public void send(String caller, String message) {
        System.out.println("中介者调用 "+caller+" 的方法");
        map.get(caller).selfAction();
    }


}
