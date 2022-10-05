package String;

import java.util.Scanner;

//Question
// 암호
// 입력 : 4 , #****###**#####**#####**##** -> COOL
public class Day12 {
	public String solution(int n, String str) {
		String answer = "";
		for(int i=0; i<n; i++) {
			String tmp = str.substring(0,7).replace('#', '1').replace('*','0'); //  replace반환값 string이므로 이어서 쓰기 가능
			int num = Integer.valueOf(tmp, 2); // 2진수 10진수로 변경
			System.out.println(tmp + " -> " + num);
			answer += (char)num;
			str=str.substring(7); // 원본값 변경(인데스 값부터 문자열 끝까지 가져온다)
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Day12 T = new Day12();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n, str));
	}
}
