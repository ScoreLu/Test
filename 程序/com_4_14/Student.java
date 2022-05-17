package com_4_14;


	import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class Student {
	    /**
	     * 操作界面
	     */
	    static Scanner sca = new Scanner(System.in);
	    static List<Student> l = new ArrayList<Student>();
	    static Student c = new Student();
	    static boolean stu = true;
	    public static void main(String[] args) {
	        System.out.println("欢迎来到学生管理系统");
	        System.out.println("【1】注册");
	        System.out.println("【2】查看");
	        System.out.println("【3】修改");
	        System.out.println("【4】删除");
	        System.out.print("请选择您的操作:");


	        while(stu) {
	            String stus = sca.nextLine();
	            switch(stus) {
	            case "1":
	                add();
	                break;
	            case "2":
	                sel();
	                break;
	            case "3":
	                set();
	                break;
	            case "4":
	                del();
	                break;
	            }
	        }
	    }



	    /***
	     * 添加功能
	     */
	    static void add() {
	        while(stu) {
	            System.out.println("请输入学生姓名");
	            ( c).setName(sca.nextLine());
	            System.out.println("请输入学生年龄");
	            (c).setAge(sca.nextLine());
	            System.out.println("请输入学生性别");
	            (c).setSec(sca.nextLine());
	            System.out.println("添加成功");
	            l.add(c);
	            break;
	        }
	    }


	    private void setName(String nextLine) {
			// TODO Auto-generated method stub
			
		}



		private void setAge(String nextLine) {
			// TODO Auto-generated method stub
			
		}
		private void setSec(String nextLine) {
			// TODO Auto-generated method stub
			
		}


		/**
	     * 查询功能
	     */
	    static void sel() {
	        for (Student c : l) {
	            System.out.println("姓名:"+c.getName()+" "+"年龄:"+c.getAge());
	        }
	    }


	    private String getAge() {
			// TODO Auto-generated method stub
			return null;
		}

	    @SuppressWarnings("unused")
		private String getSec() {
			// TODO Auto-generated method stub
			return null;
		}


		private String getName() {
			// TODO Auto-generated method stub
			return null;
		}



		/**
	     * 删除功能
	     */
	    static void del() {
	        System.out.println("请输入要删除的姓名");
	        String names = sca.nextLine();
	        for(int i=0;i<l.size();i++) {
	            if(names.equals(l.get(i).getName())) {
	                System.out.println("找到学生正在删除");
	                l.remove(i);
	                System.out.println("删除成功");
	            }else {
	                System.out.println("删除失败未找到学生");
	            }
	        }
	    }



	    /**
	     * 修改功能
	     */
	    static void set() {
	        System.out.println("请输入要修改学生的姓名");
	        String names = sca.nextLine();
	        for(int i=0;i<l.size();i++) {
	            if(names.equals(l.get(i).getName())) {
	                System.out.println("发现学生正在修改");
	                System.out.println("请输入修改后的姓名");
	                String name = sca.nextLine();
	                l.get(i).setName(name);
	                System.out.println("请输入修改后的年龄");
	                String age = sca.nextLine();
	                l.get(i).setAge(age);
	                System.out.println("修改成功");
	            }else{
	                System.out.println("修改失败未找到学生");
	            }
	        }
	    }
	}
