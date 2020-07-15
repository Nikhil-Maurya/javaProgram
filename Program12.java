import java.util.Scanner;

public class Any2Dec {

public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter Number : ");
		String n=scr.next();
	
		System.out.print("base value : ");
		int numsys=scr.nextInt();
		
		System.out.println("Decimal of "+n+" = "+num(n,numsys));
	
	}
	
	
	static int  num(String s1,int numsys)
	{
		int n=s1.length()-1;
		int out=0; 
		int temp=1;
		
		while(n>=0){
			String t="0123456789ABCDEF";///added
			char last=s1.charAt(n--);
			int k=t.indexOf(last);//added
			System.out.println("unit didgit: "+k);
			out = out + (k*temp);// added
			temp =temp*numsys;//
			
		}
		
		return (out);
	}
}
