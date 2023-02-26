import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("");
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		for(int i=0;i<n;i++) {
			int minIndex=i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[minIndex])minIndex=j;
			}
			swap(i,minIndex,arr);
		}
		System.out.println("Elements after Selection sort are as : ");
		for(int i:arr)System.out.print(i+" ");
	}
	
	public static void swap(int index1,int index2,int arr[]) {
		int t = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=t;
	}
}
