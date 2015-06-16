
public class ReverseMyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myWord ="Gambal Nadar";
		
		//char fwords = myWord.charAt(5);
		//System.out.println(fwords);
		int lenOfWord = myWord.length()-1;
		
		for(int i=lenOfWord;i>=0;i--)
		{
			char fwords = myWord.charAt(i);
			//char fwords = myWord.charAt(8);
			//System.out.println(myWord.charAt(i));
			System.out.print(fwords + " ");
		}
		
		
		Calculator obj = new Calculator();
		System.out.println(+ obj.myString(8));
		System.out.println(myWord.substring(1,5));
		
		
	}

}