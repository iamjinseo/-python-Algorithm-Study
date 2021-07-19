package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//10989 정렬3, 계수정렬
public class Main10 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 쓸 수 있는 숫자가 10000까지이기 때문에 10001
		int[] arr = new int[10001];
		int size = Integer.parseInt(br.readLine());

		for (int i = 1; i < size + 1; i++)
			arr[Integer.parseInt(br.readLine())]++;
		// 입력받은 숫자에 해당하는 인덱스의 값 올림

		StringBuilder sb = new StringBuilder();

		for (int i = 1; i < 10001; i++) {
			while (arr[i] > 0) { //빈도수만큼 출력해야하므로 인덱스 값 0될 때까지
				sb.append(i).append('\n');
				arr[i]--;
			}
		}
		System.out.println(sb);
	}
}
