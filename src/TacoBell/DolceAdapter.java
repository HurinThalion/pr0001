package TacoBell;

public class DolceAdapter implements CiboAdapter {

    @Override
    public String getPietanza() {
        return Dolce.genera();
    }
}
