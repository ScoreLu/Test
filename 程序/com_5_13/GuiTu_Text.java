package com_5_13;

import com_5_13.GuiTu.Rabbit;
import com_5_13.GuiTu.Torist;

public class GuiTu_Text {

	 public static void main(String[] args) {
	        //1 �ⲿ��ʵ������
	        GuiTu outer=new GuiTu();
	        //2���� �ڹ��߳�ʵ������
	        Rabbit rabbit=outer.new Rabbit();
	        Torist torist=outer.new Torist();
	        //3 ��������
	        //����ʵ�� Ҳ����������ͬʱ�� ����Ҳ�Ǻܹ�ƽ��
	        rabbit.start();
	        torist.start();
	    }
	}
