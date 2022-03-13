package Java;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class G {
	
	public static void main(String[] args) {
		
		String s = "god is god";
		String[] sp=s.split(" ");
		Set<String>s2= new LinkedHashSet<>();
		for (String string : sp) {
				s2.add(string);
				
			
			
		}
		
//		System.out.println(Arrays.asList(sp));
//		
//		
//		
//		
//		
//		for (String string : sp) {
//			System.out.println(string);
//			
	System.out.println(s2);
		}
	

}
