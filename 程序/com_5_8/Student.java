package com_5_8;

public class Student {
			private int sno;
			private int cno;
			private int grade;
			
			public Student(int sno, int cno, int grade)
			{
				this.sno = sno;
				this.cno = cno;
				this.grade = grade;
			}
		 
			public Student()
			{
				
			}
			
			public String toString()
			{
				return this.sno+","+this.cno+","+this.grade;
			}
		 
			public int getSno()
			{
				return sno;
			}
		 
			public void setSno(int sno)
			{
				this.sno = sno;
			}
		 
			public int getCno()
			{
				return cno;
			}
		 
			public void setCno(int cno)
			{
				this.cno = cno;
			}
		 
			public int getGrade()
			{
				return grade;
			}
		 
			public void setGrade(int grade)
			{
				this.grade = grade;
			}
		

	}

