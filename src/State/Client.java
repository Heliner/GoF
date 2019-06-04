package State;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        State state1 = new State1();
        State state2 = new State2();

        state1.handle(context);
        state2.handle(context);

    }
}
