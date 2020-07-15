public class ArrayPanlindrome {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 3, 2, 1 };

		boolean b = checkPalin(a);
		if(b){
			System.out.println("its Pallindrome");
		}else{
			System.out.println("not pallindrome");
		}

	}

	static boolean checkPalin(int[] a) {
		for (int i = 0; i < a.length / 2; i++) {
			if (a[i] != a[a.length - 1 - i]) {
				return false;
			}
		}
		return true;
	}

}
