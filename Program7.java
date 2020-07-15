/*
Question=>
Write a program to print below numbers without using loops
98765432123456789


============================
987654321
=>



*/
class  Program7
{
	public static void main(String[] args)
	{
		int n=9;
		number(n,n-1);
		
	}
	public static void number(int m, int n)
	{
		
			
		if(n<m && m!=0)
		{	
			if(m==1)
			{
				System.out.print(m);
				number(m,m+1);
			}
			else
			{
				System.out.print(m);
				number(n,n-1);
			}
	
		}
		else if(n>m && n<=9)
		{
			System.out.print(n);
			number(m+1,n+1);
		}
		
	}
	
}


