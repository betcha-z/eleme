package cn.edu.hdu.storeProxy;

import java.util.ArrayList;
import java.util.Scanner;

import cn.edu.hdu.storeFactory.Store;
import cn.edu.hdu.storeFactory.StoreFactory;
import cn.edu.hdu.util.Buy;

public class Proxy implements Buy{
	
	private Store store;		//选择的商店对象
	private int storeChoice;	//所选商店编号
	private ArrayList<Double> condimentsChoices = new ArrayList<Double>();	//所选配料单
	private Scanner input = new Scanner(System.in);
	
	public Proxy(){
		showStoreInfo();				//显示主菜单（商店信息）
		getUserStoreInput();			//用户选择商店
		showCondimentInfo();			//显示所选商店的配料信息
		getUserCondimentInput();		//用户选择配料
		buy(condimentsChoices);			//购买指定商店的指定配料的商品
	}

	@Override
	public void buy(ArrayList<Double> condimentsChoices) {
		// TODO Auto-generated method stub
		store.buy(condimentsChoices);
	}
	
	private void showStoreInfo() {
		System.out.println("请输入你要的店铺(按-1退出)：");
		System.out.println("1. YiDianDian\n2. StarBucks");
	}
	
	private void getUserStoreInput() {
		while((storeChoice = input.nextInt())!=-1) {
			store = getStore();
			if(store == null) {
				System.out.println("Wrong input!!");
			}else {
				break;
			}
		}
		if(storeChoice==-1) {
			System.out.println("Welcome back!");
			System.exit(0);		
		}		
	}
	
	private Store getStore() {
		return StoreFactory.getStore(storeChoice);
	}
	
	private void showCondimentInfo() {
		System.out.println("请输入你要的配料(按-1退出)：");
		store.showCondimentInfo();
	}
	
	private void getUserCondimentInput() {
		double condimentID;		//临时变量，记录用户所选配料ID
		while((condimentID = input.nextDouble())!=-1){
			if(store.isContain(condimentID)) {
				condimentsChoices.add(condimentID);
			}else {
				System.out.println("Wrong Input!");
			}
		}
	}

}
