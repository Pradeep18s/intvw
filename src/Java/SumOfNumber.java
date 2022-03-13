package Java;

public class SumOfNumber {

	public static void main(String[] args) {
		
		int num=5896;
		int i=0,j=0,a=num;		//i is remainder
		while(a>0)				//j is number getting reversed
		{						//a is quotient
			
			i=a%10;
			j=j+i;
			a=a/10;
		}
		System.out.println(j);	
		
	}
	
}
