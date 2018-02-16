package JavaPractice;

public class InsertionSort {
	void sorting(int arr[]) {
		int i, j, key;
		for(i=1;i<arr.length;i++) {
			key=arr[i];
			j=i-1;
			while(j>=0&&arr[j]>key) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
	}

	void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 2, 6, 8, 1, 3, 7, 5 };
		InsertionSort is = new InsertionSort();
		is.sorting(arr);
		is.print(arr);

	}

}
