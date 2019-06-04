package Prototype;

public class Circle extends Shape {
    public Circle() {
        type = "circle";
    }

    @Override
    public void draw() {
        System.out.println(type + " draw");
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
