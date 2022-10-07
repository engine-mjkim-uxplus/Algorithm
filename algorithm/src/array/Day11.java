package array;

import java.util.Scanner;
// Question (임시반장 정하기)
public class Day11 {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int max = 0;
		for(int i=1; i <=n; i++) {
			int cnt=0;
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=5; k++) {
					if(arr[i][k] == arr[j][k]) { // k는 1~5학년
						cnt++; // i번 학생과 같은 반을 한 학생을 카운트
						break; // 한번이라도 같은 반이었으면 더 이상 카운트 하지 않는다.
					}
				}
			}
			if(cnt>max) {
				max=cnt; // 제일 많이 같은 반을 했던 i번 학생의 같은반 했던 명수를 초기화
				answer = i; // 임시반장 초기화
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Day11 T = new Day11();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n+1][6]; // [1번부터 사용][1~5학년 사용]
		for(int i=1; i <= n; i++) {
			for(int j=1; j<=5; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.print(T.solution(n, arr));
	}
}

