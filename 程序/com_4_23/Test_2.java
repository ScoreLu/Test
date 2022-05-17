package com_4_23;

import java.util.HashSet;

public class Test_2 {


	public static void main(String[] args) {
    HashSet<String> hs=new HashSet<>();
    //
    boolean b1=hs.add("a");
    System.out.println(b1);		
    System.out.println("容量:"+hs.size());		
    hs.add("b");
    hs.add("w");
    String s="ZZZZZZXaaa";
    hs.add(s);
    hs.add("A");
    System.out.println("容量:"+hs.size());		
    System.out.println(hs.toString());
    
    //
    hs.add(s);
    boolean b2=hs.add("a");
    System.out.println(b2);
    System.out.println("容量:"+hs.size());		
    System.out.println(hs.toString());
    hs.remove("A");
    System.out.println("容量:"+hs.size());		
    System.out.println(hs.toString());
    
    hs.remove("A");
    System.out.println("容量:"+hs.size());		
    System.out.println(hs.toString());
    
    boolean b3=hs.contains(s);
    System.out.println(b3);
    
	}
}
