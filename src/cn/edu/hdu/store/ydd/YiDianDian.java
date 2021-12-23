package cn.edu.hdu.store.ydd;

import java.util.ArrayList;
import java.util.HashMap;

import cn.edu.hdu.storeFactory.Store;
import cn.edu.hdu.util.Drink;

public class YiDianDian extends Store{
	
	private static YiDianDian ydd = new YiDianDian();
	private PriceServerDecorator psd = new PriceServerDecorator();
	
	//初始化商店的配料信息
	private YiDianDian() {
		defaultDrink = new MilkTea();
		condiments = new HashMap<Double, Drink>();
		condiments.put(Double.valueOf(1.1),new Pudding(new Drink()));
		condiments.put(Double.valueOf(1.2),new RedBean(new Drink()));
		condiments.put(Double.valueOf(1.3),new ZhenBoYe(new Drink()));
	}
	
	public static YiDianDian getInstance(){
		return ydd;
	}
	
	public void buy(ArrayList<Double> condimentsChoices) {
		String test = psd.calPrice(condimentsChoices);
		String[] result = test.split(",");
		System.out.println("您购买的奶茶是：	"+result[0]);
		System.out.println("共计消费：	"+result[1]);	
	}

}
