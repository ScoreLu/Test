package com_4_27;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test_3 {
		public static void main(String[] args) {
		// 2.创建HashMapkey保存汽车对象,value是汽车价格
		HashMap<Car, Integer> map = new HashMap<>();

		// 3.添加汽车到HashMap中
		Car c1 = new Car("宝马", "黄色");
		Car c2 = new Car("奔驰", "黑色");
		Car c3 = new Car("玛莎", "白色");
		Car c4 = new Car("大众", "蓝色");
		map.put(c1, 10000);
		map.put(c2, 20000);
		map.put(c3, 30000);
		map.put(c4, 40000);
	  
		Set<Car> keySet = map.keySet();
		for (Car c : keySet) {
		// 根据key获取value
		Integer value = map.get(c);
		            System.out.println("品牌："+c.getCarbrand() + "颜色："+ c.getCarcolor() + " 价格： "+ value);
		        }
		        System.out.println("以上为使用keySet方式遍历Map");
		        System.out.println("以下为使用entrySet方式遍历Map");
		
		        Set<Map.Entry<Car, Integer>> entrySet = map.entrySet();
		for (Map.Entry<Car, Integer> entry : entrySet) {
		            Car key = entry.getKey();
		            Integer value = entry.getValue();
		            System.out.println("品牌："+key.getCarbrand() + "颜色："+ key.getCarcolor() + " 价格： "+ value);
		        }
		    }
		}
