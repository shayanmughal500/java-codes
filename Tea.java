public class Tea extends ColdDrink {
    @Override
    public float price() {
        return 20.0f;
    }

    @Override
    public String name() {
        return "Plain Tea";
    }
}