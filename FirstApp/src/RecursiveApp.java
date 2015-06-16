
public class RecursiveApp {
	
	
	public String MyRecursiveExample(String anyName){
	 
		
			if (anyName.length()==1)
				return anyName;
			
			char inMyName = anyName.charAt(anyName.length()-1);
			String myReverseWord = inMyName + MyRecursiveExample(anyName.substring(0,anyName.length()-1)); 
			return  myReverseWord;
			
		
	}
	
	public static void main(String[] args) {
		
		RecursiveApp obj = new RecursiveApp();
		System.out.println(obj.MyRecursiveExample("ppA elbisreveR tsriF yM"));
	}

}
