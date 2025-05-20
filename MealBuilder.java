public class MealBuilder {

   public Meal prepareVegMeal(boolean isDiet) {
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(isDiet ? new DietCoke() : new Coke());
      return meal;
   }

   public Meal prepareNonVegMeal(boolean isDiet) {
      Meal meal = new Meal();
      meal.addItem(new ChickenBurger());
      meal.addItem(isDiet ? new DietPepsi() : new Pepsi());
      return meal;
   }

   public Meal prepareTea(boolean addCream, int sweetnessSpoons) {
      Meal meal = new Meal();
      ColdDrink tea = new Tea();
      if (addCream) {
          tea = new Cream(tea);
      }
      if (sweetnessSpoons > 0) {
          tea = new Sweetness(tea, sweetnessSpoons);
      }
      meal.addItem(tea);
      return meal;
   }
}