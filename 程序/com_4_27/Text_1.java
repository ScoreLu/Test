package com_4_27;

import java.util.HashMap;
import java.util.Map;
public class Text_1 {
public static void main(String[] args) {
Map<Integer, String> map = new HashMap<Integer, String>();
map.put(1, "������");
map.put(2, "������");
map.put(3, "����");
map.put(4, "���ʦ̫");
map.put(5, "������");
System.out.println(map);
map.remove(1, "������");
System.out.println(map);
map.put(2, "����");
System.out.println(map);
}
}

      

