package com_5_8;
import java.util.*;
import java.sql.*;
 
public class Test
{
	
	public static void Create()    //创建Student表
	{
		Connection conn = DBUtil.open();  //连接数据库
		String sql = "create table student(sno int(20),cno int(4),grade int(4),primary key(sno,cno))";
		try
		{
			Statement stmt = conn.createStatement();  //静态操作sql语句
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
	
	public static void show()  //提示信息
	{
		System.out.println("***********成绩数据库管理***********");
		System.out.println("insert: 插入成绩.");
		System.out.println("delete: 删除成绩.");
		System.out.println("update: 更新成绩.");
		System.out.println("get: 查看成绩.");
		System.out.println("list: 查看所有成绩.");
		System.out.println("***********成绩数据库管理***********");
	}
 
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
//		Create();
		Userdemo userdemo = new UserdemoImpl();   //多态
		Student stu = new Student();
		while(true)
		{
			show();
			System.out.print("命令>");
			String s = in.next();
			if(s.equals("insert"))
			{
				System.out.println("请输入正确的信息，如果重复、不存在、信息错误，都会出现错误.");
				System.out.print("请输入学号：");
				int sno = in.nextInt();
				System.out.print("请输入课程号：");
				int cno = in.nextInt();
				System.out.print("请输入成绩：");
				int grade = in.nextInt();
				stu.setSno(sno);
				stu.setCno(cno);
				stu.setGrade(grade);
				userdemo.Insert(stu);
			}
			else if(s.equals("delete"))
			{
				System.out.println("请输入正确的信息，如果重复、不存在、信息错误，都会出现错误.");
				System.out.print("请输入待删除的学号：");
				int sno = in.nextInt();
				System.out.print("请输入待删除的课程号：");
				int cno = in.nextInt();
				userdemo.Delete(sno, cno);
			}
			else if(s.equals("update"))
			{
				System.out.println("请输入正确的信息，如果重复、不存在、信息错误，都会出现错误.");
				System.out.print("请输入待更新的学号：");
				int sno = in.nextInt();
				System.out.print("请输入待更新的课程号：");
				int cno = in.nextInt();
				System.out.print("请输入新成绩：");
				int grade = in.nextInt();
				stu.setSno(sno);
				stu.setCno(cno);
				stu.setGrade(grade);
				userdemo.Update(stu);
			}
			else if(s.equals("get"))
			{
				System.out.println("请输入正确的信息，如果重复、不存在、信息错误，都会出现错误.");
				System.out.print("请输入查询的学号：");
				int sno = in.nextInt();
				System.out.print("请输入查询的课程号：");
				int cno = in.nextInt();
				stu = userdemo.Get(sno, cno);
				System.out.println("成绩："+stu.getGrade());
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
				System.out.println("再见！");
				System.exit(0);
			}
		}
 
	}
 
}
