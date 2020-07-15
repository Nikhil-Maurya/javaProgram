public class ArrayInsertElement {

	public static void main(String[] args) {
		
		int pos=2, element=25;
		int a[] = { 1, 2, 3, 3, 2, 1 };
		System.out.print(" a: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.print("after adding :  ");

		int b[] = insertElement(a, element, pos);
		System.out.println("position: "+pos+" & element: "+element);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

	}

	static int[] insertElement(int[] a, int num, int pos) {

		int[] b = new int[a.length + 1];
		for (int i = 0, j = 0; j < b.length;) {

			if (j == pos) {
				b[j] = num;
				j++;
			} else {
				b[j] = a[i];
				i++;
				j++;
			}
		}
		return b;

	}

}
