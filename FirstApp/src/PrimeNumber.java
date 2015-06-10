
public class PrimeNumber {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i;
		int j ;
				
		for(i=1;i<100;i++)
		{	 
			int k=0;
			for(j=2;j<i;j++)
			{	 
				//System.out.println("(" + j + " )");
				if(i%j==0)
				//	break;
					//System.out.println(i%j); 
				k=1;
				
				//System.out.println(i);
			}
			if(k==0)
				System.out.print(i + " ");
				 
				 
		}
		/////////
		
		 
				
	}
		


	

}
