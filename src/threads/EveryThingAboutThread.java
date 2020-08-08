package threads;

public class EveryThingAboutThread extends Thread{

	@Override
	public void run() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			this.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {

		EveryThingAboutThread p1 = new EveryThingAboutThread();
		p1.start();
		
		
		EveryThingAboutThread p2 = new EveryThingAboutThread();
		p2.start();
		
		
		Shaadi s = new Shaadi();
		
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);
		Thread t3 = new Thread(s);
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
	}

}

class Shaadi implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	
}


/*
 * Findings
 * 1: Extending thread class means only 1 thread can be created per object.
 * 2: Implementing runnable interface means multiple thread can run on same/common object..so then comes the problem of
 * 	  wait( ) , notify( ) and syncronization and all.
 * 3: If you want to use multiple run methods then better to use Thread t1 = new Thread(new Runnable()  override run());
 * 4: wait( ) , notify( ) are object class methods so use Place.wait() or this.wait( ) or wait( ) all are same thing. where Place is 
 * class where run( ) method is present and we are calling wait( ) method.
 * 5: Locking: object is locked. and object = Monitor.  (Threads are not locked) 
 * 6: Entering inside the syn block means the thread acquired lock on the object.
 * 7: Now wait and notify must be called inside a synchronised context only.? why? why can't  you call outside..?
 *   Because: wait( ) means releasing the monitor and go into waiting state till someone(other thread) calls notify( )
 *   so how can you release something until you acquire it? and to acquire lock on the object/monitor you must
 *   go inside a synchronised block.
 *  
 * 8: Wait( ) , notify( ) , sleep( ) , join( )  all throws checked InterruptedException  so that means whenever you write 
 * 		these methods use try catch.
 * 9: Suppose you want to pass value to thread..so how would you do that?
 *   In the class MyThread implements Runnable create a constructor and pass
 *   final values to it.
 *   But in this implements scenario you can't pass diff values to diff threads..so for example Thread1 wants value1 , Thread2
 *   wants value2...not possible. To overcome this
 *   MyThread extends Thread...and start 50 threads on 50 diff objects. here you can
 *   pass diff values to diff threads
 * 
 */
