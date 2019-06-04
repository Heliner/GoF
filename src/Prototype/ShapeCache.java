package Prototype;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {
    static Map<Integer, Shape> cache = new HashMap<Integer, Shape>();

    static Shape getShape(Integer id) {
        try {
            return (Shape) (cache.get(id)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    static void loadCache() {
        Shape circle = new Circle();
        circle.setId(1);
        Shape thriangle = new Thriangle();
        thriangle.setId(2);

        cache.put(circle.getId(), circle);
        cache.put(thriangle.getId(), thriangle);
    }
}
