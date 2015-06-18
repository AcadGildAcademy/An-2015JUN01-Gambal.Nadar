
public class SumAndAverage {

	
		
	int sum(int sumNumber)
	 {
		int sumOfNumber=0;
	   	for(int j=1;j<=sumNumber;j++)
		sumOfNumber = sumOfNumber + j;
		 
		return sumOfNumber;
		 
		 
	}
	
	double avg(int avgNumber)
	 {
		double sumOfNumber=0;
		double avgOfNumber=0 ;
		
		for(int j=1;j<=avgNumber;j++)
		sumOfNumber = sumOfNumber + j;
		avgOfNumber = sumOfNumber/avgNumber;
		return avgOfNumber;
		 
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumAndAverage obj =new SumAndAverage();
		System.out.println("The sum of - " + obj.sum(100));
		System.out.println("The Avg of - " + obj.avg(100));

	}

}
