
public class Calculator {
	
	//int Sum1 = 100;
	//int Sum2 = 200;
	//int Sum;
	
		int sumMethod(int Sum1, int Sum2) {
		
		int Sum= Sum1 +Sum2;
		
		return Sum; 
		
	} 
	 
		
	// Recursive example
	
	int myString(int n)
	{
		int result;
		System.out.print(n + " x ");
		if(n==1) return 1;
		result = myString(n-1)* n; 
		return result;
		
	}
	
	
	
	 
}
