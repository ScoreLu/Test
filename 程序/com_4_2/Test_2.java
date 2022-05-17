package com_4_2;
import java.util.Arrays;
public class Test_2 {

	public static void main(String[] args) {
		int [] array=new int[5];//0 1 2 3 4
		Arrays.fill(array, 8);//数组类的方法，静态方法，为数组填充元素
	//for(int i=0;i<array.length;i++){
	//System.out.println("这是数组的第"+i+"个元素="+array[i]);
	//}	
    try{
    	for(int i=0;i<7;i++){//0-6
    		System.out.println("这是数组的第"+i+"个元素="+array[i]/0);	
    	}
    }catch(ArithmeticException e){
    	System.out.println("算术异常"+e.getMessage());	
    }catch(Exception e){
    System.out.println("算术异常"+e.getMessage());	
}for(int i:array){
	System.out.println(i);
}
	}
}
