package eserciziPack3.sistemaTelefonico;

import java.util.ArrayList;
import java.util.List;

public class SimCard {

    private List<PhoneCall> phoneCall;
    private double credit;
    private String nPhone;

    private static SimCard sim = null;

    private SimCard(double credit) {

        this.nPhone = GenPhoneNumber.generaNumeroTel();
        this.credit = credit;
        this.phoneCall = new ArrayList<>();
    }

    public static SimCard getSimCard(double credit) {

        if(sim == null) {
            return new SimCard(credit);
        }else {
            return sim;
        }
    }

    public void insertPhoneCall(int time) {

        PhoneCall p = new PhoneCall(time);
        phoneCall.add(p);
    }


}
