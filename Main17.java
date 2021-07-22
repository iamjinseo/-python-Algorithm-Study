package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

//18870 ��ǥ ���� �ٽ� HashMap
public class Main17 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		int[] arr2 = Arrays.copyOf(arr, N); // ��������
		Arrays.sort(arr); // �����迭 ����

		HashMap<Integer, Integer> hm = new HashMap<>();
		/* �ؽ������� �ش� �ε����� ���� ���� �Է�? */
		int value = 0;
		for (int i = 0; i < N; i++) {
			if (!hm.containsKey(arr[i])) // �ߺ����ڿ� ���� ó��
				hm.put(arr[i], value++);
			/* �迭�� ���ĵ� ���ڿ� �ε����� ���� */
		}
		for (int i = 0; i < N; i++)
			sb.append(hm.get(arr2[i])).append(" ");
		// ���� �ȵ� �迭�� ����(Ű)�� �����ϴ� �ؽ����� value�� ���

		System.out.println(sb);
	}
}
/*
 * 03154 ���� -> 01345 0 : 0 1 : 1 3 : 2 4 : 3 5 : 4 �� ���� �����迭 03154 �� ���ڿ� �����ϴ�
 * value��? -> 02134
 */