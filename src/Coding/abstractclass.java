package Coding;

public abstract class abstractclass {

	
	abstract public void test();
	
	public void test2()
	{
		System.out.println("in test2");
	}
	
	
 public class child1 extends abstractclass
{
	 
	 
		public void test() {
			
			System.out.println("in child1");
			
		}
	public void child1test()
	{
		System.out.println("in childtest1");
	}

	
}
	

public class grandchild extends child1
{
	public void test()
	{
		System.out.println("in grandchild");
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		//child1 ac =  new child1();
		
  // grandchild gc = new grandchild();
		
				
		
		
		
	}

}
