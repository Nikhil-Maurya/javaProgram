/*
Quesstion==>
Write a Java Program to display
==>DELHI
condition:EnteredNo is Divisible by 2 and 3
==>BANGALORE
condition:EnteredNo is Divisible only by 2
==>MUMBAI
condition:EnteredNo is Divisible only by 3
==>KOLKATTA
condition: none of the condition Holds True
====================================================
Approach==>

English==>Write a Java Program to display
Java Syntax=>System.out.println("      ");

English==>
==>DELHI
condition:EnteredNo is Divisible by 2 and 3
Java Syntax=>
int n;
if(n%2==0 & & n%3==0)
		System.out.println("DELHI");

English==>
==>BANGALORE
condition:EnteredNo is Divisible only by 2 
Java Syntax=>
if(n%2==0)
		System.out.println("BANGALORE");

English==>
==>MUMBAI
condition:EnteredNo is Divisible only by 3 
Java Syntax=>
if(n%3==0)
		System.out.println("MUMBAI");

English==>
==>KOLKATTA
condition: none of the condition Holds True
Java Syntax=>
else
	System.out.println("KOLKATTA");

====================================================
*/


class Program4
{
	public static void main(String [] args)
	{
		int n=5;//example
		if(n%2==0 && n%3==0)
		//false && false
		{
			System.out.println("DELHI");
		}
		else
		if(n%2==0)
		//false
		{
			System.out.println("BANGALORE");
		}
		else
		if(n%3==0)
		//false
		{
			System.out.println("MUMBAI");
		}
		else
		{
			System.out.println("KOLKATTA");
		}

	}

}
