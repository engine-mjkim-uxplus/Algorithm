package array;

import java.util.Scanner;
// Question
public class Day6 {
	public int solution(int n) {
		int answer = 0;
		// 배열 0으로 초기화
		int[] ch = new int[n+1];
		for(int i=2; i<=n; i++) {
			if(ch[i] == 0) {
				answer++;
				// j+i => 배수 구해서 배수에는 1을 채운다.
				for(int j=i; j<n; j=j+i) ch[j] = 1; 
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Day05 T = new Day05();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));	
	}
}
