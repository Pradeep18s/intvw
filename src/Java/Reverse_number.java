package Java;

public class Reverse_number {
	
	public static void main(String[] args) {
		
		int num=1226;
		int rev=0,temp=0,a=num;		//i is remainder
		while(a>0)				//j is number getting reversed
		{						//a is quotient
			
			rev=a%10;
			temp=(temp*10)+rev;
			a=a/10;
		}
		System.out.println(a);	
		
		if(num==temp)				//to check palindrome in number
		{
			System.out.println("palindrome");
		}
		
	}

}
//12345/5===>i=5,j=(0*10)+5,a=1234
//even we can get the first four digit like this by getting the quotient of the first iteartion
//(used to segregate the number )