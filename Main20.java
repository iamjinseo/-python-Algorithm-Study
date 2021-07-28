package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//15649 N�� M(1) ��Ʈ��ŷ
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
		for (int i = 0; i < N; i++) { //dfs(0)�� �� �� �ڸ� ����
			if (visit[i] == false) { //�ش� �ε��� ���� ��°�?
				/* i�� 0�̶�� 1�� ��İ� ���� �� */
				visit[i] = true; //��ٰ� ǥ�� ��
				arr[depth] = i + 1; //������ �� ���� ����(i�� 0�̸� 1)
				dfs(depth + 1); //�� ���� ������ ������ ���� dfs
				
//					public static void dfs(int depth) {
//						if (depth == M) {
//							for (int val : arr) {
//								sb.append(val).append(' ');
//							}
//							sb.append('\n');
//							return;
//						}
//						for (int i = 0; i < N; i++) { //dfs(0)�� �� �� �ڸ� ����
//							if (visit[i] == false) { //�ش� �ε��� ���� ��°�?
//								/* i�� 0�̶�� 1�� ��İ� ���� �� */
//								visit[i] = true; //��ٰ� ǥ�� ��
//								arr[depth] = i + 1; //������ �� ���� ����(i�� 0�̸� 1)
//								dfs(depth + 1); //�� ���� ������ ������ ���� dfs
//	
//								visit[i] = false; //���� ����(i�� 1�϶�)�� ���� ó��
//							}
//						}
//						return;
//					}

				visit[i] = false; //���� ����(i�� 1�϶�)�� ���� ó��
			}
		}
		return;
	}
}