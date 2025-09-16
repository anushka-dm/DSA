// Problem Statement

// You have made a smartphone app and want to set its subscription price such that the profit earned is maximised. There are certain users who will subscribe to your app only if their budget is greater than or equal to your price.

// You will be provided with a list of size N having budgets of subscribers and you need to return the maximum profit that you can earn.

// Lets say you decide that price of your app is Rs. x and there are N number of subscribers. So maximum profit you can earn is :

//  m * x
// where m is total number of subscribers whose budget is greater than or equal to x.

import java.util.Arrays;

public class MaximumProfit {
	public static int maximumProfit(int budget[]) {
		// Write your code here
		Arrays.sort(budget);
		int length = budget.length;
		int maxProfit = 0;

		for (int i = 0; i < length; i++) {
			int price = budget[i];
			int sub = length - i;
			int profit = price * sub;
			maxProfit = Math.max(maxProfit, profit);
		}

		return maxProfit;
	}

	public static void main(String[] args) {
		int budget[] = { 20, 30, 40, 50 };

		System.out.println(maximumProfit(budget));
	}
}
