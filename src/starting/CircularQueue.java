package starting;

public class CircularQueue {

	CircularQueue prev, next;
	
	int data;

	static CircularQueue newNode() {

		CircularQueue n = new CircularQueue();
		n.data = 0;
		n.next = null; 
		n.prev = null;

		return n;
	}

	public static void printSm(CircularQueue head) {
		
		CircularQueue x = head;
  
		while (x.next != null) {
			System.out.println(x.next);
			x = x.next;
		}
		System.out.println(x.data);

	}

	public static void add(CircularQueue head, int d) {

		CircularQueue x = head;

		while (x.next != null) {
			x = x.next;
		}

		CircularQueue newN = newNode();

		newN.data = d;
		newN.next = null;
		newN.prev = x;
		x.next = newN;
	}

	public static void main(String... args) {

		CircularQueue obj = new CircularQueue();

		add(obj, 3);
		add(obj, 7);
		add(obj, 6);
		add(obj, 2);
		
		add(obj, 5);
		add(obj, 2);
		add(obj, 1);
		add(obj, 8);
		add(obj, 3);
		add(obj, 4);
		add(obj, 4);
		add(obj, 5);
		add(obj, 1);
		add(obj, 7);
		add(obj, 0);
		add(obj, 9);
		add(obj, 8);
		add(obj, 7);
		add(obj, 6);
		add(obj, 5);
		add(obj, 490);

		printSm(obj);
	}
}
