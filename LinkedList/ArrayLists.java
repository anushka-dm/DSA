import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList();
		arr1.add(1);
		arr1.add(2);
		System.out.println(arr1.get(0));

		for (int i = 0; i < arr1.size(); i++) {
			System.out.println(arr1.get(i));
		}
	}
}