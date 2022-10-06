package array;
import java.util.Arrays;
import java.util.Scanner;
// Question (등수구하기)
// N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하시오.
// 같은 점수가 입력될 경우 높은 등수로 동일 처리한다. 즉 가장 높은 점수가 92인데 92점이 3명 존재하면
// 1등이 3명이고 그 다음 학생은 4등이 된다.
public class Day08 {
	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		for(int i=0; i <n; i++) {			
			int cnt = 1;
			for(int j=0; j <n; j++) {
				if(arr[i] < arr[j])cnt++;
			}
			answer[i] = cnt;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		Day08 T = new Day08();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i <n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr)) System.out.print(x+ " ");
	}
}
