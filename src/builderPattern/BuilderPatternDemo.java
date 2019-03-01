package builderPattern;

/**
 * Builder pattern builds a complex object using simple objects and using a step
 * by step approach. This type of design pattern comes under creational pattern
 * as this pattern provides one of the best ways to create an object.
 * 
 * A Builder class builds the final object step by step. This builder is
 * independent of other objects.
 * 
 * @author Steffen Dworsky
 *
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {

		Meal vegMeal = MealBuilder.prepareNonVegMeal();
		Meal nonVegMeal = MealBuilder.prepareVegMeal();

		System.out.println(vegMeal);
		System.out.println(vegMeal.getTotalMealCost());
		System.out.println(nonVegMeal);
		System.out.println(nonVegMeal.getTotalMealCost());

	}

}
