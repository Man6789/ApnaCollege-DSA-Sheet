package dsa.sorting;

public class Quick_Sort_Using_Recursion {
	public static void main(String[] args) {
		int[] arr = { 5, 180, 80, 90, 45, 3, 5, 6 };
		quickSort(arr, 0, arr.length - 1);

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}// main end

	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo >= hi) {
			return;
		}

		int left = lo, right = hi;
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];

		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}
			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		} // while end

		quickSort(arr, lo, right);
		quickSort(arr, left, hi);

	}// quickSort() end

}
