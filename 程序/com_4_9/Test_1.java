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
        File f = new File(file.getParent(), "new" + file.getName());//读取内容
        System.out.println("进行操作的java文件是：" + file.getAbsolutePath());
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
                if (!(str.trim().startsWith("//"))) {  //如果不是以//开头,就保存
                    bw.write(str);
                    bw.newLine();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally { //写出内容
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
