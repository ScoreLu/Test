package com_4_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_1 {

	public static void main(String[] args) {
	//����ArrayList
	List<String> list=new ArrayList<String>();
	System.out.println("����:"+list.size());
	
	//���Ԫ��
	list.add("��");
	System.out.println("����:"+list.size());
	list.add("��");
	list.add("��");
	list.add("��");
	list.add("��");
	list.add("��");
	System.out.println("����:"+list.size());
	System.out.println(list.toString());
	list.add(1,"��");
	System.out.println(list.toString());
	
	//�޸�
	list.set(3, "��");
	System.out.println(list.toString());
	
	//��ȡ
	String s=list.get(0);
	System.out.println(s);
	
	boolean b1=list.isEmpty();
	System.out.println(b1);
	
	boolean b2=list.contains("��");
	System.out.println(b2);
	
	for(String string : list){
	System.out.println(string);	
	}
	//������
	Iterator<String> iter=list.iterator();
	while(iter.hasNext()){
		String next=iter.next();
		System.out.println(next);
	}
	
	list.remove(6);
	System.out.println(list.toString());
	}
}
