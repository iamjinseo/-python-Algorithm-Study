package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

//18870 좌표 압축 핵심 HashMap
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
		int[] arr2 = Arrays.copyOf(arr, N); // 깊은복사
		Arrays.sort(arr); // 원래배열 정렬

		HashMap<Integer, Integer> hm = new HashMap<>();
		/* 해쉬맵으로 해당 인덱스에 대한 숫자 입력? */
		int value = 0;
		for (int i = 0; i < N; i++) {
			if (!hm.containsKey(arr[i])) // 중복숫자에 대한 처리
				hm.put(arr[i], value++);
			/* 배열에 정렬된 숫자와 인덱스를 대응 */
		}
		for (int i = 0; i < N; i++)
			sb.append(hm.get(arr2[i])).append(" ");
		// 정렬 안된 배열의 숫자(키)에 대응하는 해쉬맵의 value값 출력

		System.out.println(sb);
	}
}
/*
 * 03154 정렬 -> 01345 0 : 0 1 : 1 3 : 2 4 : 3 5 : 4 로 대응 원래배열 03154 각 숫자에 대응하는
 * value는? -> 02134
 */