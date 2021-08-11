package Week1.Day2.Assignment;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		int  letter = 0, space = 0, num = 0, specialChar = 0;
char[] A =test.toCharArray();
for (int i = 0; i < A.length; i++) {
	if(Character.isDigit(A[i])) {
		num =num+1;

	}
	else if(Character.isAlphabetic(A[i])){
		letter=letter+1;
	}
	
	else if(Character.isSpaceChar(A[i])) {
		space=space+1;	
	}
	else{
		specialChar=specialChar+1;	
	}
}
	System.out.println("num :" + num);
	System.out.println("letter :" + letter);
	System.out.println("space : " + space);
	System.out.println("specialChar :" + specialChar);
		
	}

	

}
