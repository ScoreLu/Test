package com_9_17;

import java.util.Scanner;

public class Text {

	public static void main(String[] args)throws Exception {
    SqList L=new SqList(8);
    Scanner sc=new Scanner(System.in);
    String item;
    for(int i=0;i<5;i++){
    System.out.println("˳����"+i+"��Ԫ���ǣ�");
    item=sc.next();
    L.insert(i, item);
        }
    System.out.println("˳����ʼ����ɣ�");
    menu();
    int op;
    do{
    	System.out.println("-------------");	
    	System.out.println("����ѡ��˵�");	
    	System.out.println("1.�����");	
    	System.out.println("2.����Ԫ��");	
    	System.out.println("3.ɾ��Ԫ��");	
    	System.out.println("4.��λԪ��");	
    	System.out.println("5.ȡ��Ԫ��");	
    	System.out.println("6.��ʾ���Ա�");	
    	System.out.println("0.�˳�");	
    	System.out.println("���ߣ���贱�       �༶����6��");	
    	System.out.println("-------------");
    System.out.println("������������루0-�˳���:");
    op=sc.nextInt();
    switch(op){
    case 1:System.out.println("˳���ĳ���Ϊ��"+L.leangth());
    break;
    case 2:System.out.println("������Ҫ�����λ�ã�");
    int num=sc.nextInt();
    int loc=sc.nextInt();
    L.insert(loc=sc.nextInt(), num);
    System.out.println("��������ɹ�");
    break;
    case 3:System.out.println("������Ҫɾ����Ԫ�ص�λ�ã�");
    loc=sc.nextInt();
    L.remove(loc);
    System.out.println("ɾ�������ɹ�");
    break;
    case 4:System.out.println("������Ҫ���ҵ�Ԫ�أ�");
    num=sc.nextInt();
    System.out.println(num+"�ڱ��е�λ�ã�"+(L.indexOf(num)));
    break;
    case 5:System.out.println("������Ҫ����Ԫ�ص�λ�ã�");
    loc=sc.nextInt();
    System.out.println(loc+"λ���ϵ�Ԫ��Ϊ��"+L.get(loc));
    break;
    case 6:
    L.display();
    break;
    case 0:System.out.println("���������");
    return;
    default:System.out.println("����Ĳ�����������������ѡ��");    
}
	}while(op !=0);
    sc.close();

}

	private static void menu() {
		
	}
}
