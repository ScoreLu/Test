package ko_4;

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	public class Reader {
	    public static void main(String[] args)
	    {
	      
	        String url = "C:/Test.txt";  // Ҫ��ȡ���ļ�·���������Լ��޸ĳ��Լ���·�� 
	  	       
	        File file = new File(url);// ��ȡ�ļ�����
	        if (!file.exists() || file.isDirectory())
	        {
	            System.out.println("�ļ������ڣ�");
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
	            e.printStackTrace(); // ��ȡ���ļ����� 
	        }

	        String info = sb.toString();
	        int num = 0;
	        for (int i = 0; i < info.length(); i++)
	        {
	          
	            if ("A".equals(info.charAt(i) + ""))  // �����ַ��ж��Ƿ���A�������A�ͽ�������1 
	            {
	                num++;
	            }
	        }
	        System.out.println("�ļ���A�ĸ�����" + num);
	    }
	}