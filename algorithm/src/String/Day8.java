package String;

import java.util.Scanner;
// Question
// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 팰린드롬이라고 한다.
// 문자열이 입력되면 해당 문자열이 팰린드롬이면 "YES", 아니면 "NO"를 출력하는 프로그램을 작성하시오.
// 단 회문을 검사할 때 알파벳만 가지고 회문을 검사하며, 대소문자를 구분하지 않는다.
// 알파벳 이외의 문자들은 무시한다.
// ex) 입력 :found7, time: study; Yduts; emit, 7Dnuof   -> 출력 : YES
public class Day8 {
	public String solution(String str) {
		String answer = "NO";
//		replace에서는 정규식 사용x, replaceAll에서만 정규식 사용 가능
		str = str.toUpperCase().replaceAll("[^A-Z]", ""); //대문자 A~Z까지를 제외한 것은 빈문자열로 변환
//		System.out.println(str); 
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equals(tmp)) answer = "YES";
		
		return answer;
	}

	public static void main(String[] args) {
		Day8 T = new Day8();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		
	}
}
