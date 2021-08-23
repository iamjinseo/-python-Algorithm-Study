package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

//9093 �ܾ� ������(����)
public class Main23 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());

		Stack<Character> stck = new Stack<>();
		for (int i = 0; i < num; i++) { //���ڿ� ������ŭ ó��
			String str = br.readLine(); //���ڿ� �Է�
			for (int j = 0; j < str.length(); j++) { //���ڿ� �ϳ��� ���� ó��
				if (str.charAt(j) == ' ') { //������ ������ 
					while(stck.empty()==false)  
						sb.append(stck.pop()); //���� pop
					sb.append(' ');
				} else {
					stck.add(str.charAt(j)); //������ �ȸ����� push
				}
			}
			while(stck.empty()==false) //������ �ܾ� ���
				sb.append(stck.pop());
			
			sb.append('\n'); //���� ������
			stck.clear();
		}
		System.out.println(sb);
	}
}
