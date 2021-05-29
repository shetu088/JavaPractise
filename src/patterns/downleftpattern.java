package patterns;

public class downleftpattern {

	
	
 public void pattern2()
{
	for(int i = 5 ; i>=0 ; i-- )
	{
		for(int j = 0  ;j<=i ;j++)
		{
			System.out.print(j);
		}
		
		System.out.println();
	}
	 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  downleftpattern dlp = new downleftpattern();
  dlp.pattern2();
	}

}
