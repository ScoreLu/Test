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
	
		//��ͳ����������
		public static void test(ArrayList<Integer> list) {
			int max = Integer.MIN_VALUE;//��߷�,��ʼֵ��ΪInteger����Сֵ
			int total = 0;//�ܷ�
			for (int i = 0; i < list.size(); i++) {
				total += list.get(i);
				if (list.get(i) > max) {
					max = list.get(i);//�滻����߷�
				}
			}
			double average = total * 1.0 / list.size();// ���ֳܷ�����������ƽ����
			System.out.println("��߷�:" + max + " ƽ����:" + average);
		}
	}