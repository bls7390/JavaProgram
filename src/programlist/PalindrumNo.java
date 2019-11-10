package programlist;

public class PalindrumNo {

	public static void main(String[] args) {
		int a=111;
		int b, c, d;
		b=a/10;
		 d=b/10;
	     c=a%10;
		
		if(d==c)
		{
			System.out.println("Palindrum number");
		}
		else
		{
			System.out.println("Not a palindrum number");
		}
		

	}

}
