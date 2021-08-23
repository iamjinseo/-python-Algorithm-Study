package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//10828 스택
public class Main22 {
	public static int[] stack;
	public static int size = 0;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		stack = new int[n];

		while (n-- > 0) { // n번 연산 수행
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "push":
				stack[size] = Integer.parseInt(st.nextToken());
				size++;
				break;

			case "pop":
				if (size == 0)
					sb.append(-1).append('\n');
				else {
					sb.append(stack[--size]).append('\n');
					stack[size] = 0;
				}
				break;

			case "size":
				sb.append(size).append('\n');
				break;

			case "empty":
				if (size == 0)
					sb.append(1).append('\n');
				else
					sb.append(0).append('\n');
				break;

			case "top":
				if (size == 0)
					sb.append(-1).append('\n');
				else
					sb.append(stack[size - 1]).append('\n');
				break;

			default:
				break;
			}
		}
	}
}
