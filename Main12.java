package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

//1427 소트인사이드. 정렬5 수의 자리수를 내림차순으로 정렬
/* 입력받음 - > 각 자리수의 수 뜯어냄
 * 뜯어내는 알고리즘은 4673(Main5)에서 쓴 방법으로
 * 뜯어내면 배열에 넣고 정렬*/
public class Main12 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();

		while (num != 0) {
			list.add(num % 10); // 첫 째 자리수 (9723의 3)
			num = num / 10; // 첫 째 자리수 없앤 수 (972)
		}
		Collections.sort(list);
		Collections.reverse(list);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++)
			sb.append(list.get(i));
		System.out.println(sb);
	}
}
