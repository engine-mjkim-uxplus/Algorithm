package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Day4 {
// Question
// N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하시오.
// - 입력 설명
// 첫 줄에 자연수 N(3<=N<=20)이 주어진다
// 두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어진다. 단어는 영어 알파벳으로만 구성되어 있다.
// - 출력설명
// N개의 단어를 입력된 순서대로 한 줄에 하나씩 뒤집어서 출력한다.

	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			// 뒤집어진 값들이 ArrayList에 저장
			answer.add(tmp);
		}	
		return  answer;
	}
	public static void main(String[] args) {
		Day4 T = new Day4();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n ; i++) {
			str[i] = sc.next();
		}
		// ArrayList도 배열의 일종으로 향상된 for문을 이용하여 값을 하나씩 꺼낼 수 있다
		// 단 저장된 자료형이 같아야한다.
		for(String x : T.solution(n,str)) {
			System.out.println(x);
		}
	}
}

// 2. lt(첫 글자)와 rt(마지막 글자)를 이용하여  특 정 자리교체
//public class Day4 {
//	public ArrayList<String> solution(int n, String[] str) {
//		ArrayList<String> answer = new ArrayList<>();
//		for(String x : str) {
//			char[] s = x.toCharArray();
//			int lt = 0, rt = x.length()-1;
//			while(lt<rt) {
//				char tmp = s[lt];
//				s[lt] = s[rt];
//				s[rt] = tmp;
//				lt++;
//				rt--;
//			}
//			String tmp = String.valueOf(s);
//			answer.add(tmp);
//			
//		}	
//		return  answer;
//	}
//	public static void main(String[] args) {
//		Day4 T = new Day4();
//		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String[] str = new String[n];
//		for(int i=0; i<n ; i++) {
//			str[i] = sc.next();
//		}
//		// ArrayList도 배열의 일종으로 향상된 for문을 이용하여 값을 하나씩 꺼낼 수 있다
//		// 단 저장된 자료형이 같아야한다.
//		for(String x : T.solution(n,str)) {
//			System.out.println(x);
//		}
//	}
//}

