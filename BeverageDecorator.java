public abstract class BeverageDecorator extends ColdDrink {
    protected ColdDrink beverage;

    public BeverageDecorator(ColdDrink beverage) {
        this.beverage = beverage;
    }

    public abstract String name();
    public abstract float price();
}
