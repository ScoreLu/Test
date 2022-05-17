package com_4_9;
import java.io.Serializable;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id ;
	String name;
	int age;
	String department;
	public  Student(int id,String name,int age,String department){
		this.id = id;
		this.name = name;
		this.age = age;
		this.department = department;
	}
}
