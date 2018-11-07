package eserciziPack2.tacoBell;

public class PizzaAdapter implements CiboAdapter {

    @Override
    public String getPietanza() {

        return TacoPizze.generaESalva();
    }
}
