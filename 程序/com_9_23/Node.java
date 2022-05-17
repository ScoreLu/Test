package com_9_23;

public class Node {
	public Object date;
	public Node next;
	public Node(){
	 this(null,null);
	}
	public Node(Object date){
	 this(date,null);
	}
	 public Node(Object date,Node next){
	  this.date=date;
	  this.next=next;
	 }
}
