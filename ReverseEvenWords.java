package Week1.Day2.Assignment;


public class ReverseEvenWords {

	public static void main(String[] args) {
  		String test = "I am a software tester"; 
  		String[] arr1=test.split(" ");
  		for (int i = 0; i < arr1.length; i++) {
  			//System.out.println(i + arr1[i]);
			if(i%2!=0) {
				String word=arr1[i];
				String[] arr2=word.split("");
				for (int j = arr2.length-1; j>=0; j--) {
					System.out.print( arr2[j] );
				}
			}
				else 
				{
					System.out.print(" "+arr1[i]+" ");
				
				}
			}
		}

	}



