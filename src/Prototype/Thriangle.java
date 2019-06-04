package Prototype;

public class Thriangle extends Shape {
    public Thriangle() {
        type = "thirangle";
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
