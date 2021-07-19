package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//1181 �ܾ� ����
//���̰� ª�� �ͺ���
//���̰� ������ ���� ������
/* br�� �ܾ�� �Է�
 * ���ĺ� �ҹ��ڷ� �̷���� �ܾ� �Է�(���� 50����)
 * �Էµ� �ܾ���� list�� �ִ´�
 * ����
 * */
public class Main15 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] str = new String[size];
		
		for (int i = 0; i < size; i++)
			str[i] = br.readLine();

		Arrays.sort(str, new Comparator<String>() {
			public int compare(String o1, String o2) {
				if (o1.length() == o2.length()) {
					return o1.compareTo(o2); // ������ ����
				} else {
					return o1.length() - o2.length(); // o2�� ���� �� ��� �ٲٱ�
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		sb.append(str[0]).append('\n');
		for (int i = 1; i < size; i++) {
			if (!str[i].equals(str[i - 1])) //���ڿ��񱳽� ==�� �ּҺ���
				sb.append(str[i]).append('\n');
		}
		System.out.println(sb);
	}
}
