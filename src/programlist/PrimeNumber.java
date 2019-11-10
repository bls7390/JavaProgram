package programlist;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=5;
		int i;
		for(i=2; i<n; i++)
		{
			if(n%i==0)
			{
				System.out.println("Number is not prime");
			break;
			}
		}
		if(i==n)
		{System.out.println("number is prime");
		
		}
		

	}

}
