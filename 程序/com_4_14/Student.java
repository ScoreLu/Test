package com_4_14;


	import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

	public class Student {
	    /**
	     * ��������
	     */
	    static Scanner sca = new Scanner(System.in);
	    static List<Student> l = new ArrayList<Student>();
	    static Student c = new Student();
	    static boolean stu = true;
	    public static void main(String[] args) {
	        System.out.println("��ӭ����ѧ������ϵͳ");
	        System.out.println("��1��ע��");
	        System.out.println("��2���鿴");
	        System.out.println("��3���޸�");
	        System.out.println("��4��ɾ��");
	        System.out.print("��ѡ�����Ĳ���:");


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
	     * ��ӹ���
	     */
	    static void add() {
	        while(stu) {
	            System.out.println("������ѧ������");
	            ( c).setName(sca.nextLine());
	            System.out.println("������ѧ������");
	            (c).setAge(sca.nextLine());
	            System.out.println("������ѧ���Ա�");
	            (c).setSec(sca.nextLine());
	            System.out.println("��ӳɹ�");
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
	     * ��ѯ����
	     */
	    static void sel() {
	        for (Student c : l) {
	            System.out.println("����:"+c.getName()+" "+"����:"+c.getAge());
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
	     * ɾ������
	     */
	    static void del() {
	        System.out.println("������Ҫɾ��������");
	        String names = sca.nextLine();
	        for(int i=0;i<l.size();i++) {
	            if(names.equals(l.get(i).getName())) {
	                System.out.println("�ҵ�ѧ������ɾ��");
	                l.remove(i);
	                System.out.println("ɾ���ɹ�");
	            }else {
	                System.out.println("ɾ��ʧ��δ�ҵ�ѧ��");
	            }
	        }
	    }



	    /**
	     * �޸Ĺ���
	     */
	    static void set() {
	        System.out.println("������Ҫ�޸�ѧ��������");
	        String names = sca.nextLine();
	        for(int i=0;i<l.size();i++) {
	            if(names.equals(l.get(i).getName())) {
	                System.out.println("����ѧ�������޸�");
	                System.out.println("�������޸ĺ������");
	                String name = sca.nextLine();
	                l.get(i).setName(name);
	                System.out.println("�������޸ĺ������");
	                String age = sca.nextLine();
	                l.get(i).setAge(age);
	                System.out.println("�޸ĳɹ�");
	            }else{
	                System.out.println("�޸�ʧ��δ�ҵ�ѧ��");
	            }
	        }
	    }
	}
