package FlyWeight;

import java.util.HashMap;

public class FlyweightFactory {
    private HashMap<String, Flyweight> factory = new HashMap();

    public FlyweightFactory() {
        factory.put("80kg", new ConcreteFlyweight());
        factory.put("100kg", new ConcreteFlyweight());
    }

    public Flyweight getFlyWeight(String key) {
        if (factory.containsKey(key))
            return factory.get(key);
        else {
            Flyweight flyweight = new ConcreteFlyweight();
            factory.put(key, flyweight);
            return flyweight;
        }
    }

}
