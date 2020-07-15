/*
WAP to Determine sum of odd elements and even elements in an array

*/

import java.util.Scanner;

public class ArrayProgram1 {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.print("Enter number of elements = ");
		int n=scr.nextInt();
		int [] a=new int[n];
		int sum=0;
		
		System.out.print("Enter numbers: ");
		for(int i=0;i<n;i++){
			a[i]=scr.nextInt();
			sum +=a[i];
		}
		
		System.out.println("sum= "+sum);
	}

}
