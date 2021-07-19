package solve1;

//10818, 배열로 최대최소 찾기
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine()); // 배열크기
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int[] arr = new int[num];
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); // 왤케 몰라 이걸
		}
//		int min = arr[0];
//		int max = arr[0];
//		for (int i = 0; i < num; i++) {
//			if (arr[i] < min) { // 최소와 최대 정하기
//				min = arr[i];
//			} else if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
		/* 아래 밑 두줄 진짜 짱이다.. */
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[num-1]);
	}
}
