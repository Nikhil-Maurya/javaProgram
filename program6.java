/* 

Question=>
Given a non-negative int n,
compute
the count of the occurrences of 8 as a digit,
except that an 8
with another 8 immediately to
its left counts double,
so 8818 yields 4.

count8(8) → 1
count8(818) → 2
count8(8818) → 4
======================
approach==>

English==>
Java Syntax=>int 

English==>the count of the occurrences of 8 as a digit,
Java Syntax=>

int num=88188;
		int temp1=0,count=0;
		while(num!=0)
		{
			temp1=num%10;
			if(temp1==8)
			{
				count++;
			}
							
			num=num/10;
			temp2=temp1;
		}
		
English==>with another 8 immediately to
its left counts double,
Java Syntax=>

int temp2=0;

if(temp2==temp1)
				{
					count+=2;
				}
temp2=temp1



English==> so 8818 yields 4.
Java Syntax=>

    temp1=num%10;
			if(temp1==8)
			{
				if(temp2==temp1)
				{
					count+=2;
				}
				else
				{
					count++;
				}
			}
			
			
			



*/


class  Program6
{
	public static void main(String[] args)
	{
		int num=88188;
		int temp1=0,temp2=0,count=0;
		while(num!=0)
		{
			temp1=num%10;
			if(temp1==8)
			{
				if(temp2==temp1)
				{
					count+=2;
				}
				else
				{
					count++;
				}
			}
			
			num=num/10;
			temp2=temp1;
		}
		
		System.out.println(count);
	}
}


