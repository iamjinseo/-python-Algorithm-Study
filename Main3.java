package solve1;

//10818, �迭�� �ִ��ּ� ã��
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // �迭ũ��
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); // ���� ���� �̰�
		}
//		int min = arr[0];
//		int max = arr[0];
//		for (int i = 0; i < num; i++) {
//			if (arr[i] < min) { // �ּҿ� �ִ� ���ϱ�
//				min = arr[i];
//			} else if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
		/* �Ʒ� �� ���� ��¥ ¯�̴�.. */
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[num-1]);
	}
}
