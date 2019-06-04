package Prototype;

public abstract class Shape implements Cloneable {
    Integer id;
    String type;

    public abstract void draw();
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Shape clone = null;
        try {
            clone = (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
