package String;

import java.util.Scanner;

// Question
// 회문문자열
// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문문자열(대칭형)이라고 한다.
// 문자열이 입력되면 해당 문자열이 회문 문자열이면 YES, 회문 문자열이 아니면 NO를 출력하는 프로그램을 작성하시오
// 단 회문을 검사할 때 대소문자를 구분하지 않는다
public class Day7 {
	public String solution(String str) {
		String answer= "No";
		// StringBuilder를 이용하여 입력받은 문자열을 뒤집어서 비교(대칭형이기 때문에 뒤집어서 같은면 "YES")
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) answer = "YES";
		
		
		return answer;
	}

	public static void main(String[] args) {
		Day7 T = new Day7();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		
	}
}
