package com_10_14;
public   class SeqString implements IString {
	 public  char[] strValue; 
	 public  int curLen; 
	 public SeqString ( ) {//����һ���մ� 
	  strValue = new char[0];
	  curLen = 0;
	 }
	    public SeqString (String str ) {
	     char[] tempchararray = str.toCharArray(); 
	     strValue = tempchararray;
	     curLen = tempchararray.length;
	    }
	       public SeqString( char[] value) {//���ַ����鹹�촮���� 
	        this.strValue = new char[value.length]; 
	        for (int i = 0; i < value.length; i++) { //��������        
	            this.strValue[i] = value[i];
	        }
	        curLen = value.length;
	       }

	 
	 public char charAt(int index) {  // ����˳���е�index���ַ�
	  if (index < 0 || index >= curLen)
	          throw new StringIndexOutOfBoundsException(index); 
	  return strValue[index]; 
	   }
	 
	  public void allocate (int newCapacity)  {// �����ַ����Ĵ洢����������ָ������

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
	       throw new StringIndexOutOfBoundsException("����λ�ò��Ϸ�"); 
	  int  len=str.length();   //str���ĳ���
	  int newcount= this.curLen+len; //����󴮵ĳ���
	  if (newcount>strValue.length)
	       allocate(newcount);
	  for (int i = this.curLen - 1; i >= offset; i--) { //����
	            strValue[len + i] = strValue[i]; }
	  for (int i = 0; i < len; i++){   //����
	            strValue[ offset + i] = str.charAt(i);
	   }
	  this.curLen=newcount;   //��������

	  return this;
	 }

	 public boolean isEmpty() {
	  return curLen == 0;

	 }

	 public int length() {
	  
	  return curLen;
	 }

	 public IString substring(int begin, int end) {//��ȡ�Ӵ�
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

	 