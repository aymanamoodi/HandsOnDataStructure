package JavaPractice;

public class LinearSearch1 {
	
void Linear(int arr[],int value) {
	System.out.println("in for loop");
for(int i=0;i<arr.length;i++) {
	if(arr[i]==value) {
		System.out.println("the value is found at index"+i);
	break;
	}
}
}

public static void main(String []args) {
	System.out.println("the main program");
	int arr[]= {4,1,6,8,5,2,3,7,9};
LinearSearch1 ls= new LinearSearch1();
ls.Linear(arr, 5);
}
}
