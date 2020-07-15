import java.util.Scanner;

public class AnyNumSys2AnyNumSys {

public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter Number : ");
		String n=scr.next();
	
		System.out.print("base current value : ");
		int numsys=scr.nextInt();
		
		System.out.print("base requierd base value : ");
		int reqnumsys=scr.nextInt();
		
		int num=num(n,numsys);
		String reqnum= reqnum(num,reqnumsys);
		
		System.out.println(reqnum);
	
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
			out = out + (k*temp);// added
			temp =temp*numsys;//
			
		}
		
		return (out);
	}
	
	
	static String  reqnum(int n,int numsys)
	{
		String temp="0123456789ABCDEF";
		String  out=""; 
		
		while(n!=0){
			int rem=n%numsys;
			
			char c=temp.charAt(rem);
			out=c+out;
			
			n=n/numsys;
			
		}
		
		return (out);
	}
	
}
