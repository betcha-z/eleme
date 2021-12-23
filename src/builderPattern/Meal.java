package builderPattern;

import sun.plugin2.util.NativeLibLoader;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	//套餐内的商品列表
	private List<Item> items = new ArrayList<Item>();
	//增加商品
	public void addItem(Item item) {
		items.add(item);
	}
	//计算套餐价格
	public float getCost() {
		float cost = 0.0f;
		try{
			for (Item item : items) {
				cost += item.price();
			}
		}catch (NullPointerException e){ //捕获输入错误创建的null异常
		}
		return cost;
	}
	//显示套餐信息
	public void showItems() {
		try{
			for (Item item : items) {
				System.out.print("名称 : " + item.name());
				System.out.println(", 价格: " + item.price());
			}
		}catch (NullPointerException e){ //捕获输入错误创建的null异常
		}
	}
}
