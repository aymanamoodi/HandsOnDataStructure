package JavaPractice;

public class SelectionSort {
	
	void Sorting(int [] arr) {
		for(int i=0 ;i<arr.length;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) 
					minIndex=j;
			}
			int temp= arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
	}
	void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= { 4, 2, 6, 8, 1, 3, 7, 5 };
		SelectionSort ss= new SelectionSort();
		ss.Sorting(arr);
		ss.print(arr);
		

	}

}
