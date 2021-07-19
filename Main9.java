package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//2751 정렬
public class Main9 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(); // 스트링빌더로 한꺼번에 출력하기

		int size = Integer.parseInt(br.readLine());

		// 리스트 써야 함. Arrays.sort로 하면 시간초과나서
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < size; i++)
			list.add(Integer.parseInt(br.readLine()));
		
		Collections.sort(list);
		
		for(int value : list) {
			sb.append(value).append('\n'); 
			//스트링빌더에 정렬된 값 더하기
		}
		System.out.println(sb);
	}
}
