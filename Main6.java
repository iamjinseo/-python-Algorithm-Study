package solve1;
// 11654번 문자 입력받아 아스키코드로
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main6 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println((int)str.charAt(0)); //0번 인덱스의 문자를 아스키코드로 출력
	}
}
