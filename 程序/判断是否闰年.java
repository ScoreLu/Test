import java.util.Scanner;
public class Test{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.print("请输入年数");
    int year=scan.nextInt();
    if(year%4==0 && year%100!=0){
       System.out.print("是闰年");
    }else 
    if(year%400==0){
        System.out.print("是闰年");
    }else 
    {
         System.out.print("不是闰年");
    }
}
}
