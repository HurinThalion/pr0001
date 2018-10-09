package TacoBell;

public class PizzaAdapter implements CiboAdapter {

    @Override
    public String getPietanza() {

        return TacoPizze.generaESalva();
    }
}
