package com_4_25;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("输入要统计的英语句子");
	String str = sc.nextLine();
	String [] strs = str.split("");
	Map<String,Integer> map = new HashMap<String,Integer>();
	for(int i = 0;i < strs.length;i++){
		int sum = 0;
	for(int j = 0;j < strs.length;j++){
	if(strs[i].contentEquals(strs[j]))
		sum++;
	}
	map.put(strs[i],sum);
	}
	sc.close();
	Set<String> set = map.keySet();
	for(String ob : set){
		System.out.println(ob+"="+map.get(ob));
	}
	}

	}


