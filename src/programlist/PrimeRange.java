package programlist;

public class PrimeRange {

	public static void main(String[] args) {
		int i=21;
		int count=0;
		for(i=21; i<=100; i++)
		{  boolean flag=false;
			for(int j=2; j<i; j++ )
			{
				if(i%j==0)
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				count=count+1;
				
				System.out.println(i);
			}
			
		}
		System.out.println("No of prime number is :"+count);

	}

}
