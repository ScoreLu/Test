package Ko;

import java.util.Scanner;

public class Fibonacc {
	public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int a = fn(n);
	    System.out.println(a);
	}

	private static int fn(int n) {
	    if (n==1||n==2) {
	        return 1;
	    } else {
	        return (fn(n-1)+fn(n-2));
	    }
	}
	}