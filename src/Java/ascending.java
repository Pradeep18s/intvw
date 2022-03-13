package Java;

public class ascending {

	public static void main(String[] args) {

		int a[] = { 2, 5, 7, 4, 1, 3 };

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			System.out.println(a[i]);
			
			System.out.println("hiii");
			
		}
	}
}
