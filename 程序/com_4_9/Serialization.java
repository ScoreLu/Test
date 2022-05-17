package com_4_9;

import java.beans.Statement;
import java.io.*;
@SuppressWarnings("unused")
public class Serialization{
	/*
	 * 创建一个序列化的学生对象，并用ObjectOutputStream类把它存储到一个文件（students.txt）中，然后再用ObjectInputStream类把存储的数据读取到一个学生对象中，即恢复保存的学生对象
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//创建学生对象
		Student stu1 = new Student(001,"张三",19,"计算机科学与技术");
		Student stu2 = new Student(002,"李四",18,"软件工程");
		//将学生对象写入到文件中
		FileOutputStream fos = new FileOutputStream("students.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stu1);
		oos.writeObject(stu2);
		oos.close();

		//从文件中读取存入的学生对象
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


