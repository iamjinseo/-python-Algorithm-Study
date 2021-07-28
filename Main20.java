package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//15649 N과 M(1) 백트래킹
public class Main20 {
	public static int[] arr;
	public static boolean[] visit;
	public static StringBuilder sb = new StringBuilder();
	public static int N, M;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		visit = new boolean[N];
		dfs(0);
		System.out.println(sb);
	}

	public static void dfs(int depth) {
		if (depth == M) {
			for (int val : arr) {
				sb.append(val).append(' ');
			}
			sb.append('\n');
			return;
		}
		for (int i = 0; i < N; i++) { //dfs(0)일 땐 앞 자리 결정
			if (visit[i] == false) { //해당 인덱스 값을 썼는가?
				/* i가 0이라면 1을 썼냐고 묻는 것 */
				visit[i] = true; //썼다고 표시 후
				arr[depth] = i + 1; //수열의 앞 숫자 결정(i가 0이면 1)
				dfs(depth + 1); //앞 숫자 결정된 수열에 대한 dfs
				
//					public static void dfs(int depth) {
//						if (depth == M) {
//							for (int val : arr) {
//								sb.append(val).append(' ');
//							}
//							sb.append('\n');
//							return;
//						}
//						for (int i = 0; i < N; i++) { //dfs(0)일 땐 앞 자리 결정
//							if (visit[i] == false) { //해당 인덱스 값을 썼는가?
//								/* i가 0이라면 1을 썼냐고 묻는 것 */
//								visit[i] = true; //썼다고 표시 후
//								arr[depth] = i + 1; //수열의 앞 숫자 결정(i가 0이면 1)
//								dfs(depth + 1); //앞 숫자 결정된 수열에 대한 dfs
//	
//								visit[i] = false; //다음 순번(i가 1일때)를 위한 처리
//							}
//						}
//						return;
//					}

				visit[i] = false; //다음 순번(i가 1일때)를 위한 처리
			}
		}
		return;
	}
}