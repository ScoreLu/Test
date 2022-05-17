package Ko;
public class Juxing {
private int chang,kuan;
public Juxing(int chang,int kuan)
{
	this.chang=chang;
	this.kuan=kuan;
}
public int area()
{
return chang*kuan;
}
public static void main(String[]args)
{Juxing j= new Juxing(20,10);
int n=j.area();
System.out.println("矩形的面积是:"+n);
}
}
 