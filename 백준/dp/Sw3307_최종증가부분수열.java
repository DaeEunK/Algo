package dp;

import java.util.Scanner;

public class Sw3307_최종증가부분수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();
		
		for (int tc = 1; tc <= TC; tc++) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			int[] dp = new int[n];
					
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			int max = 1;
			
			for (int i = 0; i < n; i++) {
				dp[i] = 1;
				for (int j = 0; j < i; j++) {
					if(arr[j] < arr[i]) {
						dp[i] = Math.max(dp[i], dp[j] + 1);
					}
				}
				max = Math.max(max, dp[i]);
			}
			System.out.println("#" + tc + " " + max);
		}
	}

}
