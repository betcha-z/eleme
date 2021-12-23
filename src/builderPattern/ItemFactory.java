package builderPattern;

public class ItemFactory {
	//获取实体
	public Item getItem(String name) {
		if (name.equalsIgnoreCase("香辣鸡腿堡")) {
			System.out.println("选择一份香辣鸡腿堡");
			return new BurgerA();
		}else if (name.equalsIgnoreCase("新奥尔良汉堡")) {
			System.out.println("选择一份新奥尔良汉堡");
			return new BurgerB();
		}else if (name.equalsIgnoreCase("老北京鸡肉卷")) {
			System.out.println("选择一份老北京鸡肉卷");
			return new BurgerC();
		}else if (name.equalsIgnoreCase("百事可乐")) {
			System.out.println("选择一杯百事可乐");
			return new DrinkA();
		}else if (name.equalsIgnoreCase("雪顶咖啡")) {
			System.out.println("选择一杯雪顶咖啡");
			return new DrinkB();
		}else if (name.equalsIgnoreCase("九珍果汁饮料")) {
			System.out.println("选择一杯九珍果饮料汁");
			return new DrinkC();
		}
		System.out.println("没有该商品");
		return null;
	}
}
