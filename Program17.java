/*
WAP to determine the sum of elements in the array

*/
import java.util.Scanner;

public class ArrayProgram2 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter number of elements = ");
		int n=scr.nextInt();
		int [] a=new int[n];
		int sumodd=0;
		int sumeven=0;
		
		System.out.print("Enter numbers: ");
		for(int i=0;i<n;i++){
			a[i]=scr.nextInt();
			if(a[i]%2==0)
			{
				sumeven +=a[i];
				
			}else 
			    sumodd +=a[i];
		}
		
		System.out.println("sum of odd number= "+sumodd);
		System.out.println("sum of even number= "+sumeven);
			
	}

}
