package com_4_27;

import java.util.HashMap;
import java.util.Map;

public class Text_2 {

	public static void main(String[] args) {
	    String[] a={"黑龙江省","浙江省","江西省","广东省","福建省"};
	    String[] b={"哈尔滨","杭州","南昌","广州","福州"};
	    Map<String, String> map = new HashMap<>();
	    for (int i = 0; i <a.length ; i++) {
	        String aa=a[i];
	        String bb=b[i];
	        map.put(aa,bb);
	    }
	    System.out.println(map);
	}

	}
