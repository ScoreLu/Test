package com_10_14;

public interface IString {
	public void clear();            
    public boolean isEmpty();
    public int length();                     
    public char charAt(int index);            
    public IString substring(int begin, int end); 
    public IString insert(int offset, IString str);   
    public IString delete(int begin, int end);
    public IString concat(IString str);   
    public int compareto(SeqString str);   
    public int indexOf(IString str,int begin);
	public void display();

	}

