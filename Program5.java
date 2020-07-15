/*
Quesstion==>
Given 2 int values, 
return true if they are both in the range 30..40 
inclusive, or they are both in the range 40..50 inclusive.
in3050(30, 31) ? true
in3050(30, 41) ? false
in3050(40, 50) ? true
====================================================
Approach==>

English==>Given 2 int values
Java Syntax=>int i,j;

English==>return true if they are both in the range 30..40 inclusive,
or they are both in the range 40..50 inclusive.
Java Syntax=>
if(((i>=30 & i<=40)&& (j>=30 & j<=40))||((i>=40 & i<=50)&& (j>=40 & j<=50)))
{	System.out.println(true);
}
else
{
	System.out.println(true);
}

====================================================
*/


class Program5
{
	public static void main(String [] args)
	{
		int i=34,j=44;
		if(((i>=30 && i<=40)&& (j>=30 && j<=40))||((i>=40 && i<=50)&& (j>=40 && j<=50)))
		//(true && false) && (true && true)  || (true && true) (false && false)
		// false && true || true && false
		// false || false
		{	System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}

	}

}
