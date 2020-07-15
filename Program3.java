/*
Scenario3:
question:
Given two int values, Print their sum. Unless the two values
are the same, then Print double their sum.

testcases:
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
====================================================================
English==>Given two int values
java syntax==> int a,b;

English==> Print their sum
java syntax==> int sum=a+b;

English==>Unless the two values are the same, then Print double their sum.
java syntax==>
if(a!=b)
{
	System.out.println("values are not same, Sum= "+a+"+"+b+"="+sum);
}	
else
{
	System.out.println("values are same, Sum= 2("+a+"+"+b+") ="+(2*sum));
}

=======================================================================
*/

class Program3
{
	public static void main(String[] args)
	{
		int a=2;
		int b=2;
		int sum=a+b;
		if(a!=b)
		{
			System.out.println("values are not same, Sum= "+a+"+"+b+"="+sum);
		}	
		else
		{
			System.out.println("values are same, Sum= 2x("+a+"+"+b+") ="+(2*sum));
		}

	}
}
