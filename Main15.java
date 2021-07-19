package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

//1181 단어 정렬
//길이가 짧은 것부터
//길이가 같으면 사전 순으로
/* br로 단어개수 입력
 * 알파벳 소문자로 이루어진 단어 입력(길이 50까지)
 * 입력된 단어들을 list에 넣는다
 * 정렬
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
					return o1.compareTo(o2); // 사전순 정렬
				} else {
					return o1.length() - o2.length(); // o2가 길이 더 길면 바꾸기
				}
			}
		});
		StringBuilder sb = new StringBuilder();
		sb.append(str[0]).append('\n');
		for (int i = 1; i < size; i++) {
			if (!str[i].equals(str[i - 1])) //문자열비교시 ==는 주소비교함
				sb.append(str[i]).append('\n');
		}
		System.out.println(sb);
	}
}
