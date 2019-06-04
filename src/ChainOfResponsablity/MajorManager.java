package ChainOfResponsablity;

public class MajorManager extends Manager {
    public MajorManager(String name) {
        super(name);
    }

    @Override
    public void RequestApplication(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5)
            System.out.println(" " + name + " 批准了 " + request.getRequestType() + "; 时间:" + request.getNumber());
        else if (superior != null)
            superior.RequestApplication(request);
    }
}
