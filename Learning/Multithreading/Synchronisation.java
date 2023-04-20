package multithreading;

class display
{
	public synchronized void wish(String name)
	{
		for (int i=0; i<=10; i++)
		{
		System.out.print("good morning:");
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {}
		System.out.println(name);
		}
	}
}
class myThread extends Thread
{
	display d;
	String name;
	myThread(display d, String name) {

		this.d = d;
		this.name = name;
	}
	public void run()
	{
		d.wish(name);
	}
}

public class Synchronisation {
	public static void main(String[] args) {
    display d1=new display();
    display d2=new display();
    myThread t1=new myThread(d1,"dhoni");
    myThread t2=new myThread(d2,"yuvraj");
    t1.start();
    t2.start();
	}

}
