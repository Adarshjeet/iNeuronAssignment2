import java.util.Scanner;

public class QuickSort {
	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("");
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		quickSort(arr,0,n-1);
		System.out.println("Elements after quick sort are as : ");
		for(int i:arr)System.out.print(i+" ");
	}
	public static void quickSort(int[] arr, int low, int high) {
		if(low<high) {
			int partition = findPivot(arr,low,high);
			quickSort(arr,low,partition-1);
			quickSort(arr,partition+1,high);
		}
	}
	
	public static int findPivot(int[] arr,int low,int high) {
		int pivot=high;
		int current = low-1;
		for(int i=low;i<high;i++) {
			if(arr[i]<arr[pivot]) {
				current++;
				swap(current,i,arr);
			}
		}
		swap(++current,pivot,arr);
		return current;
	}
	
	public static void swap(int index1,int index2,int arr[]) {
		int t = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=t;
	}
}
