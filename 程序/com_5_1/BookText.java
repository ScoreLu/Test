package com_5_1;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class BookText {
 
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		int id;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Book bk1 = new Book("Java", 1);
		Book bk2 = new Book("高数", 2);
		Book bk3 = new Book("英语", 3);
		@SuppressWarnings({ })
		List<Book> id1 = new ArrayList();  //创建书目编号对应的集合
		id1.add(bk1);
		List id2 = new ArrayList();
		id2.add(bk2);
		List id3 = new ArrayList();
		id3.add(bk3);
		Map bk = new HashMap();//创建HashMap对象
		bk.put(1, id1);           //将对应编号的书目加入对应的集合
		bk.put(2, id2);
		bk.put(3, id3);
		System.out.println("请输入书本编号");
		id = input.nextInt();
		System.out.println(bk.get(id));//得到key=id时的value
	}
 
}

