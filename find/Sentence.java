package find;

import java.util.StringTokenizer;

public class Sentence {
	 String s;
	    String regex = "[\\s\\d\\p{Punct}]+";//默认regex
	    Sentence(String s){
	        this.s = s;
	    }
	    void setRegex(String regex) {
	        this.regex = regex;
	    }
	    //运用split()方法，打印单词所在的位置，忽略大小写
	    void getLocation(String word) {
	        String words[] = s.split(regex);
	        for(int i=0;i<words.length;i++) {
	            if(words[i].equalsIgnoreCase(word)) {
	            	int b=i+1;
	                System.out.print("第"+b+"个单词出现");
	            }
	        }
	    }
	    //运用StringTokenizer类，得到单词出现的次数，忽略大小写
	    int getCount(String word) {
	        s = s.replaceAll(regex, "#");
	        StringTokenizer fenxi = new StringTokenizer(s,"#");
	        int cnt = 0;
	        while(fenxi.hasMoreTokens()) {
	            String tocken = fenxi.nextToken();
	            if(tocken.equalsIgnoreCase(word))
	                cnt = cnt + 1;         
	        }
	        return cnt;
	    }
}
