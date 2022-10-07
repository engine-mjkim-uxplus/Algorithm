package array;

import java.util.Scanner;
// Question (멘토링)
// M번의 수학테스트 등수를 가지고 멘토와 멘티를 정하려고 한다.
// 만약 A번 학생이 멘토이고, B학생이 멘티가 되는 짝이 되었다면, A학생은 M번의 수학테스트에서 모두 B학생보다 등수가 앞서야 한다.
// M번의 수학성적이 주어지면 멘토와 멘티가 되는 짝을 만들 수 있는 경우가 총 몇가지 인지 출락혀난 프로그램을 작성하시오.
public class Day12 {
	public int solution(int n, int m, int[][] arr){
		int answer=0;
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				int cnt=0;
				for(int k=0; k<m; k++){
					int pi=0, pj=0;
					for(int s=0; s<n; s++){
						if(arr[k][s]==i) pi=s;
						if(arr[k][s]==j) pj=s;
					}
					if(pi<pj) cnt++;
				}
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

