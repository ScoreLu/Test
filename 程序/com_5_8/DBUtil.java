package com_5_8;

import java.io.*;
import java.util.*;
import java.sql.*;
	 
	@SuppressWarnings("unused")
	public class DBUtil
	{
		private static String driver = "com.mysql.cj.jdbc.Driver";   //用于加载驱动
		private static String url = "jdbc:mysql:";  //数据库地址
		private static String username = "llb";  //用户名
		private static String password = "123456";   //密码
		//连接数据库
		public static Connection open()
		{
			try
			{
				Class.forName(driver);    //加载驱动
				return DriverManager.getConnection(url, username, password);
			} catch (Exception e)
			{
				e.printStackTrace();
			}
			return null;
		}
		
		//关闭数据库
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
