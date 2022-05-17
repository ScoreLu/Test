package co;

	public class Test{
	    public static void main(String[] args){
	        UseCompute uc = new UseCompute();
	        uc.useCom(new Add(), 2, 1);
	        uc.useCom(new Sub(), 2, 1);
	        uc.useCom(new Mul(), 2, 1);
	        uc.useCom(new Div(), 2, 1);
	        uc.useCom(new Div(), 2, 0);
	    }
	}