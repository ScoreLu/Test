package ko_4;
import java.io.*;
public class CopyFile {
	
		public static void main(String args[]){
			if(args.length!=2){//args.length������args�ĳ���
				System.out.println("��������ȷ���޷���ɸ��ƣ���ȷ�÷���");
				System.out.println("java Copy Դ�ļ��� Ŀ���ļ���");
				System.exit(0);
			}
			copyFile(args[0],args[1]);
		}
		
		@SuppressWarnings("hiding")
		public static void copyFile(String src,String obj){
			FileInputStream fis=null;
			FileOutputStream fos=null;
			try{
				fis=new FileInputStream(src);
				fos=new FileOutputStream(obj);
			}catch(FileNotFoundException e){
				System.out.println("�ļ������ڣ������������룺");
			}catch(IOException e){
				e.printStackTrace();
			}
			
			try{
				int b;
				while((b=fis.read())!=-1){
					fos.write(b);
				}
				fos.flush();
				System.out.println("�ļ����Ƴɹ���");
			}catch(IOException e){
				System.out.println("�ļ�д�����");
			}
		}
	}
