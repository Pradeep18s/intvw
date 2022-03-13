package Java;

public class CountOfNo {
	
	public static void main(String[] args) {
		
		int num=123;
		int count=0;		//i is remainder
		while(num>0)				//j is number getting reversed
		{						//a is quotient
			
			count++;
			num=num/10;
		}
		System.out.println(count);	
		
	}

}
