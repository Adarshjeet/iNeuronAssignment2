import java.util.Arrays;
import java.util.Scanner;

public class SubsetCheck {

	public static void main(String[] args) {
		int n1,n2 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Array Size: ");
		n1 = sc.nextInt();
		System.out.println("Enter Second Array Size: ");
		n2 = sc.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		System.out.println("");
		System.out.println("Enter distinct elements for Array 1");
		for(int i=0;i<n1;i++)arr1[i]=sc.nextInt();
		System.out.println("Enter distinct elements for Array 2");
		for(int i=0;i<n2;i++)arr2[i]=sc.nextInt();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		boolean flag = false;
		if(n1>n2) {
			flag = checkForSubset(arr1,arr2,n1,n2);
			if(flag)
				System.out.println("Yes , Second array is subset of First");

		}
		else {
			flag = checkForSubset(arr2,arr1,n2,n1);
			if(flag)
				System.out.println("Yes , First array is subset of Second");

		}
		if(!flag)
			System.out.println("No, arrays is not subset of anyone");
		
	}
	
	public static boolean checkForSubset(int[] arr1,int[] arr2,int n1,int n2) {
		for(int i=0;i<n2;i++) {
			int index = Arrays.binarySearch(arr1,arr2[i]);
			if(index<0)return false;
		}
		return true;
	}

}
