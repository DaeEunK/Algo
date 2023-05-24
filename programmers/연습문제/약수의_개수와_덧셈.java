package programmers.연습문제;

public class 약수의_개수와_덧셈 {
	public int solution(int left, int right) {
		int answer = 0;
		for(int n = left; n <= right; n++){
			int sqrt = (int) Math.sqrt(n);
			int cnt = 0;

			// 약수
			for(int i = 1; i <= sqrt; i++)
			{
				if(n % i == 0){ // 약수 중 작은 수 저장
					cnt++;

					if(n / i != i){ // 약수 중 큰 수 저장
						cnt++;
					}
				}
			}
			if(cnt % 2 == 0) {
				answer += n;
				System.out.println(cnt);
			}
			else answer -= n;

		}
		return answer;
	}
}
