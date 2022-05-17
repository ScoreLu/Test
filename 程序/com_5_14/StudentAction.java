package com_5_14;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class StudentAction {
/*实验内容和要求:
 * 1、	读写学生数据库student_dome中student的表
 * 2、	根据学号，修改数据库student表中的某条信息
 * 3、	根据学号删除表内某条信息
 * 4、	根据学号查询学生信息
 * 5、	根据学生姓名查询学生信息*/
	public static void main(String[] args) throws Exception{
		// TODO 自动生成的方法存根
		Student sl=new Student("1912402050607","刘璐宾","男",18);
		addStudent(sl);

		Student s2=new Student("2", "张飞","男",19);
		updateStudent(s2);
		
		Student s3=new Student("3","木兰","女",19);
		delStudent(s3.getID());
		
		Student s1=null;
        s1=get("50607");
		if(s1!=null) {
			System.out.println(s1.toString());
		}
		
		List<Student> list =get("小红","女");
		for(Student student:list) {
			System.out.println(student.toString());
		}

	}

	//添加学生
	private static void addStudent(Student g)throws SQLException {
		Connection con=DBUTils.getConnection();//首先拿到数据库的连接
		String sql=
				"insert into student"+
		"(ID,name,sex,age)"+
						"values("+
		"?,?,?,?)";
		//预编译SQL语句
		PreparedStatement psmt =con.prepareStatement(sql);
		//先对应SQL语句，给SQL语句传递参数
		psmt.setString(1, g.getID());
		psmt.setString(2, g.getName());
		psmt.setString(3, g.getSex());
		psmt.setInt(4, g.getAge());
		//执行SQL语句
		psmt.execute();
		
		
	}//替换学生
	private static void updateStudent(Student s) throws SQLException{
		
		Connection con=DBUTils.getConnection();//首先拿到数据库的连接
		String sql=""+
				"update student "+
		"set name=?,sex =?,age=? "+
						"where id=?";//参数？相当于占位符
		
		//预编译SQL语句
		PreparedStatement psmt =con.prepareStatement(sql);
		
		//先对应SQL语句，给SQL语句传递参数
		psmt.setString(1, s.getName());
		psmt.setString(2, s.getSex());
		psmt.setInt(3, s.getAge());
		psmt.setString(4, s.getID());
		
		//执行SQL语句
		psmt.execute();
	
}
	
//删除学生
	private static void delStudent(String s) throws SQLException{
		Connection con=DBUTils.getConnection();//首先拿到数据库的连接
		String sql=""+
				"delete from student "+
						"where id=?";//参数？相当于占位符
		
		//预编译SQL语句
		PreparedStatement psmt =con.prepareStatement(sql);
		
		//先对应SQL语句，给SQL语句传递参数
		psmt.setString(1,s);
		
		//执行SQL语句
		psmt.execute();
}
	//根据ID查询
private static Student get(String id) throws SQLException{
	Student g=null;
	Connection con=DBUTils.getConnection();//首先拿到数据库的连接
	String sql=""+
			"select* from student "+
					"where id=?";//参数？相当于占位符
	//预编译SQL语句
			PreparedStatement psmt =con.prepareStatement(sql);
			
			//先对应SQL语句，给SQL语句传递参数
			psmt.setString(1,id);
			
			//返回一个结果集
			ResultSet rs=psmt.executeQuery();
			//遍历结果集
			while(rs.next()) {
				g=new Student();
				g.setID(rs.getString("ID"));
				g.setName(rs.getString("name"));
				g.setAge(rs.getInt("age"));
				g.setSex(rs.getString("sex"));
				
			}
			return g;
}

//查询单个（根据姓名等信息去查询）
private static List<Student> get(String name, String sex)throws SQLException {
		List<Student> result=new ArrayList<Student>();
		Connection con=DBUTils.getConnection();//首先拿到数据库的连接
		StringBuffer sb=new StringBuffer();
		sb.append("select* from student ");
		sb.append("where name like?and sex like?");
		//预编译SQL语句
		PreparedStatement psmt =con.prepareStatement(sb.toString());
		
		//先对应SQL语句，给SQL语句传递参数
		psmt.setString(1, "%"+name+"%");
		psmt.setString(2, "%"+sex+"%");
		System.out.println(sb.toString());
		
		//返回一个结果集
		ResultSet rs=psmt.executeQuery();
		Student g=null;
		//遍历结果集
		while(rs.next()) {
			g=new Student();
			((Student) g).setID(rs.getString("ID"));
			g.setName(rs.getString("name"));
			g.setSex(rs.getString("sex"));
			g.setAge(rs.getInt("age"));
			
			result.add(g);
		}
		return result;
	}
}