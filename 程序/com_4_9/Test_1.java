package com_4_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Test_1 {

	public static void remote(File file) {
        File f = new File(file.getParent(), "new" + file.getName());//��ȡ����
        System.out.println("���в�����java�ļ��ǣ�" + file.getAbsolutePath());
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
 
        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            while (true) {
                String str = br.readLine();
                if (str == null)
                    break;
                if (!(str.trim().startsWith("//"))) {  //���������//��ͷ,�ͱ���
                    bw.write(str);
                    bw.newLine();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally { //д������
            try {
                bw.close();
                fw.close();
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
}
	}
}
