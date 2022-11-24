package BuilderPattern;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        var mealBuilder = new MealBuilder();

        var meal1 = mealBuilder.prepareMeal1();
        System.out.println("Meal 1");
        meal1.showItems();
        System.out.println("Total Cost: " + meal1.getCost());

        var meal2 = mealBuilder.prepareMeal2();
        System.out.println("\n\nMeal 2");
        meal2.showItems();
        System.out.println("Total Cost: " + meal2.getCost());

        var meal3 = mealBuilder.prepareMeal3();
        System.out.println("Meal 3");
        meal3.showItems();
        System.out.println("Total Cost: " + meal3.getCost());

        var meal4 = mealBuilder.prepareMeal4();
        System.out.println("\n\nMeal 4");
        meal4.showItems();
        System.out.println("Total Cost: " + meal4.getCost());
    }
}
