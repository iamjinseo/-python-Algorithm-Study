package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//1427 ��Ʈ�λ��̵�. ����5 ���� �ڸ����� ������������ ����
/* �Է¹��� - > �� �ڸ����� �� ��
 * ���� �˰����� 4673(Main5)���� �� �������
 * ���� �迭�� �ְ� ����*/
public class Main12 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();

		while (num != 0) {
			list.add(num % 10); // ù ° �ڸ��� (9723�� 3)
			num = num / 10; // ù ° �ڸ��� ���� �� (972)
		}
		Collections.sort(list);
		Collections.reverse(list);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++)
			sb.append(list.get(i));
		System.out.println(sb);
	}
}
