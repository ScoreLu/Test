package find;

import java.util.StringTokenizer;

public class Sentence {
	 String s;
	    String regex = "[\\s\\d\\p{Punct}]+";//Ĭ��regex
	    Sentence(String s){
	        this.s = s;
	    }
	    void setRegex(String regex) {
	        this.regex = regex;
	    }
	    //����split()��������ӡ�������ڵ�λ�ã����Դ�Сд
	    void getLocation(String word) {
	        String words[] = s.split(regex);
	        for(int i=0;i<words.length;i++) {
	            if(words[i].equalsIgnoreCase(word)) {
	            	int b=i+1;
	                System.out.print("��"+b+"�����ʳ���");
	            }
	        }
	    }
	    //����StringTokenizer�࣬�õ����ʳ��ֵĴ��������Դ�Сд
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
