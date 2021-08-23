package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//9093 단어 뒤집기(스택)
public class Main23 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());

		Stack<Character> stck = new Stack<>();
		for (int i = 0; i < num; i++) { //문자열 개수만큼 처리
			String str = br.readLine(); //문자열 입력
			for (int j = 0; j < str.length(); j++) { //문자열 하나에 대한 처리
				if (str.charAt(j) == ' ') { //공백을 만나면 
					while(stck.empty()==false)  
						sb.append(stck.pop()); //전부 pop
					sb.append(' ');
				} else {
					stck.add(str.charAt(j)); //공백을 안만나면 push
				}
			}
			while(stck.empty()==false) //마지막 단어 출력
				sb.append(stck.pop());
			
			sb.append('\n'); //문장 나누기
			stck.clear();
		}
		System.out.println(sb);
	}
}
