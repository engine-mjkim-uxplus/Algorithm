package String;
import java.util.*;
// Question
// 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로
// 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하시오.
public class Day1 {
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		for(char s : str.toCharArray()) {
			if(s==t) {
				answer++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Day1 T = new Day1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // next는 문자열 읽어들임
		char c = sc.next().charAt(0);
		System.out.print(T.solution(str, c));
	}
}
