package 문제다시보기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Boj4375 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        StringBuilder answer = new StringBuilder();
        while ((s=br.readLine()) != null) {
            int n = Integer.parseInt(s);
            int base = 1;
            int cnt = 1;
            while ((base=base%n) != 0) {
                cnt++;
                base = base*10+1;
            }
            answer.append(cnt).append('\n');
        }
        System.out.print(answer);
    }
}
//? ? ? ? ? 전혀
