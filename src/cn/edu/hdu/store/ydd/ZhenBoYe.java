package cn.edu.hdu.store.ydd;

import cn.edu.hdu.util.Drink;

public class ZhenBoYe extends CondiementDecorator {

	// 初始化配料的名称和价格
	public ZhenBoYe(Drink drink) {
		super(drink);
		this.name = drink.getName()+"+珍波椰";
		this.cost = drink.getPrice()+6.0D;
	}
}
