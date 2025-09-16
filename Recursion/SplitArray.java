// Problem statement

// Given an integer array A of size N, check if the input array can be divided in two groups G1 and G2 with following properties-

// - Sum of both group elements are equal
// - Group 1: All elements in the input, which are divisible by 5 
// - Group 2: All elements in the input, which are divisible by 3 (but not divisible by 5). 
// - Elements which are neither divisible by 5 nor by 3, can be put in either group G1 or G2 to satisfy the equal sum property. 
// Group 1 and Group 2 are allowed to be unordered and all the elements in the Array A must belong to only one of the groups.

// Return true, if array can be split according to the above rules, else return false.

public class SplitArray {
	public static boolean helper(int input[], int idx, int sum1, int sum2) {
		if (idx == input.length) {
			return sum1 == sum2;
		}
		int num = input[idx];

		if (num % 5 == 0) {
			return helper(input, idx + 1, sum1 + num, sum2);
		} else if (num % 3 == 0) {
			return helper(input, idx + 1, sum1, sum2 + num);
		} else {
			return helper(input, idx + 1, sum1 + num, sum2) || helper(input, idx + 1, sum1, sum2 + num);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		System.out.println(helper(arr, 0, 0, 0));
	}
}
