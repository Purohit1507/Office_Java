package multithreading;

class Mythread2 extends Thread 
{
	
	public void run()
	{
		
	for( int i=0; i<=10; i++)
	{
	System.out.println("Seetha method");
	
	    try {
	    	Thread.sleep(2000);
	    }
	    catch (InterruptedException e){}
	}
	
	    //Thread.yield();  // If a thread wants to pause the current execution and give chance
	    //for remaining threads of same priority then we can use Yield method
}
}


public class Join_demo {
	public static void main(String[] args) throws InterruptedException {
	
		//System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(7);
		
		Mythread2 t=new Mythread2();
		//t.setPriority(10);
		t.start();
		t.join(10000);
		
		for( int i=0; i<=10; i++)
		{
		System.out.println("Rama method");
		}
	}
}	

