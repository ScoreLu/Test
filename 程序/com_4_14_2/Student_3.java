package com_4_14_2;
	import java.util.Map;
	import java.util.HashMap;
	import java.util.Collection;
	import java.util.Iterator;
	import java.io.File;
	import java.io.OutputStream;
	import java.io.FileOutputStream;
	   class Student{
	   private int number;
	   private String name;
	   private float score;
	   public Student(int number,String name,float score){
	   this.setNumber(number);
	   this.setName(name);
	   this.setScore(score);
		}
		public void setNumber(int number){ 
	    this.number=number;
	    }

		public void setName(String name){ 
	   this.name=name;
	   } 

		public void setScore(float score){ 
	    this.score=score;
	    }

		public int getNumber(){ 
	   return this.number;
	   } 
	 
		public String getName(){ 
	      return this.name;
	      } 

		public float getScore(){ 
	      return this.score; 
	      }

		public String toString(){
		return "学号："+this.number+"姓名："+this.name+"分数："+this.score;
		}
		}
		public class Student_3 {
		public static void main(String[] args) throws Exception{
		File f=new File("D:"+File.separator+"student.txt");
		OutputStream out=new FileOutputStream(f);
		Student stu1=new Student(20080808, "张三", 95);
		Student stu2=new Student(20100203, "李四", 99);
		Student stu3=new Student(20071010, "王五", 98);
		Student stu4=new Student(20080113, "朱六", 93);
		Student stu5=new Student(20101030, "赵七", 96);
		Map<String,Student> map=new HashMap<String,Student>();
		map.put("1",stu1);
		map.put("2",stu2);
		map.put("3",stu3);
		map.put("4",stu4);
		map.put("5",stu5);
		String str=map.toString();
		byte b[]=str.getBytes();
		out.write(b);
		out.close();
		Student val=map.get("1");
		System.out.println("1号学生的信息是   "+val);
		System.out.println("全部的学生信息为：");
		Collection<Student> values=map.values();
		Iterator<Student> iter=values.iterator();
		while(iter.hasNext()){
		Student str1=iter.next();
		System.out.println(str1);
		}
		}
		}

