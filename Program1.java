//scenario1
import java.util.Scanner;

public class Program4 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1 for true or enter 0 for false");
		int a=sc.nextInt();
		System.out.println("enter 1 for true or enter 0 for false");
		int b=sc.nextInt();
		
		boolean weekday=(a==1);
		boolean vaction=(b==1);
		if(weekday==false || vaction==true)
		{	
			System.out.println("true we sleep in");	
		}
		else
		{
			System.out.println("false we dont sleep");
		}		
	}
}
