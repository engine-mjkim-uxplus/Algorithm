package String;

import java.util.Scanner;
import java.util.StringTokenizer;


// Question
// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하시오.
// 문장속의 각 단어는 공백으로 구분된다.
// 출력 조건: 첫줄에 가장 긴 단어를 출력한다. 가장 길이가 긴 단어가 여러개일 경우 문장속에서 
// 가장 앞쪽에 위치한 단어를 출력하시오.
// 예시 ) it is time to study -> study 출력
// 1. StringTokenizer를 활용하여 풀기
public class Day3 {
	public String solution(String str) {
		StringTokenizer st = new StringTokenizer(str," ");
		String answer = st.nextToken();
		while(st.hasMoreTokens()) {
			 String tmp = st.nextToken();
			if(answer.length() < tmp.length()) {
				answer = tmp; 
			}
		}
		return answer;
	}


	public static void main(String[] args) {
		Day3 T = new Day3();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // next는 문자열 읽어들임
		System.out.println(T.solution(str));
	}
}



// 2. String의 split을 활용하여 풀기
class Main {
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE; // 가장 작은 값으로 초기화
		String[] s = str.split(" ");
		for(String x : s) {
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
		}
				
		return answer;
	}


	public static void main(String[] args) {
		Main T = new Main();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // next는 문자열 읽어들임
		System.out.println(T.solution(str));
	}
}


class Main1 {
	public String solution(String str) {
		String answer = "";
		int m = Integer.MIN_VALUE, pos; // 변수 2개 선언하는 방법
		while((pos = str.indexOf(' ')) != -1){  // str.indexOf(' ') 띄어 쓰기 위치를 반환
			String tmp = str.substring(0, pos);	// 띄어쓰기를 발견 못하면 -1를 리턴, 발견하면 띄어쓰기 처음 발견한 인덱스 리턴
			int len = tmp.length();
			if(len > m) { // 왼쪽이 크다라고 해야 같은 길이의 단어면 앞쪽이 출력
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1); // pos는 공백을 가리키고 있음. 공백을 제외한 뒤의 문장이 str로 바뀐다
		}
		if(str.length() > m) answer = str; // 마지막 단어는 공백이 없으므로 마지막 단어 처리를 꼭 해줘야 한다.
		return answer;
	}


	public static void main(String[] args) {
		Main1 T = new Main1();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine(); // next는 문자열 읽어들임
		System.out.println(T.solution(str)); 
	}
}


