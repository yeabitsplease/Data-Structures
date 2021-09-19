import java.util.*;

class ShiftedBinarySearch {
  public static int shiftedBinarySearch(int[] array, int target) {
    return shiftedBinarySearch(array, target, 0, array.length - 1);
  }
	
	public static int shiftedBinarySearch(int[] array, int target, int left, int right){
		if(left > right){
			return -1;
		}
		int middle = (left + right) / 2;
		int match = array[middle];
		int leftNum = array[left];
		int rightNum = array[right];
		if(target == match){
			return middle;
		} else if(leftNum <= match){
			if(target < match && target >= leftNum){
				return shiftedBinarySearch(array, target, left, middle - 1);
			} else {
				return shiftedBinarySearch(array, target, middle + 1, right);
			}
		} else {
			if(target > match && target <= rightNum){
				return shiftedBinarySearch(array, target, middle + 1, right);
			} else {
				return shiftedBinarySearch(array, target, left, middle - 1);
			}
		}
	}
}
