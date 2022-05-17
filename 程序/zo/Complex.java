package zo;

public class Complex {
private double a;//Êµ²¿
private double b;//Ğé²¿
public Complex( double a,  double b){
	this.a=a;
	this.b=b;
}
public Complex add(Complex i){
	return new Complex(a+i.a,b+i.b);
}
public String toString(){
	String rtr_str ="";
	if(b>0)
		rtr_str ="("+a+"+"+b+"i"+")";
	if(b==0)
		rtr_str ="("+a+")";
	if(b<0)
		rtr_str ="("+a+b+"i"+")";
	return rtr_str;
}
	public static void main(String[] args) {
	Complex c=new Complex(2,3);
	Complex d=new Complex(4,5);
	System.out.println(c+"+"+d+"="+c.add(d));
}
}