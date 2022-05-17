package com_4_9;

import java.beans.Statement;
import java.io.*;
@SuppressWarnings("unused")
public class Serialization{
	/*
	 * ����һ�����л���ѧ�����󣬲���ObjectOutputStream������洢��һ���ļ���students.txt���У�Ȼ������ObjectInputStream��Ѵ洢�����ݶ�ȡ��һ��ѧ�������У����ָ������ѧ������
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//����ѧ������
		Student stu1 = new Student(001,"����",19,"�������ѧ�뼼��");
		Student stu2 = new Student(002,"����",18,"�������");
		//��ѧ������д�뵽�ļ���
		FileOutputStream fos = new FileOutputStream("students.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stu1);
		oos.writeObject(stu2);
		oos.close();

		//���ļ��ж�ȡ�����ѧ������
		FileInputStream fis = new FileInputStream("students.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		stu1 = (Student)ois.readObject();
		stu2 = (Student)ois.readObject();
		ois.close();

		System.out.println("id:"+stu1.id);
		System.out.println("name:"+stu1.name);
		System.out.println("age:"+stu1.age);
		System.out.println("deparment:"+stu1.department);

		System.out.println("id:"+stu2.id);
		System.out.println("name:"+stu2.name);
		System.out.println("age:"+stu2.age);
		System.out.println("deparment:"+stu2.department);

	}

}


