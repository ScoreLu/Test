package com_4_27;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test_3 {
		public static void main(String[] args) {
		// 2.����HashMapkey������������,value�������۸�
		HashMap<Car, Integer> map = new HashMap<>();

		// 3.���������HashMap��
		Car c1 = new Car("����", "��ɫ");
		Car c2 = new Car("����", "��ɫ");
		Car c3 = new Car("��ɯ", "��ɫ");
		Car c4 = new Car("����", "��ɫ");
		map.put(c1, 10000);
		map.put(c2, 20000);
		map.put(c3, 30000);
		map.put(c4, 40000);
	  
		Set<Car> keySet = map.keySet();
		for (Car c : keySet) {
		// ����key��ȡvalue
		Integer value = map.get(c);
		            System.out.println("Ʒ�ƣ�"+c.getCarbrand() + "��ɫ��"+ c.getCarcolor() + " �۸� "+ value);
		        }
		        System.out.println("����Ϊʹ��keySet��ʽ����Map");
		        System.out.println("����Ϊʹ��entrySet��ʽ����Map");
		
		        Set<Map.Entry<Car, Integer>> entrySet = map.entrySet();
		for (Map.Entry<Car, Integer> entry : entrySet) {
		            Car key = entry.getKey();
		            Integer value = entry.getValue();
		            System.out.println("Ʒ�ƣ�"+key.getCarbrand() + "��ɫ��"+ key.getCarcolor() + " �۸� "+ value);
		        }
		    }
		}
