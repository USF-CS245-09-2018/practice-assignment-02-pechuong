public class BinaryRecursiveSearch implements Practice2Search {
	public String searchName() {
		return "Binary Recursive Search";
	}
	public int search(int[] arr, int target) {
		return search(arr, target, 0, arr.length);	
	}
	public int search(int[] arr, int target, int low, int top) {
		if (low > top) {
			return -1;
		}
		int mid = top - low / 2;
		if (target < arr[mid]) {
			return search(arr, target, low, mid - 1);
		} else if (target == arr[mid]) {
			return mid;
		} 
		return search(arr, target, mid + 1, top);
	}
}
