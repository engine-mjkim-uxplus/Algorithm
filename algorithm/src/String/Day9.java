package String;

import java.util.Scanner;
// Question
// 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만든다.
// 만약 "tge0a1h205er"에서 숫자만 추출하면 0,1,2,0,5이고 이것을 자연수를 만들면 1205가 된다.(맨 앞 0은 무시)
// 추출하여 만들어지는 자연수는 100,000,000을 넘지 않는다
//1. 아스키코드 풀이
public class Day9 {
	public int solution(String str) {
		int answer = 0;
		for(char c : str.toCharArray()) {
			// 1. 아스키코드로 풀이
			if(c >= 48 && c <=57) answer = answer*10+(c-48); // -48을 하면 c가 아스키 번호로(int) 연산된다.			
		}
		return answer;
	}

	public static void main(String[] args) {
		Day9 T = new Day9();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		
	}
}
//2. Character클래스의 isDisgit()메서드 풀이
class Day {
	public int solution(String str) {
		String answer = "";
		// 
		for(char c : str.toCharArray()) {
			 if(Character.isDigit(c)) answer += c;
		}
		
		return Integer.parseInt(answer);
	}

	public static void main(String[] args) {
		Day T = new Day();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		
	}
}
