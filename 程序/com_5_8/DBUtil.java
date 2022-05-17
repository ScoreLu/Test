package com_5_8;

import java.io.*;
import java.util.*;
import java.sql.*;
	 
	@SuppressWarnings("unused")
	public class DBUtil
	{
		private static String driver = "com.mysql.cj.jdbc.Driver";   //���ڼ�������
		private static String url = "jdbc:mysql:";  //���ݿ��ַ
		private static String username = "llb";  //�û���
		private static String password = "123456";   //����
		//�������ݿ�
		public static Connection open()
		{
			try
			{
				Class.forName(driver);    //��������
				return DriverManager.getConnection(url, username, password);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
			return null;
		}
		
		//�ر����ݿ�
		public static void close(Connection conn)
		{
			if(conn!=null)
			{
				try
				{
					conn.close();
				} catch (SQLException e)
				{
					e.printStackTrace();
				}
			}
		
	}

}
