package String;

import java.util.ArrayList;
import java.util.Scanner;

public class Day5 {
// Question
// 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는
// 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하시오.
// 입력설명 : 첫줄에 길이가 100을 넘지 않는 문자열이 주어진다 , ex)a#b!GE*T@S
// 출력설명 첫 줄에 알파벳만 뒤집힌 문자열을 출력한다.			ex)S#T!EG*b@a

	public String solution(String str) {
		String answer = "";
		char[] c = str.toCharArray();
		int lt = 0, rt = str.length()-1;
		while(lt < rt) {
			if(!(Character.isAlphabetic(c[lt]))) lt++;
			else if(!(Character.isAlphabetic(c[rt]))) rt--;
			else {
				char tmp =  c[lt];
				c[lt] = c[rt]; 
				c[rt] = tmp ;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(c);
		return  answer;
	}
	public static void main(String[] args) {
		Day5 T = new Day5();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str));
		}
}


