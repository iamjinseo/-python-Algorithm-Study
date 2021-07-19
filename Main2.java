package solve1;
//10591

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] values = new int[100];
		StringBuilder sb = new StringBuilder();
		String str = "";

		while ((str = br.readLine()) != null) { //Áß¿ä
			int a = str.charAt(0) - '0'; 
			int b = str.charAt(2) - '0';
			if (a == 0 && b == 0) {
				break;
			}
			sb.append((a + b)).append('\n'); 
		}
		System.out.println(sb);

	}

}
