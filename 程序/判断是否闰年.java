import java.util.Scanner;
public class Test{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("����������");
    int year=scan.nextInt();
    if(year%4==0 && year%100!=0){
       System.out.print("������");
    }else 
    if(year%400==0){
        System.out.print("������");
    }else 
    {
         System.out.print("��������");
    }
}
}
