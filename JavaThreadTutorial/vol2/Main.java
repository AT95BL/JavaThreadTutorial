public class Main
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread thread2 = new MyThread();
		
		thread2.start();
		System.out.println(thread2.isAlive());
		/*
			Rezultira ispisom
			true - posljedica thread2.isAlive()
			this thread is running - posljedica Override run() metode
			
			Medjutim,
			
			thread2.run();			
			System.out.println(thread2.isAlive());
			
			rezultira ispisom
			this thread is running - posljedica Override run() metode
			false - posljedica thread2.isAlive()
			
			tako da ako zelis da thread-ovi rade konkurentno onda za svaki od njih pozivas .start() metodu
			koja stalno poziva .run() metodu i sve to traje dok se thread nasilno ne zaustavi sad da li implicitno ili eksplicitno
			to zavisi od programera, opisa problema..
			A, ako zelis da samo u nekom eksplicitnom vremenskom trenutku 't' neki thread odradi run, e onda thread2.run()..
		*/
		System.out.println(thread2.getName() + " sto je naslijedio od roditelja tj. od main-thread-a"); // 5 -sto je naslijedio od main-thread-a !!!
		
		System.out.println("Number of active threads: " + Thread.activeCount());
		
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon());
		
	}
}