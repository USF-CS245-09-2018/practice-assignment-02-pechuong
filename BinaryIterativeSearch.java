public class BinaryIterativeSearch implements Practice2Search {
	public String searchName() {
	       return "Binary Iterative Search";
	}
	public int search(int[] arr, int target) {
		int low = 0;
		int top = arr.length - 1;

		for (int i = 0; low < top; i++) {
			int mid = top - low / 2;
			if (target < arr[mid]) {
				top = mid - 1;
			} else if (target == arr[mid]) {
				return mid;
			} else {
				low = mid + 1;
			}
		}
		return -1;	
	}

}
