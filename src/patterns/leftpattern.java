package patterns;

public class leftpattern {

	
	public void pattern1()
	{
		for(int i =0 ; i <=5 ; i++) {
			
			for (int j = 0 ; j<=i ; j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
		leftpattern lp = new leftpattern();
		lp.pattern1();

	}

}


//output :
	
	/*0
	  01
	  012
	  0123
	  01234
	  012345*/
