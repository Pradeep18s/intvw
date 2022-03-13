package Java;

public class RevSTrSPace {

	public static void main(String[] args) {

		String s = "Pradeep sriram";
		String op = "";
		String[] sp = s.split(" ");

		for (String x : sp) {
			String rev = "";

			for (int i = x.length() - 1; i >= 0; i--) {

				rev = rev + x.charAt(i);
			}
			op = op + rev + "";
			System.out.println(rev);

		}
	}
}
