package org.accionlabs;

public class PairSumInArray {
	public static void findSumPair(int[] arr, int sum) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == sum) {
					System.out.println("Sum Pair found :-" + arr[i] + " and " + arr[j]);

				}
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 9, 7, 4, 5, 6, 1 };
		int sum = 13;
		findSumPair(arr, sum);

	}

}
