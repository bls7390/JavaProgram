package programlist;

public class ReverseArray {
	
	public static void main(String[] args) {
		int []a={2,4,6,7};
		
		for(int c:a)
		{
		System.out.println(c);
		}
		System.out.println("After reverse");
		for(int i=0; i<(a.length)/2; i++)
		{ int temp;
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
			
		}
		
		for(int arr:a)
		{ System.out.println(arr);
		}	
		
	
		
		
	}

}
