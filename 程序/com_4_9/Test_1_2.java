package com_4_9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Test_1_2 {

	public static void removeComments(File javaFile){
    StringBuffer aa =new StringBuffer();
	//��ȡ����
	try(FileReader bb=new FileReader(javaFile);BufferedReader cc=new BufferedReader(bb);){
		while(true){
			String line =cc.readLine();
			if (line == null)
                break;
            if (!line.trim().startsWith("//"))
            		//���������//��ͷ,�ͱ���
                aa.append(line).append("\r\n");
		}
	}catch(IOException e){
		e.printStackTrace();
	}
    try(
    		FileWriter dd=new FileWriter (javaFile);
    		PrintWriter ff=new PrintWriter(dd);
    		){
    	//д������
    	ff.write(aa.toString());
    }catch(IOException e){
    	e.printStackTrace();
    }
	}

}
