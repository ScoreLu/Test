package com_4_2;
import java.util.Arrays;
public class Test_2 {

	public static void main(String[] args) {
		int [] array=new int[5];//0 1 2 3 4
		Arrays.fill(array, 8);//������ķ�������̬������Ϊ�������Ԫ��
	//for(int i=0;i<array.length;i++){
	//System.out.println("��������ĵ�"+i+"��Ԫ��="+array[i]);
	//}	
    try{
    	for(int i=0;i<7;i++){//0-6
    		System.out.println("��������ĵ�"+i+"��Ԫ��="+array[i]/0);	
    	}
    }catch(ArithmeticException e){
    	System.out.println("�����쳣"+e.getMessage());	
    }catch(Exception e){
    System.out.println("�����쳣"+e.getMessage());	
}for(int i:array){
	System.out.println(i);
}
	}
}
