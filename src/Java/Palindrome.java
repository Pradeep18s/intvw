package Java;

public class Palindrome {

	public static void main(String[] args) {

		String s = "02020";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			rev = rev + c;
		}
		if (s.equals(rev)) {
			System.out.println("Palindrome");

		} else {
			System.out.println("Not a palindrome");
		}
	}

}
