import java.util.Scanner;
public class Ko
{
	public static void main(String[] args) 
{      
	   Scanner sc = new Scanner(System.in);
	   int[] arr = {1,3,5,7,9,11,13,14,15,17,20};
	   int key= sc.nextInt();//����ڼ���
	   System.out.println(koSeach(arr,key));//������ҵ��ĵڼ����������
}
	  public static int koSeach(int[] arr,int key){
        int min,max,mid;
        min = 0;
        max = arr.length-1;
        mid = (max+min)/2; //(max+min)/2;�м�����ֵ
        while(arr[mid]!=key){
            if(key>arr[mid]){
                min = mid + 1;
            }
            else if(key<arr[mid])
			{  max = mid - 1;}
            if(max<min)
			{  return -1;}//���������������ʱ
            mid = (max+min)>>1;    
        }
        return arr [mid];
    }
}
