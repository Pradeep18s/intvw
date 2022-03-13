package Java;

public class StringSplUpLo {

	public static void main(String[] args) {

		String str = "PradeepSri8@";

		int upper = 0, lower = 0, number = 0, special = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') { 						// if(Character.isUpperCase(ch))
				upper++;
			} else if (ch >= 'a' && ch <= 'z') { 				// if(Character.isLowerCase(ch))
				lower++;
			} else if (ch >= '0' && ch <= '9') { 				// if(Character.isDigit(ch))
				number++;
			} else {
				special++;
			}

			
				
		}
		System.out.println("upper="+upper);
		System.out.println("lower"+lower);
		System.out.println("number"+number);
		System.out.println("special"+special);
	}

}// even we can do by converting the character into int