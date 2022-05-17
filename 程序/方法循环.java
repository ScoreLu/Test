class Ko
{
	public static void main(String[] args) 
	{   
		double sum= kebe(1,2,3,4);
		System.out.println(sum);
	}
     public static double kebe(double a,double b,double c,double d)
	{
		 double x= Math.sqrt(Math.pow(a-c,2)+Math.pow(b-d,2));
		 return x;
	}
}