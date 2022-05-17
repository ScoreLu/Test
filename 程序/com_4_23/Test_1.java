package com_4_23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test_1 {

	public static void main(String[] args) {
	//创建ArrayList
	List<String> list=new ArrayList<String>();
	System.out.println("容量:"+list.size());
	
	//添加元素
	list.add("我");
	System.out.println("容量:"+list.size());
	list.add("爱");
	list.add("你");
	list.add("中");
	list.add("国");
	list.add("！");
	System.out.println("容量:"+list.size());
	System.out.println(list.toString());
	list.add(1,"们");
	System.out.println(list.toString());
	
	//修改
	list.set(3, "您");
	System.out.println(list.toString());
	
	//获取
	String s=list.get(0);
	System.out.println(s);
	
	boolean b1=list.isEmpty();
	System.out.println(b1);
	
	boolean b2=list.contains("！");
	System.out.println(b2);
	
	for(String string : list){
	System.out.println(string);	
	}
	//迭代器
	Iterator<String> iter=list.iterator();
	while(iter.hasNext()){
		String next=iter.next();
		System.out.println(next);
	}
	
	list.remove(6);
	System.out.println(list.toString());
	}
}
