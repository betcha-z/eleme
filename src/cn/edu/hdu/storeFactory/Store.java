package cn.edu.hdu.storeFactory;

import java.util.ArrayList;
import java.util.HashMap;

import cn.edu.hdu.util.Buy;
import cn.edu.hdu.util.Drink;

public class Store implements Buy{
	// 商店的配料单（hashmap实现，key是配料ID,value是配料名称）
	protected HashMap<Double, Drink> condiments;
	protected Drink defaultDrink;			//默认饮品：YiDianDian是奶茶；StarBucks是咖啡
	
	//显示商店的配料信息
	public void showCondimentInfo() {
		for (Double condimentID : condiments.keySet()) {
			System.out.printf("%.1f	%s%n", condimentID.doubleValue(), 
					condiments.get(condimentID).getName());
		}
	}
	
	//判断某个配料是否存在
	public boolean isContain(double condimentID) {
		if(condiments.containsKey(Double.valueOf(condimentID))) {
			return true;
		}
		return false;
	}
	
	//获取商店的默认饮料
	public Drink getDefaultDrink() {
		return defaultDrink;
	}

	@Override
	public void buy(ArrayList<Double> condimentsChoices) {
		// TODO Auto-generated method stub
		
	}
}
