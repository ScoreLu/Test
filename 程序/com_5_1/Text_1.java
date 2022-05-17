package com_5_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Text_1 {

	public static void main(String[] args) {
	//定义、并事例化<k,v>
    Map<String,Integer> map = new HashMap<>();
	//大小
    System.out.println(map.size());
    //添加
    System.out.println(map.size());
    System.out.println("put"+map.put("张飞",17));
    //替换掉原有的
    System.out.println("put"+map.put("张飞",18));
    System.out.println(map.size());
    System.out.println(map);
    
    map.put("黄忠",30);
    map.put("赵云",20);
    map.put("黄忠2",30);
    map.put("赵云2",20);
    System.out.println(map);
    //删除，根据键删除，返回值是v
    System.out.println(map.remove("黄忠"));
    //map.clear();
    boolean b1=map.containsKey("张飞");
    System.out.println(b1);
    
    boolean b2=map.containsValue(100);
    System.out.println(b2);
    
    Set<String> keyset=map.keySet();//获取所有键的集合
    Iterator <String>it=keyset.iterator();//获取迭代器
    while(it.hasNext()){
    	String k=it.next();
    	Integer v=map.get(k);
    	System.out.println(k+"="+v+"*****");
    }for(String k : map.keySet()){
    	System.out.println(k+"="+map.get(k)+"*****");
    }
    //Map.Entry<k,v>Map的内部结构，把map的二元组，封装成Entry对象,存放在Set集合里
    Set<Map.Entry<String,Integer>> enset=map.entrySet();//获取键值对象
    Iterator<Map.Entry<String,Integer>>it1= enset.iterator();//获取迭代器
    while(it1.hasNext()){
    	Map.Entry<String,Integer> en=it1.next();
    	String key=en.getKey();
    	Integer v=en.getValue();
    	System.out.println(key+"="+v+"$$$$$");
    }for(Entry<String, Integer> en : map.entrySet()){
    	System.out.println(en.getKey()+"="+en.getValue()+"$$$$$");
    }
	}

}
