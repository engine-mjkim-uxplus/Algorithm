package array;

import java.util.ArrayList;
import java.util.Scanner;
// Question (큰 수 출력하기)
// N(1<=N<=100)개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하시오.
// 첫 번째 수는 무조건 출력한다
public class Day01 {

	public ArrayList<Integer> solution(int n , int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i=1; i < arr.length; i++) {
			 if(arr[i] > arr[i-1]){
				answer.add(arr[i]);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Day01 T = new Day01();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		// n개의 정수 입력
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.print(x+ " ");
		}
	}
}
