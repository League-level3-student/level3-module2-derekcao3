package _02_More_Algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i)=="cracked") {
				return i;
			}
		}
		return 0;
		
	}
	
	public static int countPearls(List<Boolean> oysters) {
		int pearls=0;
		for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)==true) {
				pearls++;
			}
		}
		return pearls;
		
	}
	public static double findTallest(List<Double> peeps) {
		double tallest = 0;
		for (int i = 0; i < peeps.size(); i++) {
			if(peeps.get(i)>tallest) {
				tallest = peeps.get(i);
			}
		}
		return tallest;
	}
	
	public static String findLongestWord(List<String> words) {
		String longest = "";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length()>longest.length()) {
				longest = words.get(i);
			}
		}
		return longest;
	}
	
	
	
	public static int multiply(int x, int y) {
		return x*y;
	}
	public static boolean isPrime(int x) {
		for (int i = 2; i < x; i++) {
			if(x%i==0) {
				return false;
			}
		}
		return true;

	}
	public static boolean isSquare(double x) {
		if(Math.sqrt(x)%1==0) {
			return true;
		}
		else return false;
	}
	public static boolean isCube(double x) {
		if(Math.cbrt(x)%1==0) {
			return true;
		}
		else return false;
	}

	public static boolean containsSOS(List<String> messages) {
		// TODO Auto-generated method stub
		String SOS =  "... --- ...";
		for (int i = 0; i < messages.size(); i++) {
			if(messages.get(i).contains(SOS)) {
				return true;
			}
		}
		return false;
	
	
	}
	public static List<Double> sortScores(List<Double> results) {
		Collections.sort(results);
		return results;
	
	}
	
	public static String[] sortDNA(String[] unsortedSequences){
		
		return unsortedSequences;
		
	}
}
	
	


