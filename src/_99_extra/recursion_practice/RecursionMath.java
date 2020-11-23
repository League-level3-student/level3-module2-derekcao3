package _99_extra.recursion_practice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RecursionMath {
	
	public static int recursiveMultiplication(int number, int times) {
		//2. if times is 1 
		if(times==1) {
			return number;
		}
			//3. return number 
		
		//4. else return number + recursionMultiplication(number, times-1)
		else {
			return number +  recursiveMultiplication(number, times-1);
		}
	}
	
	//6. Try this one on your own! 
	//Hint: if numberToDevideBy is bigger than number, you can't divide anymore
	public static int recursiveDivision(int number, int numberToDevideBy) {
		if(numberToDevideBy==0) {
			return 0;
		}
		else if(numberToDevideBy == number) {
			return 1;
		}
		else if(number<numberToDevideBy) {
			return 0;
		}
		else {
			return recursiveDivision(number-numberToDevideBy, numberToDevideBy)+1;
		}
	}
	
	//8. Try this one on your own!
	public static int recursivePower(int number, int power) {
		if(power==0) {
			return 1;
		}
		else{
			return number*recursivePower(number, power-1);
		}
		
	}
	
	
	
	@Test
	void testMultiplication() {
		assertEquals(12, recursiveMultiplication(3, 4));
		//1  Add more JUnit tests like the one above to test your method
		assertEquals(21, recursiveMultiplication(3, 7));
		assertEquals(24, recursiveMultiplication(4, 6));
		assertEquals(50, recursiveMultiplication(5, 10));
	}
	
	
	@Test
	void testDivision() {
		//5  Add JUnit tests to test your method
		System.out.println(recursiveDivision(12, 4));
		assertEquals(3, recursiveDivision(12, 4));
		assertEquals(7, recursiveDivision(21, 3));
		assertEquals(4, recursiveDivision(40, 10));
	}
	
	
	@Test 
	void testPower() {
		//7  Add JUnit tests to test your method
		assertEquals(27, recursivePower(3, 3));
		assertEquals(16, recursivePower(4, 2));
		assertEquals(4, recursivePower(2, 2));
	}
	
}
