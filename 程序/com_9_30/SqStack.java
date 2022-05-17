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
	System.out.println("元素已清空");
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
		System.out.println("元素为空");
	return null;
}

public Object pop() {
	if(isEmpty()){
		System.out.println("栈中元素为空");
		return null;
	}
	else 
		System.out.println(stackElem[--top]+"出栈成功");
		return stackElem[--top];
}

public void push(Object x) throws Exception {
	if(top==stackElem.length)
		throw new Exception("栈已满");
	else 
		stackElem[top++]=x;
}
public void display(){
	for (int i = top-1; i >=0; i--) {
System.out.print("当前的元素为：");
		System.out.println(stackElem[i].toString()+" ");
	}
}

}