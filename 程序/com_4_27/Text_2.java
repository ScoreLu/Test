package com_4_27;

import java.util.HashMap;
import java.util.Map;

public class Text_2 {

	public static void main(String[] args) {
	    String[] a={"������ʡ","�㽭ʡ","����ʡ","�㶫ʡ","����ʡ"};
	    String[] b={"������","����","�ϲ�","����","����"};
	    Map<String, String> map = new HashMap<>();
	    for (int i = 0; i <a.length ; i++) {
	        String aa=a[i];
	        String bb=b[i];
	        map.put(aa,bb);
	    }
	    System.out.println(map);
	}

	}
