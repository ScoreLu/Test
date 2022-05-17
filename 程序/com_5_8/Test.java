package com_5_8;
import java.util.*;
import java.sql.*;
 
public class Test
{
	
	public static void Create()    //����Student��
	{
		Connection conn = DBUtil.open();  //�������ݿ�
		String sql = "create table student(sno int(20),cno int(4),grade int(4),primary key(sno,cno))";
		try
		{
			Statement stmt = conn.createStatement();  //��̬����sql���
			stmt.execute(sql);
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtil.close(conn);
		}
	}
	
	public static void show()  //��ʾ��Ϣ
	{
		System.out.println("***********�ɼ����ݿ����***********");
		System.out.println("insert: ����ɼ�.");
		System.out.println("delete: ɾ���ɼ�.");
		System.out.println("update: ���³ɼ�.");
		System.out.println("get: �鿴�ɼ�.");
		System.out.println("list: �鿴���гɼ�.");
		System.out.println("***********�ɼ����ݿ����***********");
	}
 
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
//		Create();
		Userdemo userdemo = new UserdemoImpl();   //��̬
		Student stu = new Student();
		while(true)
		{
			show();
			System.out.print("����>");
			String s = in.next();
			if(s.equals("insert"))
			{
				System.out.println("��������ȷ����Ϣ������ظ��������ڡ���Ϣ���󣬶�����ִ���.");
				System.out.print("������ѧ�ţ�");
				int sno = in.nextInt();
				System.out.print("������γ̺ţ�");
				int cno = in.nextInt();
				System.out.print("������ɼ���");
				int grade = in.nextInt();
				stu.setSno(sno);
				stu.setCno(cno);
				stu.setGrade(grade);
				userdemo.Insert(stu);
			}
			else if(s.equals("delete"))
			{
				System.out.println("��������ȷ����Ϣ������ظ��������ڡ���Ϣ���󣬶�����ִ���.");
				System.out.print("�������ɾ����ѧ�ţ�");
				int sno = in.nextInt();
				System.out.print("�������ɾ���Ŀγ̺ţ�");
				int cno = in.nextInt();
				userdemo.Delete(sno, cno);
			}
			else if(s.equals("update"))
			{
				System.out.println("��������ȷ����Ϣ������ظ��������ڡ���Ϣ���󣬶�����ִ���.");
				System.out.print("����������µ�ѧ�ţ�");
				int sno = in.nextInt();
				System.out.print("����������µĿγ̺ţ�");
				int cno = in.nextInt();
				System.out.print("�������³ɼ���");
				int grade = in.nextInt();
				stu.setSno(sno);
				stu.setCno(cno);
				stu.setGrade(grade);
				userdemo.Update(stu);
			}
			else if(s.equals("get"))
			{
				System.out.println("��������ȷ����Ϣ������ظ��������ڡ���Ϣ���󣬶�����ִ���.");
				System.out.print("�������ѯ��ѧ�ţ�");
				int sno = in.nextInt();
				System.out.print("�������ѯ�Ŀγ̺ţ�");
				int cno = in.nextInt();
				stu = userdemo.Get(sno, cno);
				System.out.println("�ɼ���"+stu.getGrade());
			}
			else if(s.equals("list"))
			{
				ArrayList<Student> note = userdemo.SelectAll();
				for(int i=0,t=note.size();i<t;i++)
				{
					System.out.println(note.get(i));
				}
				
			}
			else if(s.equals("exit"))
			{
				System.out.println("�ټ���");
				System.exit(0);
			}
		}
 
	}
 
}
