package find;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FinalTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		menu();
	    int op;
	    do{
	    	System.out.println("-------------");	
	    	System.out.println("����ѡ��˵�");	
	    	System.out.println("1.�����ı��ļ�");	
	    	System.out.println("2.���ʶ�λ");	
	    	System.out.println("3.���ʼ���");	
	    	System.out.println("4.�˳�����");	
	    	System.out.println("-------------");
	    System.out.println("������������루4-�˳���:");
		Scanner sc=new Scanner(System.in);
	    op=sc.nextInt();
	    switch(op){
	    case 1:System.out.println("�������ı����ƣ�");
	    Scanner sc01=new Scanner(System.in);
		String a=sc01.next();
		  try {
			  File f1=new File("D",a);
			  //����һ�����ļ�
		             boolean f11 = f1.createNewFile();
		         if (f11){

		              System.out.println("File has been created successfully");

		         }

		         else{

		              System.out.println("File already present at the specified location");

		         }

		        } catch (IOException e) {

		            System.out.println("Exception Occurred:");

		            e.printStackTrace();

		      }
	    break;
	    case 2:System.out.println("������Ҫ�������ı����ƣ�");
	    Scanner sc02=new Scanner(System.in);
		String b=sc02.next();
        System.out.println("������Ҫ���ı��ж�λ�ĵ��ʣ�");
        Scanner sc03=new Scanner(System.in);
		String c=sc03.next();
        FileSearch search = new FileSearch();
		search.SearchKeyword(new File("D:",b), c);
		File f1=new File("D:",b);
		Scanner reader = new Scanner(System.in);
		StringBuffer buffer = new StringBuffer();
        BufferedReader bf= new BufferedReader(new FileReader(f1));
        String s = null;
        int lines=0; 
        while((s = bf.readLine())!=null){//ʹ��readLine������һ�ζ�һ��
        	lines++; 
        	buffer.append(s.trim());
        	Sentence sentence = new Sentence(s);//ʵ����Sentence����
        if(sentence.getCount(c)!=0) {
            System.out.print(c+"�ڵ�"+lines+"�е�");
            sentence.getLocation(c);
            System.out.println();
        }
        }
	    break;
	    case 3:System.out.println("������Ҫͳ�Ƶ��ı����ƣ�");
	    Scanner sc04=new Scanner(System.in);
		String d=sc04.next();
		BufferedReader br = null;
		try {
			File f = new File("D:",d);
			br = new BufferedReader(new FileReader(f));
			StringBuffer sb = new StringBuffer();
			String str = null;
			while((str = br.readLine()) != null) {
				sb.append(str);
			}
			System.out.println("������Ҫ�����ĵ��ʣ�");
			Scanner sc05=new Scanner(System.in);
			String e=sc05.next();
			String regex = e;
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(sb);
			
			int num = 0;
			while(matcher.find()) {
				num++;
			}
			
			System.out.println(e+"���ı��г��ִ���Ϊ�� " + num);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(null != br) {
					//�ر���Դ
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	    break;

	    case 4:System.out.println("���������");
	    return;
	    default:System.out.println("����Ĳ�����������������ѡ��");    
	}
		}while(op !=0);
	    
	}

		private static void menu() {
			
		
	}

	

}
