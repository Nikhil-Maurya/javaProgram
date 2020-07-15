
/*
WAP to convert decimal to Binary, Ocatal, hexadecimal Number System 
*/
public class NumberSys {

	public static void main(String[] args) {
		
		int n=15;
		
		System.out.println("binary of "+n+" = "+binaryof(n));
		
		System.out.println("octal of "+n+" = "+octalof(n));
		
		System.out.print("hexadecinmal of "+n+" = "+hexadecimalof(n));
		

	}
	
	
	static String  binaryof(int n)
	{
		String  out=""; 
		
		while(n!=0){
			int rem=n%2;
			out= rem+out;
			n=n/2;
			
		}
		 return (out);
	}
	
	
	static String  octalof(int n)
	{
		String  out=""; 
		
		while(n!=0){
			int rem=n%8;
			out= rem+out;
			n=n/8;
			
		}
		 return (out);
	}
	
	static String  hexadecimalof(int n)
	{
		String  out=""; 
		
		while(n!=0){
			int rem=n%16;
			out= hex(rem)+out;
			n=n/16;
			
		}
		 return (out);
	}
	
	
	static String hex(int rem) {
		
		switch(rem){
		
		case 10: return "A";
	
		case 11: return "B";
		
		case 12: return "C";
		
		case 13: return "D";
		
		case 14: return "E";
		
		case 15: return "F";

		}
		
		return (""+rem);
	}
	
	
	
	
}
