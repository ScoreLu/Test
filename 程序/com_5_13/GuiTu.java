package com_5_13;

public class GuiTu {
    private int toristDistance;//�ڹ��ܹ��ľ���
    private int rabbitDistance;//�����ܹ��ľ���
    /**
     * �ڹ��߳��ڲ���
     */
    class Torist extends Thread{
 
        @Override
        public void run() {
            //������̴���
            for(int i=1;i<=100;i++){
                //�ж������Ƿ񵽴��յ�
                if(rabbitDistance==100){
                    //��������1000��ʱ�� ���Ӿ��Ѿ�Ӯ��
                    System.out.println("����Ӯ���˱�������ʱ�ڹ������"+toristDistance+"��");
                    break;
                }else{
                    //�ڹ꿪ʼ��
                    toristDistance+=1;
                    //�жϾ����Ƿ���100�ı���
                    if(toristDistance%100==0){
                        try {
                            System.out.println("�ڹ��ܹ��ˡ�"+toristDistance+"���ף���ʱ�����ܹ��ξ����ǡ�"+rabbitDistance+"��");
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
 
        }
    }
    /**
     * �����߳��ڲ���
     */
    class Rabbit extends Thread{
 
        @Override
        public void run() {
            //������̴���
            for(int i=1;i<=100/5;i++){
                //�ж������Ƿ񵽴��յ�
                if(toristDistance==100){
                    //��������1000��ʱ�� ���Ӿ��Ѿ�Ӯ��
                    System.out.println("�ڹ�Ӯ���˱�������ʱ���Ӳ�����"+rabbitDistance+"��");
                    break;
                }else{
                    //�ڹ꿪ʼ��
                    rabbitDistance+=5;
                    //�жϾ����Ƿ���100�ı���
                    if(rabbitDistance%20==0){
                        try {
                            System.out.println("�����ܹ����ξ����ǡ�"+rabbitDistance+"��"+"�ڹ��ܹ��ˡ�"+toristDistance+"���ף�");
                            Thread.sleep(500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}

