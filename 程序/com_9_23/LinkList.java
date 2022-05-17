package com_9_23;
import java.util.Scanner;
public  class LinkList implements IList{
public Node head;
public LinkList(){
 head=new Node();
 
}
public LinkList(int n,boolean Order)throws Exception{
 this();
 if(Order)
  create1(n);
 else
  create2(n);
}
private void create1(int n)throws Exception {
 @SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
 for(int j=0;j<n;j++)
  insert(length(),sc.next());
}
private void create2(int n)throws Exception {
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
 for(int j=0;j<n;j++)
  insert(0,sc.next());
}
 public void clear() {
 head.date=null;
 head.next=null; 
 }
 
 public void display() {
 Node node=head.next;
 while(node!=null){
  System.out.println(node.date+"");
  node=node.next; 
 }
 System.out.println();
 }
 
 public Object get(int i) throws Exception {
 Node p=head.next;
 int j=0;
 while(p!=null&&j<i){
  p=p.next;
  ++j;
 }
 if(j>i||p==null){
  throw new Exception("第"+i+"个元素不存在");   
 }return p.date;
 }
 
 public int indexOf(Object x) {
 Node p=head.next;
 int j=0;
 while(p!=null&&!p.date.equals(x)){
  p=p.next;
  ++j; 
 }if(p!=null)
 return j;
 else
  return -1;
 }
 
 public void insert(int i, Object x)throws Exception {
	  Node p=head;
	  int j=-1;
	  while(p!=null&&j<i-1){
	   p=p.next;
	   ++j;
	  }if(j>i-1||p==null)
	   throw new Exception("插入位置合法");
	  Node s=new Node(x);
	  s.next=p.next;
	  p.next=s;
	 }
 public boolean isEmpty() { 
  return head.next==null;
 }
 
 public int length() {
  Node p=head.next;
  int length=0;
  while(p!=null){
   p=p.next;
   ++length;
  }
  return length;
 }

 public void remove(int i)throws Exception {
	 if (i < 1 || i > getListLength()) {
		 System.out.println("删除位置合法");

		 }

		 Node temp = head;

		 int length = 1;

		 while (temp.next != null) {
		 if (i == length) {
		 temp.next = temp.next.next;

		 return;

		 } else {
		 temp = temp.next;

		 }

		 length++;

		 }

		
 }
private int getListLength() {
	return 0;
}
 
}
