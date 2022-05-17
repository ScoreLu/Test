import java.util.Scanner;
public class Ko
{
	public static void main(String[] args) 
{      
	   Scanner sc = new Scanner(System.in);
	   int[] arr = {1,3,5,7,9,11,13,14,15,17,20};
	   int key= sc.nextInt();//输入第几个
	   System.out.println(koSeach(arr,key));//输出查找到的第几个，这个数
}
	  public static int koSeach(int[] arr,int key){
        int min,max,mid;
        min = 0;
        max = arr.length-1;
        mid = (max+min)/2; //(max+min)/2;中间数的值
        while(arr[mid]!=key){
            if(key>arr[mid]){
                min = mid + 1;
            }
            else if(key<arr[mid])
			{  max = mid - 1;}
            if(max<min)
			{  return -1;}//这个数不在数组中时
            mid = (max+min)>>1;    
        }
        return arr [mid];
    }
}
