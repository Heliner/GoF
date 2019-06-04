package Prototype;

public class Client {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        System.out.println(ShapeCache.getShape(1));
        System.out.println(ShapeCache.getShape(2));
        System.out.println(ShapeCache.getShape(2));
    }
}
