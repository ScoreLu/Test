package ko_4;
import java.io.*;
public class CopyFile {
	
		public static void main(String args[]){
			if(args.length!=2){//args.length是数组args的长度
				System.out.println("参数不正确，无法完成复制！正确用法：");
				System.out.println("java Copy 源文件名 目的文件名");
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
				System.out.println("文件不存在，请检查您的输入：");
			}catch(IOException e){
				e.printStackTrace();
			}
			
			try{
				int b;
				while((b=fis.read())!=-1){
					fos.write(b);
				}
				fos.flush();
				System.out.println("文件复制成功！");
			}catch(IOException e){
				System.out.println("文件写入错误！");
			}
		}
	}
