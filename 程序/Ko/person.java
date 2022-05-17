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
System.out.println("姓名：" + this.name + " 性别：" + this.sex + " 年龄："
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
System.out.println("姓名：" + this.name + " 性别：" + this.sex + " 年龄："
+ this.age + " 时间：" + this.time + " 专业：" + this.major
+ " 学号：" + this.studentno);
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
System.out.println("姓名：" + this.name + " 性别：" + this.sex + " 职称："
+ this.professional + " 部门：" + this.department );
}

public static void main(String[] args) {
person a = new person("小刘", 20);
a.setSex("男");
a.print1();
Student b = new Student("小刘", 20, 20190601, "计算机技术", "0828322109");
b.setSex("男");
b.print2();
Teracher c= new Teracher("小刘", 20, "经理","研发");
c.setSex("男");
c.print3();
}
}
}
}