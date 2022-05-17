package ko_4;

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	public class Reader {
	    public static void main(String[] args)
	    {
	      
	        String url = "C:/Test.txt";  // 要读取的文件路径，可以自己修改成自己的路径 
	  	       
	        File file = new File(url);// 读取文件数据
	        if (!file.exists() || file.isDirectory())
	        {
	            System.out.println("文件不存在！");
	            return;
	        }
	        StringBuffer sb = null;
	        BufferedReader br;
	        try
	        {
	            br = new BufferedReader(new FileReader(file));
	            String temp = null;
	            sb = new StringBuffer();
	            temp = br.readLine();
	            while (temp != null)
	            {
	                sb.append(temp + "\r");
	                temp = br.readLine();
	            }
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace(); // 读取的文件内容 
	        }

	        String info = sb.toString();
	        int num = 0;
	        for (int i = 0; i < info.length(); i++)
	        {
	          
	            if ("A".equals(info.charAt(i) + ""))  // 挨个字符判断是否是A，如果是A就将总数加1 
	            {
	                num++;
	            }
	        }
	        System.out.println("文件中A的个数：" + num);
	    }
	}