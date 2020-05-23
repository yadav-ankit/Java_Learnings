package interview;

public class DoubleLinkedList {

	int data;
	DoubleLinkedList left,right;
	
	private static DoubleLinkedList createNew(DoubleLinkedList head, int d) {
		DoubleLinkedList dd = new DoubleLinkedList();
		
		while(head.right != null) {
			head = head.right;
		}
		
		dd.data = d;
		dd.left = head;
		head.right = dd;
		dd.right = null;
		
		return dd;
	}
	
	
	private static void printAll(DoubleLinkedList head) {
		while(head.right != null) {
			head = head.right;
			
			if(head.right == null) {
				System.out.print(head.data);
			}else {
				System.out.print(head.data + " --> ");
			}
			
		}
		
	}
	
	private static void deleteNodeWithGivenValue(DoubleLinkedList head,int x) {
		DoubleLinkedList prev = head;
		DoubleLinkedList temp = head;
		while(temp.data != x) {
			prev = temp;
			temp = temp.right;
		}
	//	System.out.println(prev.data);
		
		prev.right = temp.right;
		temp.right.left = temp.left;
	
		temp.left = null;
		temp.right = null;
		
	}
	public static void main(String[] args) {
		
		DoubleLinkedList head = new DoubleLinkedList();
		createNew(head,3);
		createNew(head,5);
		createNew(head,8);
		createNew(head,1);
		createNew(head,4);
		createNew(head,9);
		
		printAll(head);
		
		deleteNodeWithGivenValue(head,4);
		
		System.out.println("\n");
		printAll(head);

	}

}
