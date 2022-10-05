package array;

import java.util.Scanner;

// Question (보이는 학생)
// 선생님이 N명의 학생을 일렬로 세운다. 일렬로 서 있는 학생의 키가 앞에서 부터 순서대로
// 주어질 때, 맨 앞에 서 있는 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하시오.
// (어떤 학생이 자기 앞에 서 있는 학생들 보다 크면 그 학생은 보이고, 작거나 같으면 보이지 않는다)
public class Day02 {
	public int solution(int n , int[] arr) {
		// 1. 처음 학생은 보인다.
		int answer = 1;
		// 앞에서 가장 큰 학생
		int tallest = arr[0];
		// arr[i]-> 해당 학생
		for(int i=1; i < n; i++) {
			if(tallest < arr[i]) {
				tallest = arr[i];
				answer++;
			}
		}		
		return answer;
	}
	
	public static void main(String[] args) {
		Day02 T = new Day02();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(T.solution(n,arr));
	}
}
