package Ko;

public class person {
public String name;
public String sex;
public int age;

public person() {
}

public person(String name, int age) {
this.name = name;
this.age = age;
}

public void setSex(String sex) {
this.sex = sex;
}

public void print1() {
System.out.println("������" + this.name + " �Ա�" + this.sex + " ���䣺"
+ this.age);
}
public static class Student extends person {
public int time;
public String studentno;
private String major;

public Student(String name, int age, int time, String major,
String studentno) {
super(name, age);
this.time = time;
this.major = major;
this.studentno = studentno;
}
public void print2() {
System.out.println("������" + this.name + " �Ա�" + this.sex + " ���䣺"
+ this.age + " ʱ�䣺" + this.time + " רҵ��" + this.major
+ " ѧ�ţ�" + this.studentno);
}
public static  class Teracher extends person {
	public String professional;
	public String department;

	public Teracher(String name, int age,String professional, String department) {
			super(name, age);
			this.professional = professional;
			this.department = department;
			}
public void print3() {
System.out.println("������" + this.name + " �Ա�" + this.sex + " ְ�ƣ�"
+ this.professional + " ���ţ�" + this.department );
}

public static void main(String[] args) {
person a = new person("С��", 20);
a.setSex("��");
a.print1();
Student b = new Student("С��", 20, 20190601, "���������", "0828322109");
b.setSex("��");
b.print2();
Teracher c= new Teracher("С��", 20, "����","�з�");
c.setSex("��");
c.print3();
}
}
}
}