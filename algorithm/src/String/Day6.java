package String;

import java.util.Scanner;

// Question
// 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하시오.
// 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
// 입력 : 첫 줄에 문자열이 입력됩니다. 문자열의 길이는 100을 넘지 않는다. ex) "ksekkset"
// 출력 : 첫 줄에 중복문자가 제거된 문자열을 출력한다. ex) "kset"
public class Day6 {
	public String solution(String str) {
		String answer= "";
		StringBuilder sb = new StringBuilder();
		for(int i=0; i< str.length(); i++) {
			// 본인의 위치와 발견된 위치가 같으면 중복이 없다.
			// System.out.println(str.charAt(i)+ " "+i+" "+ str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i)) == i) {
				sb.append(str.charAt(i));
			}
		}
		answer = sb.toString();
		return answer;
	}

	public static void main(String[] args) {
		Day6 T = new Day6();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		
	}
}
