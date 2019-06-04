package ChainOfResponsablity;

public class GeneralManager extends Manager {
    public GeneralManager(String name) {
        super(name);
    }

    @Override
    public void RequestApplication(Request request) {
        if ("请假".equals(request.getRequestType()))
            System.out.println("" + name + " 批准了 " + request.getRequestType() + " ；时长:" + request.getNumber());
        else if ("加薪".equals(request.getRequestType()) && request.number <= 500)
            System.out.println("总监同意加薪" + request.getNumber());
        else
            System.out.println("再说~");
    }
}
