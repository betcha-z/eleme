package cn.edu.hdu.store.starbucks;

import java.util.ArrayList;
import java.util.Iterator;

import cn.edu.hdu.store.ydd.Pudding;
import cn.edu.hdu.store.ydd.RedBean;
import cn.edu.hdu.store.ydd.YiDianDian;
import cn.edu.hdu.store.ydd.ZhenBoYe;
import cn.edu.hdu.util.CalPriceSystem;
import cn.edu.hdu.util.Drink;

public class PriceServerStrategy implements CalPriceSystem {
	
	private Drink condiment;
	private double totalPrice = 0.0D;
	private String productInfo = "";
	
	private void setCondiement(Drink drink) {
		condiment = drink;
	}
	
	private void execute() {
		this.totalPrice += condiment.getPrice();
		productInfo = productInfo + " " + condiment.getName();
	}

	@Override
	public String calPrice(ArrayList<Double> condiments) {
		// TODO Auto-generated method stub
		Drink cf = StarBucks.getInstance().getDefaultDrink();
		setCondiement(cf);
		execute();
		Iterator<Double> it = condiments.iterator();
		double choice;		//临时变量
		while(it.hasNext()) {
			choice = ((Double)it.next()).doubleValue();
			if(choice==2.1) {
				setCondiement(new Espresso());
			}
			if(choice==2.2) {
				setCondiement(new Latte());
			}
			if(choice==2.3) {
				setCondiement(new Sugar());
			}
			if(choice==2.4) {
				setCondiement(new Milk());
			}
			execute();
		}
		String result = new StringBuilder().append(this.productInfo)
				.append(",").append(this.totalPrice).toString();
		return result;
	}
}
