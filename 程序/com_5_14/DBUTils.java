package com_5_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBUTils {
	//���ݿ��URL��NAME��PASSWORD
	private static final String URL="jdbc:mysql://cdb-8n7tqsvb.gz.tencentcdb.com:10010/student_dome";
	private static final String NAME="root";
	private static final String PASSWORD="wzh123456";

		private static Connection conn=null;
		static {
			try {
				//����MySQL����
				Class.forName("com.mysql.jdbc.Driver");
				//�������ݿ�
				conn=DriverManager.getConnection(URL, NAME, PASSWORD);
				
				} catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
				}
			
		}
		public static Connection getConnection() {
			return conn;
		
		}
	
		public static void main(String[]args) throws SQLException{
			//ͨ�����ݿ�����Ӳ������ݿ⣬ʵ�ֲ���
			delStudent("��贱�");
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
