class Test 
{
	public static void main(String[] args){
           int sum = 0;
	    int a =  30;
	    int b = 15;
	    int d = a&b;
	    for (int c = a&b;d>9;d = d>>>4){  
             sum +=a;
	}				System.out.println(Integer.toBinaryString(+sum));	
        }
}