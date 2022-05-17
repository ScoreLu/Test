package com_5_13;
public class HighThread extends Thread { //通过继承Thread类来新建一个线程类
	 
    public void run() {
        System.out.println(getName() + "执行！");    //Thread类内通过getName()获取线程名
    }
}

