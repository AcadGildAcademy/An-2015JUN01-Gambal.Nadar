
public class ReverseMyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myWord ="Pallavi Tamhankar";
		
	//char fwords = myWord.charAt(5);
		//System.out.println(fwords);
		int lenOfWord = myWord.length()-1;
		
		for(int i=lenOfWord;i>=0;i--)
		{
			char fwords = myWord.charAt(i);
			//char fwords = myWord.charAt(8);
			//System.out.println(myWord.charAt(i));
			System.out.print(fwords + " ");
			//System.out.print(i + " " );
		}
		
	}

}
