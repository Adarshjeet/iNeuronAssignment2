import java.util.Scanner;

public class MergeSort {
	public static void main(String[] args) {
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size: ");
		n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("");
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		mergeSort(arr,0,n-1);
		System.out.println("Elements after Merge sort are as : ");
		for(int i:arr)System.out.print(i+" ");
	}
	
	public static void mergeSort(int[] arr,int low,int high) {
		if(low<high) {
			int mid = (low+high)/2;
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	
	public static void merge(int arr[],int low,int mid,int high) {
		int left = mid-low+1;
		int right = high-mid;
		int[] lArr = new int[left];
		int[] rArr = new int[right];
		for(int i=0;i<left;i++)lArr[i]=arr[low+i];
		for(int i=0;i<right;i++)rArr[i]= arr[mid+i+1];
		int j=0,k=0;
		while(j<left&& k<right) {
			if(lArr[j]<rArr[k])arr[low++]=lArr[j++];
			else arr[low++]=rArr[k++];
		}
		while(j<left)arr[low++]=lArr[j++];
		while(k<right)arr[low++]=rArr[k++];
	}
}
