package cn.edu.hdu.util;

public class Drink {
	//饮料的描述和单价
	protected String name = "";
	protected double cost;

	//计算饮料的价格，显示饮料的信息
	public double getPrice(){
		return this.cost;
	}
	public String getName(){
		return this.name;
	}
}
