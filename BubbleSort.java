import java.util.Scanner;

public class BubbleSort {

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
			for(int j=0;j<n-1;j++) {
				if(arr[j]>arr[j+1])swap(j,j+1,arr);
			}
		}
		System.out.println("Elements after Bubble sort are as : ");
		for(int i:arr)System.out.print(i+" ");
	}
	
	public static void swap(int index1,int index2,int arr[]) {
		int t = arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=t;
	}
}
