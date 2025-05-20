public class Sweetness extends BeverageDecorator {
    private int spoons;

    public Sweetness(ColdDrink beverage, int spoons) {
        super(beverage);
        this.spoons = spoons;
    }

    @Override
    public String name() {
        return beverage.name() + " + Sweetness (" + spoons + " spoon(s))";
    }

    @Override
    public float price() {
        return beverage.price() + (spoons * 2.0f); // 2 per spoon
    }
}