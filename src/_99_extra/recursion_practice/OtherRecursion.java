package _99_extra.recursion_practice;

public class OtherRecursion {

	public static int indexOf(String s, char ch, int pos) {
		if (pos >= s.length() || pos <0) return -1;			
		if (s.charAt(pos) == ch) return pos;
		return indexOf(s, ch,pos+1 );
		
	}
	
	public static long squares(long value) {
		if(value <= 1) return 1;
		return value *value + squares(value-1);

	}
	
	public static long fibonacci(long n) {
		if(n <=1) return n;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static long GCD(long num1, long num2) {
		if(num1==0) return num2;
		if(num2 ==0) return num1;
		return GCD(num2, num1 % num2);
		
	}
	public static void main(String[] args) {
		System.out.println("GCD(15,45): " + GCD(15,45));
		System.out.println("GCD(10,35): " + GCD(10,35));
		System.out.println("GCD(17,41): " + GCD(17,41));
		
		System.out.println("Fib(5): " + fibonacci(5));
		
		System.out.println("squares(8): " + squares(8));
		System.out.println("squares(16): " + squares(16));
		
		System.out.println("indexOf(): " + indexOf("abcdefghijklmnopqrstuvwxyz", 'g', 0));
		System.out.println("indexOf(): " + indexOf("abcdefghijklmnopqrstuvwxyz", 'g', 8));
		System.out.println("indexOf(): " + indexOf("abcdefghijklmnopqrstuvwxyz", '1', 0));
	}
}
