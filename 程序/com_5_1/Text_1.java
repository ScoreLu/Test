package com_5_1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Text_1 {

	public static void main(String[] args) {
	//���塢��������<k,v>
    Map<String,Integer> map = new HashMap<>();
	//��С
    System.out.println(map.size());
    //���
    System.out.println(map.size());
    System.out.println("put"+map.put("�ŷ�",17));
    //�滻��ԭ�е�
    System.out.println("put"+map.put("�ŷ�",18));
    System.out.println(map.size());
    System.out.println(map);
    
    map.put("����",30);
    map.put("����",20);
    map.put("����2",30);
    map.put("����2",20);
    System.out.println(map);
    //ɾ�������ݼ�ɾ��������ֵ��v
    System.out.println(map.remove("����"));
    //map.clear();
    boolean b1=map.containsKey("�ŷ�");
    System.out.println(b1);
    
    boolean b2=map.containsValue(100);
    System.out.println(b2);
    
    Set<String> keyset=map.keySet();//��ȡ���м��ļ���
    Iterator <String>it=keyset.iterator();//��ȡ������
    while(it.hasNext()){
    	String k=it.next();
    	Integer v=map.get(k);
    	System.out.println(k+"="+v+"*****");
    }for(String k : map.keySet()){
    	System.out.println(k+"="+map.get(k)+"*****");
    }
    //Map.Entry<k,v>Map���ڲ��ṹ����map�Ķ�Ԫ�飬��װ��Entry����,�����Set������
    Set<Map.Entry<String,Integer>> enset=map.entrySet();//��ȡ��ֵ����
    Iterator<Map.Entry<String,Integer>>it1= enset.iterator();//��ȡ������
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
