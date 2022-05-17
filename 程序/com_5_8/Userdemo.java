package com_5_8;


import java.util.ArrayList;
 
//实现对数据库中sc表的增、删、改、查
public interface Userdemo
{
	public void Insert(Student s);
	
	public void Delete(int sno,int cno);
	
	public void Update(Student s);
	
	public Student Get(int sno,int cno);
	
	public ArrayList<Student> SelectAll();
 
}

