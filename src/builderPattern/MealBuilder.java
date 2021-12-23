package builderPattern;

import java.util.Scanner;

public class MealBuilder {
	public Meal mealA() {
		Meal meal = new Meal();
		meal.addItem(new BurgerA());
		meal.addItem(new DrinkA());
		return meal;
	}

	public Meal mealB() {
		Meal meal = new Meal();
		meal.addItem(new BurgerB());
		meal.addItem(new DrinkB());
		return meal;
	}

	public Meal mealC() {
		Meal meal = new Meal();
		meal.addItem(new BurgerC());
		meal.addItem(new DrinkC());
		return meal;
	}
	
	public Meal customizeMeal() {
		Scanner input = new Scanner(System.in);
		Meal meal = new Meal();
		ItemFactory item_factory = new ItemFactory();
		//用户选择商品
		System.out.println("请输入自定义套餐中的商品：");
		while(input.hasNext()) {
			String str = input.nextLine();
			if(str.equals("end")) {
				break;
			}
			meal.addItem(item_factory.getItem(str));
		}
		input.close();
		return meal;
	}
}
