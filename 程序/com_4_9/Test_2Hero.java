
package com_4_9;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
public class Test_2Hero { 

public static  void main(String[] args) {
		        //创建一个Hero garen
		        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
	Hero h = new Hero();
		        h.name = "garen";
		        h.hp = 666;
		          
		        //准备一个文件用于保存该对象
		        File f =new File("D:/garen.lol");
		 
		        try(
		            //创建对象输出流
		            FileOutputStream fos = new FileOutputStream(f);
		            ObjectOutputStream oos =new ObjectOutputStream(fos);
		            //创建对象输入流              
		            FileInputStream fis = new FileInputStream(f);
		            ObjectInputStream ois =new ObjectInputStream(fis);
		        ) {
		            oos.writeObject(h);
		            Hero h2 = (Hero) ois.readObject();
		            System.out.println(h2.name);
		            System.out.println(h2.hp);
		               
		        } catch (IOException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        } catch (ClassNotFoundException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		        }
		            
		    }
		}
	