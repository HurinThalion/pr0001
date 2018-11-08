package eserciziPack3.sistemaTelefonico;

import java.util.ArrayList;
import java.util.List;

public class SimCard {

    private static List<PhoneCall> phoneCall;
    private static double credit;
    private static String nPhone;

    private static SimCard sim = null;

    private SimCard(double credit1) {

        nPhone = GenPhoneNumber.generaNumeroTel();
        credit = credit1;
        phoneCall = new ArrayList<>();
    }

    public static SimCard getSimCard(double credit) {

        if(sim == null) {
            return new SimCard(credit);
        }else {
            return sim;
        }
    }

    public static List<PhoneCall> getPhoneCall() {
        return phoneCall;
    }

    public static double getCredit() {
        return credit;
    }

    public static String getnPhone() {
        return nPhone;
    }

    public void insertPhoneCall(int time, String phoneNum) {

        PhoneCall p = new PhoneCall(time, phoneNum);
        phoneCall.add(p);
    }

    public int timeCall() {

        int t = 0;
        for(PhoneCall p : phoneCall) {
            t += p.getTimeCall();
        }
        return t;
    }

    public List<PhoneCall> phoneCallNum(String phoneNumber) {

        List<PhoneCall> tmp = new ArrayList<>();
        for(PhoneCall p : phoneCall) {

            if(p.getnPhone().equalsIgnoreCase(phoneNumber)) {

                tmp.add(p);
            }
        }
        return tmp;
    }

    public String stampa() {

        String s = "SIM : " + "n. Telefono -> " + nPhone + " credit : " + credit
                + " all Phone calls : ";
        for(PhoneCall p : phoneCall) {
            s += "\nnumero : " + p.getnPhone() + " time call : " + p.getTimeCall();
        }
        return s;
    }

}
