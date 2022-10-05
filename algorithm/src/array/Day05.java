package array;

import java.util.Scanner;

//Quetion 소수 구하기 (에라토스테네스의 체)
// 자연수 N이 입력되면 1부터 N까지 소수의 개수를 출력하는 프로그램을 작성하시오.
// 만약 20이 입력되면 1부터 20까지의 소수는 2,3,5,7,11,13,17,19로 총 8개
// 제한시간은 1초
public class Day05 {
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
