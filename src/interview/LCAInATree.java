package interview;

public class LCAInATree {

	LCAInATree left,right;
	int data;
	
	LCAInATree(int x){
		this.data = x;
		this.left = null;
		this.right =  null;
	}
	
	private static LCAInATree createNew(LCAInATree root,int x) {
		LCAInATree node = new LCAInATree(x);
		return node;
	}
	
	

	private static LCAInATree findAndGetLCA(LCAInATree root, int x, int y) {

		LCAInATree temp = root;

		if (temp == null || temp.data ==x || temp.data ==y) {
			return temp;
		}
		LCAInATree leftLca = findAndGetLCA(temp.left, x, y);
		LCAInATree rightLCA = findAndGetLCA(temp.right, x, y);
		
		if(leftLca !=null && rightLCA !=null) {
			return temp;
		}
		
		if(leftLca !=null) {
			return leftLca;
		}
		
		if(rightLCA !=null) {
			return rightLCA;
		}
		
		return root;
	}
	
	public static void main(String[] args) {
		LCAInATree root = new LCAInATree(2);
		
		/*
		 *  		2
		 *  	3		 5
		 *  8	  6	 4   	9
	   7
	*/	
		root.left = createNew(root,3);
		root.right = createNew(root,5);
		root.left.left = createNew(root,8);
		root.left.right = createNew(root,6);
		root.right.left = createNew(root,4);
		root.right.right = createNew(root,9);
		root.left.left.left = createNew(root,7);
		
		LCAInATree ans = findAndGetLCA(root,7,6);
		
		System.out.println(ans.data);
	}

}
