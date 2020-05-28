package interview.sorting;

public class MergeSort {

	private static void merge(int arr[],int low,int mid,int high) {
		
		int i,j,k;
		int n1 = mid - low +1;
		int n2 = high - mid;
		
		i=0; j =0; k = low;
		int temp[] = new int[100];
		
		while(i<n1 && j<n2) {
			
			if(arr[i]<arr[j]) {
				temp[k++] = arr[i++];
			}else {
				temp[k++] = arr[j++];
			}
		}
		
		while(i<n1) {
			temp[k++] = arr[i++];
		}
		
		while(j<n2) {
			temp[k++] = arr[j++];
		}
		
		for(i=low;i<high;i++) {
			arr[i] = temp[i];
		}
		
	}
	private static int[] mergeSort(int arr[],int l,int r) {
	
		if(l<r) {
			
			int m = (l+r)/2;
			
			mergeSort(arr, l, m);
			mergeSort(arr, m+1, r);
			
			merge(arr,l,m,r);
		}
	
		return arr;
	}

	private static void swap(int a,int b) {
		int c;
		
		c=a;
		a=b;
		b=c;
	}
	private static int[] bubble(int arr[],int n) {
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					int c = arr[i];
					arr[i]= arr[j];
					 arr[j]= c;
				}
			}
		}

		for(int i=0;i<4;i++) {
			System.out.println(arr[i]);
		}
		
		return arr;
	}
	
	private static void swap(int arr[],int i,int j) {
		int c = arr[i];
		arr[i]= arr[j];
		 arr[j]= c;
	}
	public static void main(String[] args) {
		int arr[] = {5,1,12,9,6};

	//	arr = mergeSort(arr, 0, 4);

		//arr = bubble(arr,5);
		for(int i=0;i<5;i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\n");
		swap(arr,1,3);
		
		for(int i=0;i<5;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
