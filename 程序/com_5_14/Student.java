package com_5_14;
public class Student {
private String iD;
private String name;
private String sex;
private int age;
public String getID() {
	return iD;
}
public void setID(String iD) {
	this.iD = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Student(String iD,String name,String sex,int age) {
	super();
	this.iD=iD;
	this.name=name;
	this.sex=sex;
	this.age=age;
	
}

public Student() {
	// TODO �Զ����ɵĹ��캯�����
}
@Override
public String toString() {
	return this.iD+" "+this.name+" "+this.sex+" "+this.age;
}

}