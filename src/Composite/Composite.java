package Composite;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    List<Component> componentList = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        componentList.add(component);
    }

    @Override
    public void remove(Component component) {
        component.remove(component);
    }

    @Override
    public void Display(int depth) {
        int cd = depth;
        while (cd > 0) {
            System.out.print("-");
            cd--;
        }
        System.out.println(""+this.name);
        for (Component component : componentList) {
            component.Display(depth + 1);
        }
    }
}
