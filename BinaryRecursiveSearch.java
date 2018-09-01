public class BinaryRecursiveSearch implements Practice2Search {
	public String searchName() {
		return "Binary Recursive Search";
	}
	public int search(int[] arr, int target) {
		return search(arr, target, 0, arr.length - 1);	
	}
	public int search(int[] arr, int target, int low, int top) {
		if (low > top) {
			return -1;
		}
		int mid = (top + low) / 2;
		//System.out.printf("Low: %d\nHigh: %d\nMid: %d\nTarget: %d\n", low, top, mid, target);
		if (target < arr[mid]) {
			return search(arr, target, low, mid - 1);
		} else if (target == arr[mid]) {
			return mid;
		} else { 
			return search(arr, target, mid + 1, top);
		}
	}
}
