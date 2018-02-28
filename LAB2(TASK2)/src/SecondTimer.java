
public class SecondTimer {

	
	static Thread thread = new Thread();
	
	public static void main(String[] args) throws InterruptedException
	{
		
		for(int i = 0; i<2000000; i++)
		{
			thread.sleep(1000);
			System.out.println(i);
			
		}
	}

}
