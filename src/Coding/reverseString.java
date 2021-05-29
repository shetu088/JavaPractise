package Coding;

public class reverseString {

	
	String s1 = "Shreshtha";
	
	public void reverse()
	{
		for(int i=s1.length()-1 ; i>=0 ; i--)
		{
			System.out.print(s1.charAt(i));
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      reverseString rs = new reverseString();
      rs.reverse();
	}

}
