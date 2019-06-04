package ChainOfResponsablity;

public class CommonManager extends Manager {
    public CommonManager(String name) {
        super(name);
    }

    @Override
    public void RequestApplication(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 2) {
            System.out.println(" " + name + "批准 " + request.getRequestType() + " ; 时间：" + request.getNumber());
        } else if (superior != null) {
            superior.RequestApplication(request);
        }
    }
}
