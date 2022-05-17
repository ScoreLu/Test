package com_4_14;


import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

	@SuppressWarnings("unused")
	public class Student_2 {
		 public static void main(String[] args) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			list.add(70);
			list.add(90);
			list.add(60);
			list.add(80);
			test(list);
		}
	
		//传统方法处理集合
		public static void test(ArrayList<Integer> list) {
			int max = Integer.MIN_VALUE;//最高分,初始值设为Integer的最小值
			int total = 0;//总分
			for (int i = 0; i < list.size(); i++) {
				total += list.get(i);
				if (list.get(i) > max) {
					max = list.get(i);//替换掉最高分
				}
			}
			double average = total * 1.0 / list.size();// 用总分除以人数就是平均分
			System.out.println("最高分:" + max + " 平均分:" + average);
		}
	}