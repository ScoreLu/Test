package com_9_23;

import java.util.Scanner;
public class Text {
 public static void main(String[] args)throws Exception { 
  System.out.println("请输入链表元素:");
  LinkList L=new LinkList(5, true);
  Scanner sc=new Scanner(System.in);
  System.out.println("单链表初始化完成！");
  System.out.println("请输入任意数字开始:");
  int loc=sc.nextInt();
  menu();
  int op;
  do{ System.out.println("-------------");
  System.out.println("操作选项菜单");
  System.out.println("1.输出表长");
  System.out.println("2.插入元素");
  System.out.println("3.删除元素");
  System.out.println("4.定位元素");
  System.out.println("5.取表元素");
  System.out.println("6.显示单链表");
  System.out.println("0.退出");
  System.out.println("作者：刘璐宾 班级：软工6班");
  System.out.println("-------------");
  System.out.println("请输入操作代码（0-退出）:");
  op=sc.nextInt();
  switch(op){
  case 1:System.out.println("链表的长度为："+L.length());
  break;
  case 2:
	  System.out.println("请输入要插入的元素：");
  int num=sc.nextInt();
  System.out.println("请输入要插入的位置：");
  L.insert(loc=sc.nextInt(), num);
  System.out.println("插入操作成功");
  break;
  case 3:System.out.println("请输入要删除的元素的位置：");
  loc=sc.nextInt();
  L.remove(loc);
  System.out.println("删除操作成功");
  break;
  case 4:System.out.println("请输入要查找的元素：");
  num=sc.nextInt();
  System.out.println(num+"在表中的位置："+(L.indexOf(num)));
  break;
  case 5:System.out.println("请输入要查找元素的位置：");
  loc=sc.nextInt();
  System.out.println(loc+"位置上的元素为："+L.get(loc));
  break;
  case 6: L.display();
  break;
  case 0:System.out.println("程序结束！");
  return;
  default:System.out.println("输入的操作代码有误，请重新选择！");
  }
  }while(op !=0);
  sc.close();
  } private static void menu() {
  
  }
}
