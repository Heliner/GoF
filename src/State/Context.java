package State;

public class Context {
    private  State state;

    public void setState(State state) {
        System.out.println("context 进行状态切换");
        this.state = state;
    }

}
