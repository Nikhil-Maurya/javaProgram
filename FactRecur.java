
/*

Question=>
==>WAP to Determine factorial of a given number
using recursion
(submit program and tracing)

*/



class FactRecur{
	
	public static void main(String[] args){
		
		int n=5;
		
		System.out.println(factorial(n));
	}
		
	static int factorial(int n){
		int fact=1;
		if(n>=1){
			
			fact =n*factorial(n-1);
		}
		if(n<1)
		{
			return 1;
		}
		return fact;
	}
}
