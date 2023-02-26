import java.util.Arrays;
import java.util.Scanner;

public class DuplicateElement {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter Array Size : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		Arrays.sort(arr);
		boolean flag = false;
		System.out.println("Duplicates elements are: ");
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[i-1]) {
				flag = true;
				System.out.print(arr[i]+" ");
			}
		}
		if(!flag)System.out.println("No duplicate elements found");
		
	}
	
}
