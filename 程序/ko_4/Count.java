package ko_4;
	import java.io.*;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	public class Count {
	    public static void main(String[] args){
	        int count = 0;
	        File f = new File("c:/text.txt");
	        String s = "";
	        StringBuffer sb = new StringBuffer();
	        try {
	            BufferedReader br = new BufferedReader(new FileReader(f));
	            while((s=br.readLine())!=null){
	            sb.append(s+'\n');
	            }br.close();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        Pattern p = Pattern.compile("\\b[a-zA-Z]+\\b");
	        Matcher m = p.matcher(sb.toString());
	        while(m.find()){
	            System.out.println(m.group());
	            count++;
	        }
	        System.out.println("总共"+count+"个单词");
	    }
	}