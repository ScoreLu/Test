package com_5_22;
//2��������Ʊ����ͬʱ����20��Ʊ
//���������(1)Ʊ��Ҫʹ��ͬһ����ֵ̬    
//(2)Ϊ��֤�����������ͬһ��Ʊ����Ҫjava���߳�ͬ������
//���˼·��    (1)����һ��վ̨��Station���̳�Thread����дrun��������run��������ִ����Ʊ������
//��ƱҪʹ��ͬ����������һ��վ̨������Ʊʱ������վ̨Ҫ������Ʊ���꣡  
//(2)�����������
public class Station extends Thread{
//ͨ�����췽�����߳����ָ�ֵ
public Station(String name){
super(name);//���߳����ָ�ֵ
}
//Ϊ�˱���Ʊ����һ�£�Ʊ��Ҫ��̬
static int ticket = 20;
//����һ����̬Կ��
static Object ob = "aa";//ֵ�������
//��дrun���� ʵ����Ʊ����
public void run(){
while(ticket>0){
synchronized(ob){
/**
* ʹ��һ����
* ��ȥ���˻��Կ���������� �����Ű�Կ���ó���
*/
if(ticket>0){
System.out.println(getName()+"���˵�"+ticket+"��Ʊ");
ticket--;
}else{
System.out.println("Ʊ������");
}
}
try {
sleep(1000);//��Ϣһ��
} catch (Exception e) {
e.printStackTrace();
}
}
}
}