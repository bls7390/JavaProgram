package programlist;

import java.util.Scanner;

public class PalindramGivenNo {

	public static void main(String[] args) {
		int a,b,c;
		Scanner n=new Scanner(System.in);
		System.out.println("Enter number to check palindram number");
		int input=n.nextInt();
		a=input/10;
		b=a/10;
		c=input%10;
		if(b==c)
		{
			System.out.println("Number is palindram");
		}
		else
		{
			System.out.println("Number is not palindram");
		}

	}

}
