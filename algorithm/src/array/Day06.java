package array;

import java.util.*;
import java.util.Scanner;
// Question (뒤집은 소수)
// N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하시오
// 예로 32를 뒤집으면 23이고 , 23은 소수이다. 그러면 23을 출력한다.
// 단 910을 뒤집으면 19로 숫자화 해야한다. 첫 자리부터의 연속된 0은 무시한다.
public class Day06 {
	public boolean isPrime(int num) {
		if(num==1) return false; // 1은 소수가 아님
		// 약수가 존재하면 false
		for(int i=2; i < num; i++) {
			if(num%i == 0) return false;
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		// 넘어온 숫자 뒤집기
		for(int i=0; i<n; i++) {
			int tmp=arr[i];
			 int res = 0; // 뒤집힌 결과 담을 변수
			 while(tmp > 0) {
				 int t = tmp % 10; // 1의자리 구하기
				 res = res * 10 + t;
				 tmp = tmp / 10;
			 }
			 // 소수인지 체크 하고 소수면 list에 추가
			 if(isPrime(res)) answer.add(res);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Day06 T = new Day06();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		for(int x : T.solution(n, arr)) {
			System.out.println(x+ " ");
		}
	}
}
