package State;

public class State2 extends State {
    @Override
    public void handle(Context context) {
        System.out.println("state2 进行状态处理");

        context.setState(this);
    }
}
