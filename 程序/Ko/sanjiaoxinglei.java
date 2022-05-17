package Ko;
import java.util.Scanner;
public class sanjiaoxinglei {
public static void main(String[] args){
double a, b, c;  //三角形三条边
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
System.out.println("请输入三角形的三条边长（回车键输入下一位）：");
a = sc.nextDouble();
b = sc.nextDouble();
c = sc.nextDouble();
Triangle angle = new Triangle(a, b, c);
 if(angle.isTriangle()){
 System.out.println("三角形的周长是：" + angle.pereTriangle());
 System.out.println("三角形的面积是：" + angle.areaTriangle());
}else
System.out.println("这三个边长不能组成三角形:" + a + "  " + b + "  " + c);
		    }   
		}
		 
		class Triangle{
		    private double a, b, c;
		    public Triangle(double a, double b, double c){
		        this.a = a; 
		        this.b = b;
		        this.c = c;
		    }
		     
		    public boolean isTriangle(){
		        if( a + b > c && a + c > b &&  b + c > a){ return true;}
		        else
		            return false;
		    }
		     
		    public double pereTriangle(){
		        return a + b + c;
		    }
		     
		    public double areaTriangle(){
		        double area = 0.0, temp = 0.0;
		        temp = 0.5 * (a + b + c);
		        area =  Math.sqrt(temp * (temp -a) * (temp -b) * (temp -c));
		        return area;
		    }
		}
		