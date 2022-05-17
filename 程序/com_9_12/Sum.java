package com_9_12;

public class Sum {
public  static void main(String[] args){

}
float polynomial(int n, int a[], float x) { 
	int i=0; float j=1;
	float sum=0; //1
	for(;i<=n;i++,j=j*x)
{ 
	sum=sum+a[i]*j;
} 
return sum; 
}
}