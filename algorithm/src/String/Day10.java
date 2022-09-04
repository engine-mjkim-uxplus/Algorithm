package String;

import java.util.Scanner;

// Question
// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하시오.
// 입력 설명: 첫 번째 줄에 문자열 s와 문자 t가 주어진다. 문자열과 문자는 소문자로만 주어진다.
// 출력 설명: 첫 번째 줄에 각 문자열 s의 각 문자가 문자 t와 떨어진 거리를 순서대로 출력한다.
public class Day10 {
	public int[] solution(String str, char c) {
		char[] cArr = str.toCharArray();
		int[] answer = new int[str.length()];
		// ※왼쪽과 오른쪽으로 두 번 구해서 작은 값을 넣으므로 p를 0으로 초기화하면 안된다.
		int p = 1000; // 거리 변수
		// 왼쪽으로 부터의 거리
		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] == c) {
				p = 0;
				answer[i] = p;
			} else {
				p++;
				answer[i] = p;
			}
		}
		p = 1000;
		for (int i = cArr.length - 1; i >= 0; i--) {
			if (cArr[i] == c) p = 0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p); // 왼쪽에서 계산된 거리와 오른쪽 거리중 작은값을 대입
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Day10 T = new Day10();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		for (int x : T.solution(str, c)) {
			System.out.print(x + " ");
		}
	}
}
