package ChainOfResponsablity;

public class Client {
    public static void main(String[] args) {
        Manager jinli = new CommonManager("经理");
        Manager zongjian = new MajorManager("总监");
        Manager zhongjingli = new GeneralManager("钟经理");

        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zhongjingli);

        Request request1 = new Request("请假", 1);

        Request request2 = new Request("请假", 4);

        Request request = new Request("加薪", 500);
        ;

        Request request3 = new Request("加薪", 1000);

        jinli.RequestApplication(request);
        jinli.RequestApplication(request1);
        jinli.RequestApplication(request2);
        jinli.RequestApplication(request3);


    }
}
