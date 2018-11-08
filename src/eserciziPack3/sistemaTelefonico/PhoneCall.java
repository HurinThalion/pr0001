package eserciziPack3.sistemaTelefonico;

public class PhoneCall {

    private int timeCall;
    private String nPhone;

    public PhoneCall() {
    }

    public PhoneCall(int timeCall, String nPhone) {
        this.timeCall = timeCall;
        this.nPhone = nPhone;
    }

    public int getTimeCall() {
        return timeCall;
    }

    public void setTimeCall(int timeCall) {
        this.timeCall = timeCall;
    }

    public String getnPhone() {
        return nPhone;
    }

    public void setnPhone(String nPhone) {
        this.nPhone = nPhone;
    }
}
