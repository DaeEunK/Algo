import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] temp = {25, 10, 5, 1};
		int[][] arr = new int[a][4];
		
		for(int i = 0; i < a; i++) {
			int tmp = sc.nextInt();
			for(int j = 0; j < 4; j++) {
				System.out.print(tmp/temp[j]);
				System.out.print(' ');
				tmp = tmp % temp[j];
			}
			System.out.println();
		}
	}
}