package eserciziPack3.sistemaTelefonico;

public class PhoneCall {

    private int timeCall;

    public PhoneCall(int timeCall) {
        this.timeCall = timeCall;
    }

    public int gettimeCall() {
        return timeCall;
    }

    public void settimeCall(int timeCall) {
        this.timeCall = timeCall;
    }
}
