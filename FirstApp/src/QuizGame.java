import java.util.Scanner;


public class QuizGame{
	
	char answer;
	int result;
	Scanner inputScanner = new Scanner(System.in);
	public void startGame(){
		
		System.out.println("Can we start the Game Y /N ?");
		answer=inputScanner.next().charAt(0);	
		
		if (answer=='N'){
			System.out.println("You have Exited");
		}
		else if (answer=='Y'){
			System.out.println("Lets Start the Game");	
		}
		else if (answer!='Y' || answer!='N'){
			System.out.println("Please enter Y / N");
			startGame();
		}
	}
	
	public void quizOne(){
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println("1) Melbourne");
		System.out.println("2) Anchorage");
		System.out.println("3) Juneaue");
		
		int answer1=inputScanner.nextInt();
		
		//switch (answers1){
		
		//}
		if (answer1==1 || answer1==2){
			System.out.println("Answer is wrong");
			System.out.println();
		}
		else if (answer1==3){
			System.out.println("Answer is right!");
			System.out.println();
			result=1;
		}
		
		else //if(answer1!=1 || answer1!=2 || answer1!=3 )
		{
			System.out.println("Please Enter 1 / 2 / 3");
			System.out.println();
			//quizOne();
		}
		
		
	}

	public void quizTwo(){
		System.out.println("Q2) Can you stroe the value of 'cat' in a variable of type int?");
		System.out.println("1) Yes");
		System.out.println("2) No");
		
		int answer2=inputScanner.nextInt();
		
		if (answer2==1){
			System.out.println("Answer is wrong");
			System.out.println();
		}
		else if (answer2==2){
			System.out.println("Answer is right!");
			System.out.println();
			result=result+1;
		}
		else if(answer2!=1 || answer2!=2 || answer2!=3 )
		{
			System.out.println("Please Enter 1 / 2 ");
			System.out.println();
			quizTwo();
		}
		  
		
		
	}
	
	
	public void quizThree(){
		System.out.println("Q3) What is the result of 9+6/3");
		System.out.println("1) 8");
		System.out.println("2) 11");
		System.out.println("3) 5");
		
		int answer3=inputScanner.nextInt();
		 
		if (answer3==1 ||answer3==3 ){
			System.out.println("Answer is wrong");
			System.out.println();
		}
		else if (answer3==2){
			System.out.println("Answer is right!");
			System.out.println();
			result=result+1;
		}
		
		else //if(answer1!=1 || answer1!=2 || answer1!=3 )
		{
			System.out.println("Please Enter 1 / 2 ");
			System.out.println();
			quizThree();
		}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuizGame obj=new QuizGame();
		obj.startGame();
		obj.quizOne();
		obj.quizTwo();
		obj.quizThree();
		int finalResult=obj.result;
		if (finalResult==3){
		System.out.println("You have done a great job " + obj.result + " out of 3 correct");
		System.out.println("Thank you for playing");
		}
		else{
		System.out.println("Over all you got " + obj.result + " out of 3 correct");
		System.out.println("Thank you for playing");
		}

	}

}
