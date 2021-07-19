package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//10989 ����3, �������
public class Main10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// �� �� �ִ� ���ڰ� 10000�����̱� ������ 10001
		int[] arr = new int[10001];
		int size = Integer.parseInt(br.readLine());

		for (int i = 1; i < size + 1; i++)
			arr[Integer.parseInt(br.readLine())]++;
		// �Է¹��� ���ڿ� �ش��ϴ� �ε����� �� �ø�

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10001; i++) {
			while (arr[i] > 0) { //�󵵼���ŭ ����ؾ��ϹǷ� �ε��� �� 0�� ������
				sb.append(i).append('\n');
				arr[i]--;
			}
		}
		System.out.println(sb);
	}
}
