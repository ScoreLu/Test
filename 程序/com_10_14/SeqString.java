package com_10_14;
public   class SeqString implements IString {
	 public  char[] strValue; 
	 public  int curLen; 
	 public SeqString ( ) {//构造一个空串 
	  strValue = new char[0];
	  curLen = 0;
	 }
	    public SeqString (String str ) {
	     char[] tempchararray = str.toCharArray(); 
	     strValue = tempchararray;
	     curLen = tempchararray.length;
	    }
	       public SeqString( char[] value) {//以字符数组构造串对象 
	        this.strValue = new char[value.length]; 
	        for (int i = 0; i < value.length; i++) { //复制数组        
	            this.strValue[i] = value[i];
	        }
	        curLen = value.length;
	       }

	 
	 public char charAt(int index) {  // 返回顺序串中第index个字符
	  if (index < 0 || index >= curLen)
	          throw new StringIndexOutOfBoundsException(index); 
	  return strValue[index]; 
	   }
	 
	  public void allocate (int newCapacity)  {// 扩充字符串的存储容量，参数指定容量

	   char[] temp = strValue; 
	   strValue = new char[newCapacity]; 
	   for(int i=0; i<temp.length; i++)
	            strValue[i] = temp[i];
	  }


	 public void clear() {
	  curLen = 0; 

	 }

	 public IString insert(int offset, IString str) {
	  if (offset < 0||offset > this.curLen )
	       throw new StringIndexOutOfBoundsException("插入位置不合法"); 
	  int  len=str.length();   //str串的长度
	  int newcount= this.curLen+len; //插入后串的长度
	  if (newcount>strValue.length)
	       allocate(newcount);
	  for (int i = this.curLen - 1; i >= offset; i--) { //后移
	            strValue[len + i] = strValue[i]; }
	  for (int i = 0; i < len; i++){   //插入
	            strValue[ offset + i] = str.charAt(i);
	   }
	  this.curLen=newcount;   //修正串长

	  return this;
	 }

	 public boolean isEmpty() {
	  return curLen == 0;

	 }

	 public int length() {
	  
	  return curLen;
	 }

	 public IString substring(int begin, int end) {//截取子串
	  if(begin==0&&end==curLen)
	   return this;
	  else {
	   char[] buffer=new char[end-begin];
	   for(int i=0;i<buffer.length;i++) {
	    buffer[i]=this.strValue[i+begin];
	   }
	   return new SeqString(buffer);
	 }

	 }
	@Override
	public IString delete(int begin, int end) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public IString concat(IString str) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int compareto(SeqString str) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int indexOf(IString str, int begin) {
		// TODO Auto-generated method stub
		return 0;
	}public void display() {
		  String str=new String(strValue);
		  System.out.println(str);
		 }

		}

	 