package com_3_26;

import java.util.*;
public class TestMC {
	private static Scanner scanner;

	public static void main(String[] args) {
		try{
			System.out.println("====�ɼ�ͳ��====");
			scanner = new Scanner(System.in);
			Scanner scan=scanner.useDelimiter("\r\n");
//ɨ��������ɨ��������Իس�������Ϊ�ָ������ų�Ĭ�ϵĿո��������ɨ�����ݰ����ո�
			System.out.println("������Ҫ�����һϵ������(���ŷָ�):");
			String str=scan.next();  //����һ�У���1��2��3��5��6��4
			String[] strArray=str.split(",");//��1��            ;
			double[] doubleArray=new double[strArray.length];
			for(int i=0;i<strArray.length;i++){
				doubleArray[i]=  Double.parseDouble(strArray[i]);//��2�����ַ�������ת��Ϊdouble������
			}
			Arrays.sort(doubleArray);//��3����������
			System.out.println("���������������ݣ�"+Arrays.toString (doubleArray)  );//��4��
			 
		}
		catch(Exception e){
			System.out.println("�쳣��"+e.getMessage());
		}
	}
}