package com_5_8;


import java.util.ArrayList;
 
//ʵ�ֶ����ݿ���sc�������ɾ���ġ���
public interface Userdemo
{
	public void Insert(Student s);
	
	public void Delete(int sno,int cno);
	
	public void Update(Student s);
	
	public Student Get(int sno,int cno);
	
	public ArrayList<Student> SelectAll();
 
}

