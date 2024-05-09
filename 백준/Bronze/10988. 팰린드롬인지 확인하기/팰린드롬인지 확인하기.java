import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.nextLine();
		int result = 1;
		
		for(int i = 0; i < a.length()/2; i++) {
			if(a.charAt(i) != a.charAt(a.length()-i-1)) {
				result = 0;
			}
			
		}
		
		System.out.println(result);
	}
}