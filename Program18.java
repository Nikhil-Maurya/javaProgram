
//WAP to determine nth maximum number where n specified by user

//mth minium number m=2;

public class MaxMinNumber {

	public static void main(String[] args) {

		int n = 3;
		int a[] = { 10, 25, 45, 8, 5, 89, 121 };
		int len = a.length;
		int m = 2;

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
				
			}

		}
		for (int j = 0; j < a.length; j++) 
			System.out.print(a[j] + " ");	

		System.out.println();
		System.out.println("len : "+len);
		System.out.println(n + " maximum number: " + a[len - n]);
		System.out.println(m + " minimum number: " + a[m-1]);
	}

}
