package com_9_17;

public class SqList implements Ilist {
	private Object[] listElem; 
	private int curLen; 
	//构造一个容量为maxSize的空顺序表函数      
    public SqList (int maxSize) { 
    	listElem = new Object[maxSize];
    	curLen = 0; 
    }

	public static void main(String[] args) {
	}

	public void clear() {
		curLen = 0; 

	}

	public boolean isEmpty() {
		return curLen == 0;
	}

	public int leangth() {
		 return curLen; 

	}

	public Object get(int i) throws Exception {
	if (i < 0 || i > curLen - 1)
	throw new Exception("第" + i + "个元素不存在");
	return listElem[i]; 
	}

	public void insert(int i, Object x) {

	}

	public void remove(int i) {
		
	}

	public int indexOf(Object x) {
		return 0;
	}

	public void display() {
		for(int j=0;j<curLen;j++)
			System.out.print(listElem[j] + "");
		System.out.println();

	}

}
