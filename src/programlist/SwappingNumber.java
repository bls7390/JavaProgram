package programlist;

public class SwappingNumber {
	
	static public void M1()
	{
		int a=2;
		int b=3;
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    
	    System.out.println("Value of a:"+a+" "+"Value og b:"+b);
	    
System.out.println("--------------------------------------------");	    
	}
	static public void M2()
	{
		int a=2;
		int b=3;
		b=a*b;
		a=b/a;
		b=b/a;
		System.out.println("Value of a:"+a+" "+"Value og b:"+b);
		System.out.println("--------------------------------------------");	
	}
	
	static public void M3()
	{
		int a=2;
		int b=3;
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("Value of a:"+a+" "+"Value og b:"+b);
		
	}

	public static void main(String[] args) {
		M1();
		M2();
		M3();
	}

}
