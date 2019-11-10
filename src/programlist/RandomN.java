package programlist;

import java.util.Random;
import java.util.Scanner;

public class RandomN {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		Random rd=new Random();
		int n=rd.nextInt(10);
		int count=5;
		int i=5;
		while(i>=1)
		{
			System.out.println("Enter any no from 0 to 9 "+" Attempt remaining:"+" " +count);
			int n1=sn.nextInt();
			if(n1>n)
			{
				System.out.println("Your number is greater than random number");
				
			}
			else if(n1<n)
			{
				System.out.println("Your number is less than random number");
				
			}
			else
			{
				System.out.println("Congratulation, finally you catch it"+" "+n);
				break;
			}count--;i--;
			}
			if(i==0)
			{
				System.out.println("Your time is over");
				
			}
		
		
			
			
			
	}

}
