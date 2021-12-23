package cn.edu.hdu.store.ydd;

import cn.edu.hdu.util.Drink;

public class CondiementDecorator extends Drink {

	protected Drink drink;
	public CondiementDecorator(Drink drink){
		this.drink = drink;
	}
}
