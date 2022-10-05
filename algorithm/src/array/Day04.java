package array;
// Question(피보나치 수열)

import java.util.ArrayList;
import java.util.Scanner;
// Question (피보나치 수열)
public class Day04 {
	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;
		for(int i=2; i < n; i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Day04 T = new Day04();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = T.solution(n);
		for(int x : arr) System.out.print(x + " ");
	}
}
