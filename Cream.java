public class Cream extends BeverageDecorator {

    public Cream(ColdDrink beverage) {
        super(beverage);
    }

    @Override
    public String name() {
        return beverage.name() + " + Cream";
    }

    @Override
    public float price() {
        return beverage.price() + 5.0f; // Add 5 for cream
    }
}