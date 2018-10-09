package TacoBell;

public class MainAdapter {
    public static void main(String[] args) {
        CiboAdapter pizza = new PizzaAdapter();
        System.out.println(pizza.getPietanza());
        CiboAdapter dolce = new DolceAdapter();
        System.out.println(dolce.getPietanza());
        //System.out.println(Dolce.genera());
        CiboAdapter p = new PizzaAdapter();
        System.out.println(p.getPietanza());
    }
}
