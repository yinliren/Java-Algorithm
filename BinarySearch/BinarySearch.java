package BinarySearch;

public class BinarySearch {
	
	
	private int Solution(int[] array, int target) {
		if(array == null || array.length == 0) return -1;
		int left = 0; 
		int right = array.length - 1;
		int result = -1;
		result = helper(array, left, right, target);
		return result;
	}
	
	private int helper(int[] array, int left, int right, int target) {
		while(left != right - 1) {
			int mid = left + (right - left) / 2;
			if(array[mid] == target) {
				return mid;
			}
			else if(array[mid] < target) {
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		if(array[left] == target) {
			return left;
		}
		else if(array[right] == target) {
			return right;
		}
		else {
			return -1;
		}
		
	}
	

	public static void main(String[] args) {

		BinarySearch sol = new BinarySearch();
		int[] arr = { 1,2,3,4,5,6,7,8,9,10 };
		int result = sol.Solution(arr, 100);
		System.out.println(result);
	}

}
