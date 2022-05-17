package com_5_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUTils {
	//数据库的URL、NAME、PASSWORD
	private static final String URL="jdbc:mysql://cdb-8n7tqsvb.gz.tencentcdb.com:10010/student_dome";
	private static final String NAME="root";
	private static final String PASSWORD="wzh123456";

		private static Connection conn=null;
		static {
			try {
				//加载MySQL驱动
				Class.forName("com.mysql.jdbc.Driver");
				//连接数据库
				conn=DriverManager.getConnection(URL, NAME, PASSWORD);
				
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			
		}
		public static Connection getConnection() {
			return conn;
		
		}
	
		public static void main(String[]args) throws SQLException{
			//通过数据库的链接操作数据库，实现操作
			delStudent("刘璐宾");
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student");
			while(rs.next()){
				System.out.println(rs.getString("ID")+rs.getString("name")+rs.getString("sex")+rs.getInt("age"));
			}
			System.out.println("111111");
			conn.close();
		}

		private static void delStudent(String name) {
			// TODO Auto-generated method stub
			
		}


}
