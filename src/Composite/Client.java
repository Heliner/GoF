package Composite;

public class Client {
    public static void main(String[] args) {
        Component c1, c2, c3, c4, c5, c6;

        c2 = new Composite("北京节点");
        c1 = new Leaf("海定服务器");
        c2.add(c1);
        c3 = new Leaf("朝阳服务器");
        c2.add(c3);


        c5 = new Leaf("高新区服务器");
        c4 = new Composite("成都节点");
        c4.add(c5);

        c6 = new Composite("根节点");
        c6.add(c2);
        c6.add(c4);

        c6.Display(1);
    }
}
