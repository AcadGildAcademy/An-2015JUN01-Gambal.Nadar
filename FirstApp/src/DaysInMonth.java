
public class DaysInMonth {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
				String checkMonth ="Jan";
				int noOfDays=28;
				int enterMonth = 5;
				
				switch (enterMonth)
				{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: noOfDays=31;
				break;
				
				case 4:
				case 6:
				case 9:
				case 11: noOfDays=30;
				break;
				
				case 2: noOfDays=29;
				break;
				 		
				}
				System.out.println(noOfDays + " Days with switch statement");
				
			
				// with if else statement 
				
		 	
			if (checkMonth=="Jan" || checkMonth=="Mar" || checkMonth=="May" || checkMonth=="July" || checkMonth=="Aug" || checkMonth=="Oct" || checkMonth=="Dec")
			{
				System.out.println(checkMonth + " 31 Days with if..else.. statement");
								
			}
			else if (checkMonth=="April" || checkMonth=="June" || checkMonth=="Sept" || checkMonth=="Nov")
			{
				System.out.println(checkMonth + " 30 Days with if..else.. statement");
			}
			else if (checkMonth=="Feb")
			{
				System.out.println(checkMonth + " 28 /29 Days with if..else.. switch statement");
			}
			else
			{
				System.out.println(checkMonth +" is not a valid Month");
			}
		
		 
	}
	
}
