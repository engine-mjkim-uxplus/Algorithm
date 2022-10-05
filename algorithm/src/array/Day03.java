package array;

import java.util.Scanner;
// Question (가위바위보)
// 1: 가위, 2: 바위, 3: 보
public class Day03 {
	public String solution(int n, int[] aPerson, int[] bPerson) {
		String answer = "";
		
		for(int i=0; i<n; i++) {
			if(aPerson[i]==bPerson[i]) answer+= "D";
			else if(aPerson[i]==1 && bPerson[i]==3) answer+= "A";
			else if(aPerson[i]==2 && bPerson[i]==1) answer+= "A";
			else if(aPerson[i]==3 && bPerson[i]==2) answer+= "A";
			// A가 이기는 경우를 제외하면 B가 이김
			else answer+="B";
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Day03 T = new Day03();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] aPerson = new int[n];
		int[] bPerson = new int[n];
		System.out.println("A의 가위,바위,보를 " + n + "회 입력하세요");
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "회차 : ");
			aPerson[i] = sc.nextInt();
		}
		System.out.println("B의 가위,바위,보를 " + n + "회 입력하세요");
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "회차 : ");
			bPerson[i] = sc.nextInt();
		}
		System.out.println(T.solution(n, aPerson, bPerson));
	}
}
