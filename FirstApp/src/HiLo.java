import java.util.Random;
import java.util.Scanner;


public class HiLo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Picks a random number from 1-100 to guess right (In 7 guesses)");
		int number=100;
		int userInput;
		Scanner scanUserInput = new Scanner(System.in);
		Random myRandomNumber = new Random();
		int randomNumber=myRandomNumber.nextInt(number);
		
		 
		
		for (int i=0;i<7;i++){
			
		userInput=scanUserInput.nextInt();
			
		if (userInput == randomNumber){
					
			System.out.println("Congatulation ! You guessed right");
			i=7;
		}
		else 	if (userInput < randomNumber){
						System.out.println("Too Low");
				} 
				if (userInput>randomNumber){
						System.out.println("Too High");
						//System.out.println("Wrong Guess");
						//System.out.println(randomNumber);
				}
		
				 if (i==6){
					 	System.out.println("Sorry You guessed Wrong !");
					 	System.out.println("It was " + randomNumber);
					 	System.out.println("Game Over");
				}
		
		}
	}

}
