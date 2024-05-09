import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] grade = {"A+","A0","B+","B0","C+","C0","D+","D0","F","P"};
		double[] doubleGrade = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
		int cnt = 0;
		double totalSum = 0;
        double scoreSum = 0;
		
		for(int i = 0; i < 20; i++) {
			String a = sc.nextLine();
			String[] arr = a.split(" ");
			
			for(int j = 0; j < grade.length; j++) {
				if(arr[2].equals(grade[j])) {
					totalSum += Double.parseDouble(arr[1]) * doubleGrade[j];
					if(j != 9) scoreSum += Double.parseDouble(arr[1]);
				}
			}
		}
		double average = totalSum / scoreSum;
        System.out.printf("%.6f\n", average);
	}
}