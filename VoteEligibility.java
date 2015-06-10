
public class VoteEligibility {
	

	public static void main(String[] args) {
		byte MyAge=17;
		char VowelCheck = 'z';
		int CheckLeapYear =2015;
		
		System.out.println("Hello");
		
		//Vote eligibility code	
				if (MyAge < 18){
					System.out.println("You are not eligible to vote. :(");
				}
				else
				{
					System.out.println("You are eligible to vote. :)");
				}
				
		//To check the number is odd or even 
				
				if (MyAge % 2 != 0){
					System.out.println("And Your Age " + MyAge + " is an Odd Number");
				}
				else
				{
					System.out.println("And Your Age " + MyAge + " is an Even Number");
				}
				if (VowelCheck == 'a' || VowelCheck == 'e' || VowelCheck == 'i'|| VowelCheck == 'o' || VowelCheck == 'u'){
					System.out.println(VowelCheck + " is a Vowel");
				}
				else
				{
					System.out.println(VowelCheck + " is a consonant");
				}
				
				
		//Leap Year code
			
				
				if (CheckLeapYear % 100 != 0 && CheckLeapYear % 400 != 0 ) {
					
					if(CheckLeapYear % 4 != 0 ){
					
					System.out.println("Not a Leap year");
					}
					else
					{
						System.out.println("Leap year");
					}
				}
				
						

		}
}
