import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] n = new int[16];
		n[0] = 4;
		n[1] = 9;
		
		if(a > 1) {
			for(int i = 2; i <= a; i++) {
				int tmp = (int) Math.pow(2, i-1) + (int) Math.sqrt(n[i-1]);
				n[i] = tmp*tmp;
			}
		}
		System.out.println(n[a]);
	}
}