package cn.edu.hdu.store.ydd;

import cn.edu.hdu.util.Drink;

public class Pudding extends CondiementDecorator {

	//被装饰的对象drink
	public Pudding(Drink drink){
		super(drink);
		this.name = drink.getName()+"+布丁";
		this.cost = drink.getPrice()+3.0D;
	}
}
