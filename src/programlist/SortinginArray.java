package programlist;

import java.util.Arrays;

public class SortinginArray {

	public static void main(String[] args) {
		int []a= {0,0,0,0,1,0,1,1,1,0};
		
		int temp;
		   for (int i = 1; i < a.length; i++) {
		    for (int j = i; j > 0; j--) {
		     if (a[j] < a [j - 1]) {
		      temp = a[j];
		      a[j] = a[j - 1];
		      a[j - 1] = temp;
		     }
		    }
		   }
		   for (int i = 0; i < a.length; i++) {
		     System.out.println(a[i]);
		   }
		
System.out.println("You can also use below method by importing array classs");
Arrays.sort(a);
for(int c:a)
{
	System.out.println(c);
}
		   
	}

}
