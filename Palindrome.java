package Week1.Day2.Assignment;

public class Palindrome {

	public static void main(String[] args) {
String word1 ="madam";
String rev="";
for (int i = word1.length()-1; i>=0; i--) {
	rev=rev+word1.charAt(i);
}
if(word1.equals(rev)) {
	System.out.println("Given String is Palindrome");
}
else {
	System.out.println("Given String is not palindrome ");
}
	}
	

}
