package com_9_30;
public class SqStack implements IStack{

    private Object[] stackElem;
    private int top;
    public SqStack(int maxSize){
    	top=0;
    	stackElem=new Object[maxSize];
    }


public void clear() {
	top=0;
}

public boolean isEmpty() {
	System.out.println("Ԫ�������");
return top==0;
	
}

public int length() {
	return top;
}

public Object peek() {
	if(!isEmpty()){
		return stackElem[top-1];
	}
	else
		System.out.println("Ԫ��Ϊ��");
	return null;
}

public Object pop() {
	if(isEmpty()){
		System.out.println("ջ��Ԫ��Ϊ��");
		return null;
	}
	else 
		System.out.println(stackElem[--top]+"��ջ�ɹ�");
		return stackElem[--top];
}

public void push(Object x) throws Exception {
	if(top==stackElem.length)
		throw new Exception("ջ����");
	else 
		stackElem[top++]=x;
}
public void display(){
	for (int i = top-1; i >=0; i--) {
System.out.print("��ǰ��Ԫ��Ϊ��");
		System.out.println(stackElem[i].toString()+" ");
	}
}

}