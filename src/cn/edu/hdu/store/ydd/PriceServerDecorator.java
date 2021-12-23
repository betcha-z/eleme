package cn.edu.hdu.store.ydd;

import java.util.ArrayList;
import java.util.Iterator;

import cn.edu.hdu.util.CalPriceSystem;
import cn.edu.hdu.util.Drink;

public class PriceServerDecorator implements CalPriceSystem{

	@Override
	public String calPrice(ArrayList<Double> condiments) {
		// TODO Auto-generated method stub
		Drink mt = YiDianDian.getInstance().getDefaultDrink();
		Iterator<Double> it = condiments.iterator();
		double choice;		//临时变量
		while(it.hasNext()) {
			choice = ((Double)it.next()).doubleValue();
			if(choice==1.1) {
				mt = new Pudding(mt);
			}
			if(choice==1.2) {
				mt = new RedBean(mt);
			}
			if(choice==1.3) {
				mt = new ZhenBoYe(mt);
			}
		}
		String productInfo = new StringBuilder().append(mt.getName())
				.append(",").append(mt.getPrice()).toString();
		return productInfo;
	}
}
