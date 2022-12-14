
public class RevString {
	//function for reversing a string
	public static void revString(String input){
		
		String rev = "";
		for(int i= input.length();i>=1;i--){
			rev+=input.charAt(i-1);
		}
		System.out.println(rev);
		
	}
	//main method
	public static void main(String[] args) {
		revString("Hello World");
		//revString("<String>")
	}
}