package Composite;

public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        System.out.println("Lead Node don't support add");
    }

    @Override
    public void remove(Component component) {
        System.out.println("Lead Node don't support remove");
    }

    @Override
    public void Display(int depth) {
        while (depth > 0) {
            System.out.print("-");
            depth--;
        }
        System.out.println(""+this.name);
    }
}
