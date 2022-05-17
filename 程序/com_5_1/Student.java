package com_5_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

	public class Student {
		 
		String name;
		int age;
		
		
		public Student() {
			super();
		}
		
		
		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
	 
	 
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}
	
	public static void main(String[] args){
		Map<Student, String> map = new HashMap<>();
		inputMap(map);		
		bianli01(map);
		bianli02(map);
	}
	public static void inputMap(Map<Student, String> map) {
		Student stu = new Student();
		stu.setName("赵云");
		stu.setAge(20);
		map.put(stu, "四川");
		Student stu1 = new Student();
		stu1.setName("张飞");
		stu1.setAge(18);		
		map.put(stu1, "广东");
		Student stu2 = new Student();
		stu2.setName("刘备");
		stu2.setAge(19);		
		map.put(stu2, "北京");
	}


public static void bianli02(Map<Student, String> map) {
	Set<Entry<Student, String>> entrySet = map.entrySet();
	for(Entry<Student, String> entry : entrySet){
		System.out.println(entry.getKey()+":"+entry.getValue());
	}
}

public static void bianli01(Map<Student, String> map) {
	Set<Student> set = map.keySet();
	for(Student student: set){
		System.out.println(student+":"+map.get(student));
	}
}

}