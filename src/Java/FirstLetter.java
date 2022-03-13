package Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FirstLetter {

	public static void main(String[] args) {

		String s = "god is god";
		Map<String, Integer> mp = new LinkedHashMap<String, Integer>();
		String[] sp = s.split(" ");

		for (String one : sp) {

			char ch = one.charAt(0);
			System.out.println("Word   " + one);
			System.out.println("First Character    " + ch);

		}
	}
}
