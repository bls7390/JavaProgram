//Print one character from one string and one character from second string
//Example S1="Babu" and S2="Saha" Output=BSaabhua
package programlist;

public class S1toS2combination {

	public static void main(String[] args) {
		String s1="akhil";
		String s2="gupta";
		String s3=" ";
		for(int i=0; i<s1.length(); i++)
		{
			s3=s3+s1.charAt(i)+s2.charAt(i);
			
		}
		System.out.println(s3);

	}

}
