
public class DynamicClass {

	private int arr[];
	private int nextEleIdx;

	public DynamicClass() {
		arr = new int[5];
		nextEleIdx = 0;
	}

	public int size() {
		return nextEleIdx;
	}

	public boolean isEmpty() {
		return nextEleIdx == 0;
	}

	public int get(int i) {
		if (i >= nextEleIdx) {
			// throw error
			return -1;
		}
		return arr[i];
	}

	public void add(int num) {

		if (nextEleIdx == arr.length) {
			doubleCapacity();
		}

		arr[nextEleIdx] = num;
		nextEleIdx++;
	}

	private void doubleCapacity() {

		int temp[] = arr;
		arr = new int[2 * temp.length];
		for (int i = 0; i < temp.length; i++) {
			arr[i] = temp[i];
		}
	}

	private void set(int idx, int ele) {
		if (idx >= nextEleIdx) {
			return;
		}
		arr[idx] = ele;
	}

	public int removeLast() {
		if (nextEleIdx == 0) {
			return -1;
		}

		arr[nextEleIdx - 1] = 0;
		nextEleIdx--;
		return arr[nextEleIdx - 1];
	}

	public void add(int i, int ele) {
		if (i >= nextEleIdx) {
			return;
		}

		if (nextEleIdx == arr.length) {
			doubleCapacity();
		}

		for (int j = nextEleIdx - 1; j >= i; j--) {
			arr[j + 1] = arr[j];
		}

		arr[i] = ele;
		nextEleIdx++;
	}

	public void remove(int idx) {
		if (idx >= nextEleIdx) {
			return;
		}

		for (int i = idx; i < nextEleIdx; i++) {
			arr[i] = arr[i + 1];
		}
		arr[nextEleIdx-1] = 0;
		nextEleIdx--;
	}

	public static void main(String[] args) {
		DynamicClass d1 = new DynamicClass();

		for (int i = 0; i < 100; i++) {
			d1.add(100 + i);
		}

		System.out.println(d1.get(90));
		System.out.println(d1.size());
		d1.set(1, 999);
		System.out.println(d1.get(1));

		System.out.println(d1.removeLast());
		System.out.println(d1.removeLast());

		d1.add(0, 1);
		System.out.println(d1.get(0));

		d1.remove(0);
		System.out.println(d1.get(0));
		System.out.println(d1.get(2));
	}

}
