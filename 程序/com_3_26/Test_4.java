package com_3_26;
public class Test_4 {
public static void main(String[] args) {
int[] balls = new int[33];//����һ��int���͵�һά����balls����������33������ı��
            for(int i=0;i<33;i++){//���ɵ�6��������벻�ظ����ִ�С�ڣ�01-33��֮��
            balls[i]=i+1;
            }
            int[] arr=new int[7];   //��Ż�ѡ���������
            int j=0;
            boolean[] flags = new boolean[33];//����һ��boolean���͵�һά����flags����������33�������״̬��Ĭ��ȫ��Ϊfalse
            int index;//�����������ʹ��index��������
            for(int i=0;i<6;i++){//��Ҫȡ6�κ���ѭ��������֪������ʹ��forѭ��ʵ�֣�
                do{
                    index = (int)(Math.random()*33+1);
                    if(flags[index]==false){
                        // System.out.print(balls[index]+"  ");     //����
                    	arr[j++]=balls[index];
                        flags[index]=true;//��ζ�ű�ŵ���balls[index]����������Ѿ���ȡ������
                        break;
                  }
                }while(flags[index]); 
                
            }
            arr[6]=(int)(Math.random()*16+1);// ����ֱ������һ��1-16�����������arr[6]��
         
         System.out.println("��ѡ����Ϊ�� ");
         for(int e:arr){
            System.out.print(e+" ");
         }
   }
}
