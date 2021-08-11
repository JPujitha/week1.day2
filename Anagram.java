package Week1.Day2.Assignment;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {

		// *Declare a String
		String text1 = "stops";

		// *Declare another String
		String text2 = "potss";

// a) Check length of the strings are same then (Use A Condition)
		if (text1.length() == text2.length()) {
			System.out.println("Length of two strings is same");
		} else {
			System.out.println("Length of two strings is not same");
		}

//b) Convert both Strings in to characters
		char A1[] = text1.toCharArray();
		System.out.println("Array of string1 is : ");
		for (int i = 0; i < A1.length; i++) {
			System.out.println(A1[i]);
		}
		char A2[] = text2.toCharArray();
		System.out.println("Array of string2 is : ");
		for (int i = 0; i < A2.length; i++) {
			System.out.println(A2[i]);
		}

// * c) Sort Both the arrays
		//printing the sorted character array
		Arrays.sort(A1);
		Arrays.sort(A2);
		System.out.println("Sorted array 1: ");

		for (int i = 0; i < A1.length; i++) {
			System.out.println(A1[i]);

		}
		System.out.println("Sorted array 2: ");

		for (int i = 0; i < A2.length; i++) {
			System.out.println(A2[i]);
	
		}
			
		//printing the sorted String array
		System.out.println("First string Array Sort :"+Arrays.toString(A1));
		System.out.println("Second string Array Sort :"+Arrays.toString(A1));
		if(Arrays.equals(A1, A2)) {
			System.out.println("Given String is Anagram");
		}
		

	
	}
}
