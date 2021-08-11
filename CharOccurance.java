package Week1.Day2.Assignment;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
// declare and initialize a variable count to store the number of occurrences
		int count = 0;

// convert the string into char array
		char arr[] = str.toCharArray();

//get the length of the array
		int l = arr.length;
		System.out.println("Length of the array is:" + l);

// traverse from 0 till the array length 
		for (int i = 0; i < l; i++) {

// Check the char array has the particular char in it
			if (arr[i] == 'e') 

// if is has increment the count
				count = count + 1;
			

			// print the count out of the loop

		}
System.out.println("Total Occurance of charcter 'e' is :"+count);
	}
}
