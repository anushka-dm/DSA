import java.util.ArrayList;

public class ConsecutiveDuplicate {
	public static ArrayList<Integer> removeDuplicate(int arr[]) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				result.add(arr[i]);
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 3, 3, 3, 3, 4, 1, 4, 4, 4 };
		ArrayList<Integer> res = removeDuplicate(arr);

		for (int i : res) {
			System.out.println(i);
		}

	}
}
