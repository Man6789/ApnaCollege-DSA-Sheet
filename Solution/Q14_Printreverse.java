package dsa.sorting;
import java.util.*;

public class Printreverse {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		//int[] arr = {1,2,3,4,5,6};
		int j = arr.length-1;
		for(int i =0; i<3; i++) {
			
			System.out.print(arr[j] + " " + arr[i] + " ");
			j--;
			
		}
		
	}//main end

}
