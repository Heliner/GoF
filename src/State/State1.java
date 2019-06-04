package State;

public class State1 extends State {
    @Override
    public void handle(Context context) {
        System.out.println("state1 进行状态处理");
        context.setState(this);
    }
}
