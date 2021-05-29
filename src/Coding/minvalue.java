package Coding;

public class minvalue {
   
	public void test()
	{
		int a[] = {1, 34 , 15 , 67, 2, -1};
		
		int min = a[0];
		
		for(int i = 0 ; i <= a.length-1 ; i++)
		{
			
			if(a[i]<min)
			{
				min = a[i];
			}
		}
	 System.out.println(min);
	      
	
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		minvalue mn = new minvalue();
		mn.test();

	}

}
