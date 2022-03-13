package Java;

public class NoSwap3rd {

	public static void main(String[] args) {

		int a = 10;
		int b = 30;
		System.out.println("Before swap a,b= " + a + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after swap a,b= " + a + b);

	}

}
