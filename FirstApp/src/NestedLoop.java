
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		int k=4;
		
		for(i=1;i<=5;i++)
		{
		
			for(j=1;j<=i;j++)
				{
				System.out.print(j);
				}
			System.out.println("");
				
		}
		
		for(i=1;i<=4;i++)
		{
		
			//int k=4;
			for(j=1;j<=k;j++)
				{
				System.out.print(j);
				}
			k--;
			System.out.println("");
			
				
		}
		 
	}

}
