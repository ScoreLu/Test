package com_9_12;

public class PolynomiaResult {
	public static double getpolymialResult(double[]a,double x){
		//a�Ƕ���ʽ�а�ָ���ݼ������ŵĸ���ϵ������	
		double result = 0;//1
		double powX =1;	//1��ʱ���������ڼ��ټ���x�ݵļ������
		for(int i = 0;i<a.length;i++){//n+1
			result +=a[i]*powX;//n
			powX *= x;//nƽ��
}
return result;
}
	public static void main(String[] args) {
		  double[] a = new double[] {1,2,3};
		  double x = 1;
		  System.out.println(getpolymialResult(a,x));
		 }
		}