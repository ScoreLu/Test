public class Test {
public static void main(String[] args) {
int i,j,k;
for(i=0;i<4;i++)
//变量i是代表行，j表示每行输出空格的个数，k表示每行输出的*；
{
for(j=0;j<=2-i;j++)
System.out.print(" ");
for(k=0;k<=2*i;k++)
System.out.print("*");
System.out.println();
}
}
}
