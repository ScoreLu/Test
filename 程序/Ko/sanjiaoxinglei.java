package Ko;
import java.util.Scanner;
public class sanjiaoxinglei {
public static void main(String[] args){
double a, b, c;  //������������
@SuppressWarnings("resource")
Scanner sc = new Scanner(System.in);
System.out.println("�����������ε������߳����س���������һλ����");
a = sc.nextDouble();
b = sc.nextDouble();
c = sc.nextDouble();
Triangle angle = new Triangle(a, b, c);
 if(angle.isTriangle()){
 System.out.println("�����ε��ܳ��ǣ�" + angle.pereTriangle());
 System.out.println("�����ε�����ǣ�" + angle.areaTriangle());
}else
System.out.println("�������߳��������������:" + a + "  " + b + "  " + c);
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
		