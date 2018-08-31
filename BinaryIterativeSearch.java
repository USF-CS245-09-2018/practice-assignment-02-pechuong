public class BinaryIterativeSearch implements Practice2Search {
	public String searchName() {
		return "Iterative Search";
	}
	public int search(int[] arr, int target) {	
		for (int i = 0; i < arr.length; i++) {
			if (i == target) {
				return i;
			}
		}
		return -1;
	}
}
