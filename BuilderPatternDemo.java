import java.util.Scanner;

public class BuilderPatternDemo {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      MealBuilder mealBuilder = new MealBuilder();

      System.out.println("Choose Meal Type: \n1. Veg\n2. Non-Veg\n3. Tea");
      int choice = sc.nextInt();

      Meal meal = null;

      switch (choice) {
         case 1:
         case 2:
            System.out.println("Do you want Diet drink? (yes/no)");
            String isDiet = sc.next();
            meal = (choice == 1)
                ? mealBuilder.prepareVegMeal(isDiet.equalsIgnoreCase("yes"))
                : mealBuilder.prepareNonVegMeal(isDiet.equalsIgnoreCase("yes"));
            break;

         case 3:
            System.out.println("Add cream to tea? (yes/no)");
            boolean addCream = sc.next().equalsIgnoreCase("yes");
            System.out.println("Number of sweetness spoons (0-5): ");
            int spoons = sc.nextInt();
            meal = mealBuilder.prepareTea(addCream, spoons);
            break;

         default:
            System.out.println("Invalid choice.");
            return;
      }

      System.out.println("\nYour Meal:");
      meal.showItems();
      System.out.println("Total Cost: " + meal.getCost());
      sc.close();
   }
}