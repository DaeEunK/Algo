import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] arr1 = new String[5];
		int max = 0;
		
		for(int i = 0; i < 5; i++) {
			arr1[i] = sc.nextLine();
			if(max < arr1[i].length()) max = arr1[i].length();
		}
		
		char[][] arr2 = new char[5][max];
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < arr1[i].length(); j++) {
				arr2[i][j] = arr1[i].charAt(j);
			}
		}

		String result = "";
		for(int i = 0; i < max; i++) {
			for(int j = 0; j < 5; j++) {
				result += arr2[j][i];
				result = result.trim();
			}
			result.trim();
		}
		
		System.out.print(result);
	}
}