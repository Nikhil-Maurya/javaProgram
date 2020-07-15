import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		
		Scanner scr= new Scanner(System.in);
		System.out.print("Enter string or nummber or palindrome: ");
		String s=scr.next();
		boolean b= ispalin(s);
		System.out.println( b);

		}

		public static boolean ispalin(String s){
			
			int n=s.length();
			for(int i=0;i<n/2;i++){
				if(s.charAt(i)!=s.charAt(n-1-i))
					return false;
				
			}
			return true;
		}
}
