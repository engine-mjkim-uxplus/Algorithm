package String;

import java.util.Scanner;
// Question(문자열 압축)
// 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
// 문자 바로 오른쪽에 반복 획수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
// 단 반복 횟수가 1인 경우 생략
// ex) 입력 : KKHSSSSSSSE -> 출력 : K2HS7E
public class Day11 {
	public String solution(String str) {
		String answer = "";
		str = str + " ";// 끝에 빈문자열 추가
		int cnt = 1;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) cnt++;
			else {
				answer+=str.charAt(i); // 문자열 누적
				if(cnt>1) answer+= String.valueOf(cnt); // 문자열 변경
				cnt=1; // 초기화
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Day11 T = new Day11();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String answer = T.solution(str);
		System.out.println(answer);
	}
}
