package Java;

public class Replace {
	
	public static void main(String[] args) {
		
//		String vicky="hi hi ho hi";
//		String all = vicky.replaceAll(" ", "");
//		System.out.println(all);
//		
//		int code = vicky.hashCode();
//		String of = all.toUpperCase();
//		System.out.println(of);
		
		String s= "vickycy";
		String r="";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			String b = String.valueOf(c);
			if(!r.contains(b))
			{
				r=r+b;
			}
			}
		System.out.println(r);
		}
		
		
		
		
		
//		char s='x';
//		String concat = all.concat(vicky);
//		System.out.println(concat);
//		String of2 = String.valueOf(s);
//		System.out.println(of2);
//		
//		String string = Character.toString(s);
//		System.out.println(string);
//		
//		
	}


