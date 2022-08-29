package String;

import java.util.Scanner;

// Question
// 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로
// 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하시오.
public class Day2 {
	public String solution(String str) {
		char[] c = str.toCharArray();
		String answer = "";
		for(char s : c) {
		// 1. 아스키 코드로 푸는법 < 대문자:65~96 / 소문자: 97~122 >  
		if(s>=65 && s< 97) answer += (char)(s+32);
		else answer += (char)(s-32);
		// 2. Character함수로 푸는법 
//			if(Character.isUpperCase(s)) {
//				answer+= Character.toLowerCase(s);
//			} else {
//				answer += Character.toUpperCase(s);
//			}
//		}
		}
		return answer;
	}


	public static void main(String[] args) {
		Day2 T = new Day2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // next는 문자열 읽어들임
		System.out.println(T.solution(str));
	}
}
