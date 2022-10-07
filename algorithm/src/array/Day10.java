package array;

import java.util.Scanner;
// Question (봉우리)
// 지도 정보가 N*N 격자판에 주어진다. 각 격자에는 그 지역의 높이가 쓰여있다.
// 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역이다. 봉우리 지역이 몇 개 있는지 알아내는 프로그램을 작성하시오.
// 격자의 가장자리는 0으로 초기화 되었다고 가정하자.
public class Day10 {
	// 12,3,6,9시 방향에 대한 direction을 미리 만들어 둔다.
	int[] dx = {-1,0,1,0}; // 행관련 배열
	int[] dy = {0,1,0,-1}; // 열괄련 배열
	public int solution(int n, int[][] arr) {
		int answer = 0;
		for(int i =0; i<n; i++) {
			for(int j=0; j<n; j++) {
				boolean flag = true;
				for(int k=0; k<4; k++) {
					int nx=i+dx[k]; // 행 좌표
					int ny=j+dy[k]; // 열 좌표  
					if( nx>=0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j]) {
						// 봉우리가 아니다
						flag=false; 
						// 다른 방향 볼 필요 없으므로 break
						break;
					}
				}
				if(flag) answer++;
			}
		}
		

		return answer;
	}
	
	public static void main(String[] args) {
		Day10 T = new Day10();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for(int i=0; i <n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
	}
}
