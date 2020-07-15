/*
Scenario2:
Question :
We have two monkeys, a and b, and the parameters aSmile
and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither 
of them is smiling.Print true if we are in trouble.

test cases==>
monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
===================================================================
English==>We have two monkeys, a and b,
and the parameters aSmile
java syntax==> boolean aSmile;

English==>and bSmile indicate if each is smiling.
java syntax==> boolean bSmile;

English==>We are in trouble if they are both smiling
java syntax==>aSmile==true && bSmile==true

English==>or if neither of them is smiling
java syntax==>aSmile==false && bSmile==false


if((aSmile==true && bSmile==true) || (aSmile==false && bSmile==false))
{
		System.out.println("We are in Trouble");
}
else
{
	System.out.println("We are safe");
}
=========================================================================
*/


class Program2
{
	public static void main(String[] args)
	{
		boolean aSmile=true;
		boolean bSmile=true;
		//if((aSmile=true && bSmile==true)||(aSmile==false && bSmile==false))
		if(aSmile==bSmile)
		{
			System.out.println("We are in Trouble");
		}
		else
		{
			System.out.println("We are safe");
		}

	}
}
