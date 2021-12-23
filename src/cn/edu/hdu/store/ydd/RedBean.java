package cn.edu.hdu.store.ydd;

import cn.edu.hdu.util.Drink;

public class RedBean extends CondiementDecorator {

	// 初始化配料的名称和价格
	public RedBean(Drink drink) {
		super(drink);
		this.name = drink.getName()+"+红豆";
		this.cost = drink.getPrice()+4.0D;
	}
}
