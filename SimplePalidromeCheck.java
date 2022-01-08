
public class SimplePalidromeCheck {
	public static void main(String[] args) {
	 String n = "madam"; // the original string
	 String m = "";      // create a empty string to store the string when read in reverse
	 int length = n.length(); // length of the original string
	for(int i =length -1; i >=0; i--) { // we reverse the original string
		 m = m + n.charAt(i); // storing the reversed string
	 }
	 // checking if the original string is equals to the reversed string
	 if(n .equals(m)) { 
		 System.out.println("the string is palidrome");
	 } else {
         System.out.println("the string is not palidrome");
	}

	}
}
 