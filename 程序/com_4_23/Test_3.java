package com_4_23;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test_3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
    //���������
	@SuppressWarnings("unchecked")
	List<Integer> list=new ArrayList();
	for(int i = 0;i < 10;i++){
		Random r=new Random();
		int n=r.nextInt(100);
		list.add(n);
	}
     System.out.println("δ����ǰ��"+list.toString());
     //Bubbleð�ݷ�
     for (int i = 0; i < list.size() - 1; i++) {  
         for (int j = 1; j < list.size() - i; j++) {  
             Integer a;  
     if ((list.get(j - 1)).compareTo(list.get(j)) > 0) { // �Ƚ����������Ĵ�С  
    	  
         a = list.get(j - 1);  
         list.set((j - 1), list.get(j));  
         list.set(j, a);    
	}
   }
     }
     for(Integer s: list){
     System.out.println(s.intValue());
     }
	}
}
