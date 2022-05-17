package com_4_27;

import java.util.HashMap;
import java.util.Map;
public class Text_1 {
public static void main(String[] args) {
Map<Integer, String> map = new HashMap<Integer, String>();
map.put(1, "张三丰");
map.put(2, "周芷若");
map.put(3, "汪峰");
map.put(4, "灭绝师太");
map.put(5, "李晓红");
System.out.println(map);
map.remove(1, "张三丰");
System.out.println(map);
map.put(2, "周林");
System.out.println(map);
}
}

      

