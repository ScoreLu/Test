package ko_4;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;

public class FF {
	private static RandomAccessFile raf;

	public static void main(String[] args){
    	final int Num=20;
    	int[] aa=new int[Num];
    	@SuppressWarnings("unused")
		int[] aa2=new int[Num];
    	@SuppressWarnings("unused")
		long fp;
    	aa[0]=1;
    	aa[1]=1	;
    	int i;
    	for(i=2;i<Num;i++)
    	aa[i]=aa[i-1]+aa[i-2];
    	try{
    	raf = new RandomAccessFile("dataout.txt","rw");
    	 System.out.println("dataout.txt中的内容为（全部按顺序摆放）：");
    	 for(i=0;i<Num;i++){
    	raf.writeInt(aa[i]);
    	 System.out.println(aa[i]+"\t");
    	 if(i%8==0)
    	 System.out.println(""); 
    	 }
    	 raf.close();
    	 }catch(FileNotFoundException e){
    		e.printStackTrace();
    	}catch(Exception e){
    		e.printStackTrace();
    	}
    }
}
