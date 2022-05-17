package com_9_12;

public class PolynomiaResult {
	public static double getpolymialResult(double[]a,double x){
		//a是多项式中按指数递减次序存放的各项系数数组	
		double result = 0;//1
		double powX =1;	//1临时变量。用于减少计算x幂的计算次数
		for(int i = 0;i<a.length;i++){//n+1
			result +=a[i]*powX;//n
			powX *= x;//n平方
}
return result;
}
	public static void main(String[] args) {
		  double[] a = new double[] {1,2,3};
		  double x = 1;
		  System.out.println(getpolymialResult(a,x));
		 }
		}