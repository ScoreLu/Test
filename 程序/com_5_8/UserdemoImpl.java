package com_5_8;

import java.util.*;
import java.sql.*;
 
public class UserdemoImpl implements Userdemo   //ʵ��Userdemo�ӿڵķ���
{
 
	@Override
	public void Insert(Student s)   //��
	{
		//�������ݿ�
		Connection conn = DBUtil.open();
		//�������
		String sql = "insert into sc values(?,?,?)";
		try
		{
			//��̬����sql���
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,s.getSno());
			pstmt.setInt(2,s.getCno());
			pstmt.setInt(3,s.getGrade());
			pstmt.executeUpdate();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtil.close(conn);  //�ر����ݿ�
		}
		
		
		
	}
 
	@Override
	public void Delete(int sno, int cno)   //ɾ
	{
		Connection conn = DBUtil.open();
		String sql = "delete from sc where sno=? and cno=?";
		
		try
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,sno);
			pstmt.setInt(2,cno);
			pstmt.executeUpdate();
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtil.close(conn);
		}
		
		
	}
 
	@Override
	public void Update(Student s)    //��
	{
		Connection conn = DBUtil.open();
		String sql = "update sc set grade=? where sno=? and cno=?";
		
		try
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,s.getGrade());
			pstmt.setInt(2,s.getSno());
			pstmt.setInt(3,s.getCno());
			pstmt.executeUpdate();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtil.close(conn);
		}
		
	}
 
	@Override
	public Student Get(int sno, int cno)   //��
	{
		Connection conn = DBUtil.open();
		String sql = "select grade from sc where sno=? and cno=?";
		
		try
		{
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,sno);
			pstmt.setInt(2,cno);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next())
			{
				int grade = rs.getInt(1);
				Student s = new Student(sno,cno,grade);
				return s;
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtil.close(conn);
		}
		
		return null;
	}
 
	@Override
	public ArrayList<Student> SelectAll()   //����
	{
		ArrayList<Student> stu = new ArrayList<Student>();
		Connection conn = DBUtil.open();
		String sql = "select * from sc";
		try
		{
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next())
			{
				int sno = rs.getInt(1);
				int cno = rs.getInt(2);
				int grade = rs.getInt(3);
				Student s = new Student(sno,cno,grade);
				stu.add(s);
			}
			return stu;
		} catch (SQLException e)
		{
			e.printStackTrace();
		}
		finally
		{
			DBUtil.close(conn);
		}
		
		return null;
	}
 
}
