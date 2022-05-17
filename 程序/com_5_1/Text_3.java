package com_5_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Text_3 {
	public static void main(String[] args) { 
			 List<String> list=new ArrayList<>();
					@SuppressWarnings("resource")
					Scanner sc = new Scanner(System.in);
			        System.out.println("请输入10个字符串：");
			        for (int i = 0; i < 10; i++) {
			        	 list.add(sc.nextLine());
			        }
			        for (int i = 0; i < list.size(); i++) {
			            System.out.println(list.get(i));
			        }int count = 1;// 默认出现的次数为1
					for (int i = 0; i < list.size(); i++) {
						count = 1;
						for (int j = i + 1; j < list.size(); j++) {
							if (list.get(i).equals(list.get(j))) {
								count++;// 次数+1
								list.remove(j);
								j--;
							}
						}
						System.out.println(list.get(i) + "名字出现了" + count);
					}	
			    }
			}
