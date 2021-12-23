package cn.edu.hdu.storeFactory;

import cn.edu.hdu.store.starbucks.StarBucks;
import cn.edu.hdu.store.ydd.YiDianDian;

public class StoreFactory {
	
	//商店工厂根据指定的商店ID获取商店实例
	public static Store getStore(int storeChoice){
		if(storeChoice==1){
			return YiDianDian.getInstance();
		}
		else if(storeChoice==2){
			return StarBucks.getInstance();
		}
		return null;
	}
}
