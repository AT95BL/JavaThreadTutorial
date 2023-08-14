public class Main
{
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("Currently " + Thread.activeCount() + (Thread.activeCount() == 1 ? " thread is active" : " threads are running"));
		
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setName("MAINNNNNN");
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setPriority(10);
		System.out.println("Current Thread Priority: " + Thread.currentThread().getPriority());
		/*
			Scale [1,10]
			The higher number means higher priority!!!
			
			Thread.currentThread().setPriority(N);
			N>10 throws IllegalArgumentException
			N<1 throws IllegalArgumentException
		*/
		
		System.out.println(Thread.currentThread().isAlive());
		
		try
		{
			for(int i=3; i > 0; i--)
			{
				System.out.println(i);
				Thread/*.currentThread()*/.sleep(1000);
			}
		}
		catch(InterruptedException ex)						//		Razlog zbog kojeg main() metoda moze da baca InterruptedException izuzetak!!!
		{
			ex.printStackTrace();
		}		
	}
}