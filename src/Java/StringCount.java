package Java;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCount {
public static void main(String[] args) {
	

	String s = "god is god";
	Map<String, Integer> mp = new LinkedHashMap<String, Integer>();	
	String[] sp=s.split(" ");
	for (String c : sp) {
		if (mp.containsKey(c))
		{
			
			Integer count=mp.get(c);
			mp.put(c, count+1);
		}else {
			mp.put(c, 1);
			
		}
		
	}
	System.out.println(mp);
	
}
}
