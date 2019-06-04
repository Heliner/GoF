package Mediator;

public abstract class Mediator {
    public abstract void register(String message, Colleague colleague);

    public abstract  void send(String caller,String message);
}
