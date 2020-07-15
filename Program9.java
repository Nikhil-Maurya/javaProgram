/*

==>Prime number
1)WAP To Determine weather the given number
is Prime number or not
2)Display all the prime numbers in the range 
1-100000
3)Display first four Prime numbers only
4)Display sum of first four Prime numbers only

*/


class PrimeNo{
	
	public static void main(String[] args){
		int n=15;
		int r1=1,r2=100;
		int c=4;
		
		System.out.println("==========checking whether "+n+" is Prime or not=============");
		boolean b=prime(n);
		System.out.println("is "+n+" prime number : "+b);
		System.out.println("==========range of "+r1+" to "+r2+"==============");
		range(r1,r2);
		System.out.println("==========first "+c+" Prime number ==============");
		count(c);
		System.out.println("==========sum of first "+c+" Prime number==============");
		sum(c);

	}
	
	static boolean prime(int n)
	{	
		
		for (int i=2;i<=n/2;i++)
		{
			int temp = n%i;
			
			if(temp==0)
			{
				return false;
			}
		}
		return true;
	}
	
	static void range(int a, int b)
	{
		while(a!=b)
		{
			boolean b2=prime(a);
			
			if(b2==true){
				System.out.println(a);
			}
			
			a++;
		}
		
	}	
	
	static int count(int c)
	{
		int cn=0,i=1,sum=0;
		while(cn!=c)
		{
			boolean b3= prime(i);
			if(b3==true){
				cn++;
				System.out.println("count: "+cn);
				System.out.println("Prime number: "+i);
				sum +=i;
			}
			i++;
		}
		return sum;
	}
	
	static void sum(int n)
	{
		
		System.out.println("Sum of first "+n+" number= "+count(4));
	}
	
}
