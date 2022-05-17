package find;

import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class FileSearch {
	public void SearchKeyword(File file,String keyword){
		//����У��
		verifyParam(file, keyword);
		
		//�ж�ȡ
		LineNumberReader lineReader = null;
		try {
			lineReader = new LineNumberReader(new FileReader(file));
			String readLine = null;
			while((readLine =lineReader.readLine()) != null){
				
				//�ж�ÿһ����,���ֹؼ��ʵĴ���
				int index = 0;
				int next = 0;
				int times = 0;//���ֵĴ���
				//�жϴ���
				while((index = readLine.indexOf(keyword,next)) != -1) {
					next = index + keyword.length();
					times++;
				}
				if(times > 0) {
					System.out.println("��"+ lineReader.getLineNumber() +"��" + "���� "+keyword+" ����: "+times);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//�ر���
			close(lineReader);
		}
	}
 
	
	private void verifyParam(File file, String keyword) {
		//�Բ�������У��֤
		if(file == null ){
			throw new NullPointerException("�ļ�Ϊ��");
		}
		if(keyword == null || keyword.trim().equals("")){
			throw new NullPointerException("the keyword is null or \"\" ");
		}
		
		if(!file.exists()) {
			throw new RuntimeException("�ļ�������");
		}
		//��Ŀ¼
		if(file.isDirectory()){
			throw new RuntimeException("the file is a directory,not a file");
		}
		
		//�ɶ�ȡ
		if(!file.canRead()) {
			throw new RuntimeException("�ļ����ɶ�");
		}
	}
	
	
	private void close(Closeable able){
		if(able != null){
			try {
				able.close();
			} catch (IOException e) {
				e.printStackTrace();
				able = null;
			}
		}
	}
}
