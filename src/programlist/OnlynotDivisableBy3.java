package programlist;

public class OnlynotDivisableBy3 {

	public static void main(String[] args) {
		
		for(int i=1; i<=21; i++)
		{
			if(i%3==0)
			{
				continue;
			}
			else {
				System.out.println(i);
			}
		}

	}

}
