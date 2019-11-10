package programlist;

public class Fibonanci {

	public static void main(String[] args) {
		int sum;
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		for(int i=1; i<=10; i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(b);
		}

	}

}
