package array;

import java.util.Scanner;
// Question (멘토링)
// M번의 수학테스트 등수를 가지고 멘토와 멘티를 정하려고 한다.
// 만약 A번 학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 한다.
// M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇가지 인지 출락혀난 프로그램을 작성하시오.
public class Day12 {
	public int solution(int n, int m, int[][] arr){
		int answer=0;
		// i,j는 학생을 의미 (멘토, 멘티)
		// i학생(멘토가 될 학생)을 기준으로 j(멘티가 될 학생)을 비교하여 
		// M(시험 횟수)번 만큼 i의 등수가 높으면 멘토,멘티 짝 경우의 수(answer++) 증가
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				// 한 회차 시험에서 i의 등수가 j의 등수보다 높으면 cnt++
				int cnt=0;
				// k = 시험 n회차, s = 등수
				for(int k=0; k < m; k++){
					int pi=0, pj=0;
					for(int s=0; s<n; s++){
						// 인데스의 값은 등수이므로
						// i학생 및 j학생은 해당 인덱스의 등수를 가진다.
						if(arr[k][s]==i) pi=s;
						if(arr[k][s]==j) pj=s;
					}
					// i(멘토 될 학생)이 j학생보다 등수가 낮으면 cnt++
					if(pi<pj) cnt++;
				}
				// 모든 시험에서 i가 j의 등수보다 높아야 하므로
				// cnt는 시험 회차(M)과 같아야 한다.
				if(cnt==m){
					answer++;
					//System.out.println(i+" "+j);
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Day12 T = new Day12();
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] arr=new int[m][n];
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.print(T.solution(n, m, arr));
	}
}

