public class Main
{
	public static void main(String[] args) throws InterruptedException
	{
		MyThread thread1 = new MyThread();
		
		MyRunnable runnable1 = new MyRunnable();
		Thread thread2 = new Thread(runnable1);
		/*
			Napravio sam klasu MyRunnable koja implementira Runnable interface.
			Napravio sam objekat runnable1 koji je instanca te klase.
			Napravio sam objekat thread2 klase Thread tako sto sam u Constructor poslao 
			objekat klase koja implementira Runnable interface.
			
			Eto to je ta prica oko famoznog 2. nacina pravljenja objekata preko klase koja
			nije nasljednica klase Thread ali zato implementira Runnable interface.
			
			Prednost lezi u tome sto klasa MyRunnable eksplicitno ne nasljedjuje neku od Java klasa
			recimo Thread ili tako nesto. Ona samo implementira Runnable interface sto znaci da za istu
			imamo pravo jednom eksplicitno da uvedemo nasljedjivanje. Java ne dozvoljava multiple inheritance
			tako da klasa MyThread koja je eksplicitno klasa nasljednica klase Thread nema pravo vise da naslijedi
			bilo koju drugu klasu. (Naravno sve klase implicitno jesu potomci Object klase..)
 		*/
		
		thread1.start();
		thread2.start();
		
		System.out.println("Even after main thread throws exception because 1/0..the two other threads will continuo executing.." + 1/0);
	}
}