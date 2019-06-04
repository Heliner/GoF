package ChainOfResponsablity;

public class Request {
    String requestType;
    Integer number;

    public Request(String requestType, Integer number) {
        this.requestType = requestType;
        this.number = number;
    }

    public String getRequestType() {
        return requestType;
    }

    public Integer getNumber() {
        return number;
    }
}
