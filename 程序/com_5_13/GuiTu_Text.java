package com_5_13;

import com_5_13.GuiTu.Rabbit;
import com_5_13.GuiTu.Torist;

public class GuiTu_Text {

	 public static void main(String[] args) {
	        //1 外部类实例构建
	        GuiTu outer=new GuiTu();
	        //2兔子 乌龟线程实例构建
	        Rabbit rabbit=outer.new Rabbit();
	        Torist torist=outer.new Torist();
	        //3 依次启动
	        //在现实中 也不可能两个同时跑 这样也是很公平的
	        rabbit.start();
	        torist.start();
	    }
	}
