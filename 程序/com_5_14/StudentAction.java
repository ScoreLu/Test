package com_5_14;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class StudentAction {
/*ʵ�����ݺ�Ҫ��:
 * 1��	��дѧ�����ݿ�student_dome��student�ı�
 * 2��	����ѧ�ţ��޸����ݿ�student���е�ĳ����Ϣ
 * 3��	����ѧ��ɾ������ĳ����Ϣ
 * 4��	����ѧ�Ų�ѯѧ����Ϣ
 * 5��	����ѧ��������ѯѧ����Ϣ*/
	public static void main(String[] args) throws Exception{
		// TODO �Զ����ɵķ������
		Student sl=new Student("1912402050607","��贱�","��",18);
		addStudent(sl);

		Student s2=new Student("2", "�ŷ�","��",19);
		updateStudent(s2);
		
		Student s3=new Student("3","ľ��","Ů",19);
		delStudent(s3.getID());
		
		Student s1=null;
        s1=get("50607");
		if(s1!=null) {
			System.out.println(s1.toString());
		}
		
		List<Student> list =get("С��","Ů");
		for(Student student:list) {
			System.out.println(student.toString());
		}

	}

	//���ѧ��
	private static void addStudent(Student g)throws SQLException {
		Connection con=DBUTils.getConnection();//�����õ����ݿ������
		String sql=
				"insert into student"+
		"(ID,name,sex,age)"+
						"values("+
		"?,?,?,?)";
		//Ԥ����SQL���
		PreparedStatement psmt =con.prepareStatement(sql);
		//�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
		psmt.setString(1, g.getID());
		psmt.setString(2, g.getName());
		psmt.setString(3, g.getSex());
		psmt.setInt(4, g.getAge());
		//ִ��SQL���
		psmt.execute();
		
		
	}//�滻ѧ��
	private static void updateStudent(Student s) throws SQLException{
		
		Connection con=DBUTils.getConnection();//�����õ����ݿ������
		String sql=""+
				"update student "+
		"set name=?,sex =?,age=? "+
						"where id=?";//�������൱��ռλ��
		
		//Ԥ����SQL���
		PreparedStatement psmt =con.prepareStatement(sql);
		
		//�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
		psmt.setString(1, s.getName());
		psmt.setString(2, s.getSex());
		psmt.setInt(3, s.getAge());
		psmt.setString(4, s.getID());
		
		//ִ��SQL���
		psmt.execute();
	
}
	
//ɾ��ѧ��
	private static void delStudent(String s) throws SQLException{
		Connection con=DBUTils.getConnection();//�����õ����ݿ������
		String sql=""+
				"delete from student "+
						"where id=?";//�������൱��ռλ��
		
		//Ԥ����SQL���
		PreparedStatement psmt =con.prepareStatement(sql);
		
		//�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
		psmt.setString(1,s);
		
		//ִ��SQL���
		psmt.execute();
}
	//����ID��ѯ
private static Student get(String id) throws SQLException{
	Student g=null;
	Connection con=DBUTils.getConnection();//�����õ����ݿ������
	String sql=""+
			"select* from student "+
					"where id=?";//�������൱��ռλ��
	//Ԥ����SQL���
			PreparedStatement psmt =con.prepareStatement(sql);
			
			//�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
			psmt.setString(1,id);
			
			//����һ�������
			ResultSet rs=psmt.executeQuery();
			//���������
			while(rs.next()) {
				g=new Student();
				g.setID(rs.getString("ID"));
				g.setName(rs.getString("name"));
				g.setAge(rs.getInt("age"));
				g.setSex(rs.getString("sex"));
				
			}
			return g;
}

//��ѯ������������������Ϣȥ��ѯ��
private static List<Student> get(String name, String sex)throws SQLException {
		List<Student> result=new ArrayList<Student>();
		Connection con=DBUTils.getConnection();//�����õ����ݿ������
		StringBuffer sb=new StringBuffer();
		sb.append("select* from student ");
		sb.append("where name like?and sex like?");
		//Ԥ����SQL���
		PreparedStatement psmt =con.prepareStatement(sb.toString());
		
		//�ȶ�ӦSQL��䣬��SQL��䴫�ݲ���
		psmt.setString(1, "%"+name+"%");
		psmt.setString(2, "%"+sex+"%");
		System.out.println(sb.toString());
		
		//����һ�������
		ResultSet rs=psmt.executeQuery();
		Student g=null;
		//���������
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