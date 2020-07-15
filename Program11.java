import java.util.Scanner;
/*
WAP to convert Binary to decimal 
*/

public class Bin2Dec {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=scr.nextInt();
		int numsys=2;
		System.out.println(" base value : "+numsys);
		
		System.out.println("Decimal of "+n+" = "+num(n,numsys));
	
	}
	
	
	static String  num(int n,int numsys)
	{
		
		int out=0; 
		int count=0;
		
		while(n!=0){
			int rem=n%10;
			
			if(rem==0 || rem==1){
				
				int p=pow(numsys,count);//2^count
				out = out + (rem*p);// (number*2^count)and adding to previuos number;
				count++;
				n=n/10;	
				
			}else
			{
				return "Please Enter combination of 1 and 0 digits only!!!" ;

			}			
			
		}
		
		return (out+"");
	}
	
	static int  pow(int n,int count)
	{
		if(count==0)
			return 1;
		
		int m=n;
		while(count!=1){//3//2
			n *=m;//2*2*
			count--;//2
		}
		
		return (n);
	}
	
	
}
