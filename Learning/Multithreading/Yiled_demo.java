package multithreading;


class Mythread1 extends Thread 
{
	
	public void run()
	{
		
	for( int i=1; i<=10; i++)
		System.out.println("child method");
	    Thread.yield();  // If a thread wants to pause the current execution and give chance
	    //for remaining threads of same priority then we can use Yield method
}
}

public class Yiled_demo {
	public static void main(String[] args) {
	
		//System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(7);
		
		Mythread1 t=new Mythread1();
		//t.setPriority(10);
		t.start();
		
		for( int i=1; i<=10; i++)
		System.out.println("main method");
	}
	

}



