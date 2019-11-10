package programlist;

public class ReverseString2 {

	public static void main(String[] args) {
		String s="This is Ram";
		String reve=" ";
	String []x=	s.split(" ");// Split based on space
	for(String a:x)
	{
		StringBuffer bf=new StringBuffer(a); //Change String to StringBuffer to make string mutable(changeable
	    String abc=bf.reverse().toString();//After revers make this string as immutable
	    reve=reve+abc+" ";
	
	}
	String ac=reve.trim();
	 System.out.println(ac);

	}

}
