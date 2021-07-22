package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1002 �ͷ�
/* br�� �׽�Ʈ���̽� ���� �Է�
 * �� �׽�Ʈ���̽��� ���� �Է� �� ��� ó��
 *  */
public class Main19 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			
			double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)); // �����Ÿ�

			if (d == 0 && r1 == r2) { // ��������
				sb.append(-1).append('\n');			
			} else if (d == r1 + r2 || d == Math.abs(r1 - r2)) { // ��������
				sb.append(1).append('\n');
			} else if (d > r1 + r2 || d < Math.abs(r1 - r2)) { // �ȸ���
				sb.append(0).append('\n');
			} else {
				sb.append(2).append('\n');
			}
		}
		System.out.println(sb);
	}
}
/*
 * �� ������ ���� : ���� �Ÿ� < ������ �� 
 * �� �� ���� : �����Ÿ� = ������ �� 
 * �� �� ���� : �����Ÿ� = ������ ���� 
 * �ܺο��� �ȸ��� : �����Ÿ��� ������ �պ��� ŭ 
 * ���ο��� �ȸ��� : ū�� ������ > �Ÿ� + ������ ������ 
 * 		=> �Ÿ� < ������ ���� 
 * �������� : ���� ���� ������ ����
 */
