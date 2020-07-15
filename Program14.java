import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner scr= new Scanner(System.in);
		System.out.print("Enter range of fibonacci: ");
		int n=scr.nextInt();
		isfibo(n);

	}

	public static void isfibo(int range){
		int n1=0;
		int n2=1;
		System.out.print(n1 +" "+n2+" ");
		
		for(int i=range;i>=3;i--){
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
			
		}
	}
}
