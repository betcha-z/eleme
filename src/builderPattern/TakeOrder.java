package builderPattern;

public class TakeOrder {
	public static void TakeOrder(String[] args) {
		//创建建造者对象
		MealBuilder mealBuilder = new MealBuilder();
		System.out.println("欢迎来到肯德基，请点餐：");
		//通过建造者创建套餐A对象
		Meal meal_A = mealBuilder.mealA();
		System.out.println("显示固定套餐 Meal A 的相关信息");
		meal_A.showItems();
		System.out.println("总价: " + meal_A.getCost());
		
		//通过建造者创建套餐B对象
		Meal meal_B = mealBuilder.mealB();
		System.out.println("显示固定套餐 Meal B 的相关信息");
		meal_B.showItems();
		System.out.println("总价: " + meal_B.getCost());

		//通过建造者创建套餐B对象
		Meal meal_C = mealBuilder.mealC();
		System.out.println("显示固定套餐 Meal C 的相关信息");
		meal_C.showItems();
		System.out.println("总价 " + meal_C.getCost());


		//通过建造者创建自定义套餐对象
		Meal customer_meal = mealBuilder.customizeMeal();
		System.out.println("Customer Meal");
		customer_meal.showItems();
		System.out.println("总价: " + customer_meal.getCost());
	}
}
