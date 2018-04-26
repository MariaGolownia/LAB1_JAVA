package Array;

public class Sort {

	public static Boolean isSortedInAscendingOrder(int[] array) {
		Boolean flag = false;
		for (int i = 1; i < array.length; i++) {
			if (array[i] >= array[i - 1]) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static Boolean isSortedInDescendingOrder(int[] array) {
		Boolean flag = false;
		for (int i = 1; i < array.length; i++) {
			if (array[i] <= array[i - 1]) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static Boolean isSorted(int[] array) {
		if (Sort.isSortedInAscendingOrder(array) || Sort.isSortedInDescendingOrder(array)) {
			return true;
		}
		else return false;
	}

}
