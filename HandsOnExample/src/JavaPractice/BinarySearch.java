package JavaPractice;

public class BinarySearch {

	void searching(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length - j-1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
	void print(int [] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 4, 2, 6, 8, 1, 3, 7, 5 };
		BinarySearch bs = new BinarySearch();
		bs.searching(arr);
		bs.print(arr);

	}

}
