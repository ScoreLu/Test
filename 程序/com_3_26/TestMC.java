package com_3_26;

import java.util.*;
public class TestMC {
	private static Scanner scanner;

	public static void main(String[] args) {
		try{
			System.out.println("====成绩统计====");
			scanner = new Scanner(System.in);
			Scanner scan=scanner.useDelimiter("\r\n");
//扫描器对象扫描的内容以回车换行作为分隔符，排除默认的空格，因而允许扫描内容包含空格
			System.out.println("请输入要计算的一系列数据(逗号分隔):");
			String str=scan.next();  //输入一行，如1，2，3，5，6，4
			String[] strArray=str.split(",");//（1）            ;
			double[] doubleArray=new double[strArray.length];
			for(int i=0;i<strArray.length;i++){
				doubleArray[i]=  Double.parseDouble(strArray[i]);//（2）将字符串数组转换为double型数组
			}
			Arrays.sort(doubleArray);//（3）数组排序
			System.out.println("按升序排序后的数据："+Arrays.toString (doubleArray)  );//（4）
			 
		}
		catch(Exception e){
			System.out.println("异常："+e.getMessage());
		}
	}
}