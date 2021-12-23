package cn.edu.hdu.store.starbucks;

import java.util.ArrayList;
import java.util.HashMap;

import cn.edu.hdu.store.ydd.MilkTea;
import cn.edu.hdu.store.ydd.Pudding;
import cn.edu.hdu.store.ydd.RedBean;
import cn.edu.hdu.store.ydd.YiDianDian;
import cn.edu.hdu.store.ydd.ZhenBoYe;
import cn.edu.hdu.storeFactory.Store;
import cn.edu.hdu.util.Drink;

public class StarBucks extends Store {
	
	private static StarBucks stb = new StarBucks();
	private PriceServerStrategy pss = new PriceServerStrategy();
	
	private StarBucks(){
		defaultDrink = new Coffee();
		condiments = new HashMap<Double, Drink>();
		condiments.put(Double.valueOf(2.1),new Espresso());
		condiments.put(Double.valueOf(2.2),new Latte());
		condiments.put(Double.valueOf(2.3),new Sugar());
		condiments.put(Double.valueOf(2.4),new Milk());
	}
	
	public static StarBucks getInstance(){
		return stb;
	}
	
	public void buy(ArrayList<Double> condimentsChoices) {
		String test = pss.calPrice(condimentsChoices);
		String[] result = test.split(",");
		System.out.println("您购买的咖啡是：	"+result[0]);
		System.out.println("共计消费：	"+result[1]);	
	}
}