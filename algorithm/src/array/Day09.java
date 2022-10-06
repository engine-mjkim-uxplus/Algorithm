package array;
import java.util.Arrays;
import java.util.Scanner;
// Question(격자판 최대합)

public class Day09 {
	public int solution(int n, int[][] arr) {
		int answer = 0;
		int sum1; //행의합
		int sum2; //열의합
		// 행과 열의 값 구해서 비교
		for(int i=0; i<n;i++) {
			sum1=sum2=0;
			for(int j=0; j<n; j++) {
				sum1+= arr[i][j]; // 행번호 고정(i)
				sum2+= arr[j][i]; // 열번호 고정(j)
			}
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		sum1=sum2=0;
		// 대각선의 합 구해서 비교
		for(int i=0; i<n; i++) {
			sum1+= arr[i][i];
			sum2+= arr[i][n-i-1];
			answer = Math.max(answer, sum1);
			answer = Math.max(answer, sum2);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Day09 T = new Day09();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i <n; i++) {
			for(int j=0; j<n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
	}
}
