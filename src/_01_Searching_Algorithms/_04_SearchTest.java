package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _00_Sorting_Algorithms._00_SortedArrayChecker;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] list = {"apple", "banana", "pear" };
		assertEquals(_00_LinearSearch.linearSearch(list, "banana"), 1);
		assertEquals(_00_LinearSearch.linearSearch(list, "pear"), 2);
		assertNotEquals(_00_LinearSearch.linearSearch(list, "orange"), 3);
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] list = {1,2,3,4,5,6,7,8,9};
		assertEquals(_01_BinarySearch.binarySearch(list, 1, 4, 3), 2);
		assertEquals(_01_BinarySearch.binarySearch(list, 3, 5, 4), 3);
		assertNotEquals(_01_BinarySearch.binarySearch(list, 3, 8, 4), 2);
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] list = {100,200,300,400,500};
		assertEquals(_02_InterpolationSearch.interpolationSearch(list, 500), 4);
		assertEquals(_02_InterpolationSearch.interpolationSearch(list, 300), 2);
		assertNotEquals(_02_InterpolationSearch.interpolationSearch(list, 100), 2);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] list = {20,40,60,80};
		assertEquals(_03_ExponentialSearch.exponentialSearch(list, 40), 1);
		
	}
}
