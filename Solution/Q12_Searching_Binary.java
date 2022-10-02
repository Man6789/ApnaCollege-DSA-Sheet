package dsa.searching;
import java.util.*;


public class Searching_Binary {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//int arr[] = null;
		//arr = takeInput(arr);
		//display(arr);
		int[] arr = {1,5,8,9,24,67,89};
		System.out.println(arr[binarySearch(arr, 67)]);
		
		
 	}
	
	public static int binarySearch(int[] arr, int a) {
		int lo=0, hi=arr.length-1;
		
		while(lo<=hi) {
			int mid = (hi+lo)/2;
			if (arr[mid] < a) {
				lo = mid +1;
			}else if(arr[mid] > a) {
				hi = mid - 1;
			}else {
				System.out.println("Fuck");
				return mid;
			} 
		}
		
		return 0;
	}//binarySearch end
	
	
	/*
	public static int[] takeInput(int arr[]) {
		System.out.println("Enter size");
		int size = sc.nextInt();	
		arr = new int[size];
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;
	}//takeInput end 
	*/
	
	/*
	public static void display(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
	*/
	
	
	

}//main class end
