package solve1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main8 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine(); // 단어 입력
		int time = 0;

		for (int i = 0; i < word.length(); i++) {
			int letter = word.charAt(i);
			if (letter == 'A' || letter == 'B' || letter == 'C')
				time += 3;
			else if (letter == 'D' || letter == 'E' || letter == 'F')
				time += 4;
			else if (letter == 'G' || letter == 'H' || letter == 'I')
				time += 5;
			else if (letter == 'J' || letter == 'K' || letter == 'L')
				time += 6;
			else if (letter == 'M' || letter == 'N' || letter == 'O')
				time += 7;
			else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S')
				time += 8;
			else if (letter == 'T' || letter == 'U' || letter == 'V')
				time += 9;
			else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z')
				time += 10;
		}
		System.out.println(time);
	}
}
