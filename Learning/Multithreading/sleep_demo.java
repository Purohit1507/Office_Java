package multithreading;


class Mythread extends Thread 
{
	
	public void run()
	{
		
	for( int i=1; i<=10; i++)
		System.out.println("child method");
}
}

public class sleep_demo {
	public static void main(String[] args) {
	
		//System.out.println(Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(7);
		
		Mythread t=new Mythread();
		t.setPriority(10);
		t.start();
		
		for( int i=1; i<=10; i++)
		System.out.println("main method");
	}
	

}
