import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = 9;
		int b = 9;
		int[][] arr1 = new int[a][b];
		int max = 0; 
		int[] arrNM = {1,1};
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j < b; j++) {
				arr1[i][j] = sc.nextInt();
				if(arr1[i][j] > max) {
					max = arr1[i][j];
					arrNM[0] = i + 1;
					arrNM[1] = j + 1;
				}
			}
		}
		
		System.out.println(max);
		System.out.println(arrNM[0] + " " + arrNM[1]);
	}
}